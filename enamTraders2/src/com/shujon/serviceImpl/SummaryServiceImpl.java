/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.Product;
import com.shujon.pojo.Summary;
import com.shujon.service.CommonServiceAdapter;
import static com.shujon.serviceImpl.PurchaseServiceImpl.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class SummaryServiceImpl extends CommonServiceAdapter<Summary> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Summary t) {
        String sql = "insert into summary(product_id, pqty, sqty, aqty, last_update) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getTotalPurchaseQty());
            ps.setInt(3, t.getTotalSalesQty());
            ps.setInt(4, t.getAvailableQty());

            ps.setTimestamp(5, Timestamp.valueOf(t.getLastUpdate()));
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Summary t) {
        String sql = "update summary set product_id=?, pqty=?,sqty=?,aqty=?, last_update=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getTotalPurchaseQty());
            ps.setInt(3, t.getTotalSalesQty());
            ps.setInt(4, t.getAvailableQty());
            ps.setTimestamp(5, Timestamp.valueOf(t.getLastUpdate()));
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Summary get(int id) {
        Summary summary = null;
        String sql = "select * from summary where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                summary = new Summary(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("pqty"),
                        rs.getInt("sqty"), rs.getInt("aqty"), rs.getTimestamp("last_update").toLocalDateTime());
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

    @Override
    public Summary getByProductId(int id) {
        Summary summary = null;
        String sql = "select * from summary where product_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                summary = new Summary(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("pqty"),
                        rs.getInt("sqty"), rs.getInt("aqty"), rs.getTimestamp("last_update").toLocalDateTime());
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> summarys = new ArrayList<>();
        String sql = "select * from summary";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Summary summary = new Summary(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("pqty"),
                        rs.getInt("sqty"), rs.getInt("aqty"), rs.getTimestamp("last_update").toLocalDateTime());
                summarys.add(summary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return summarys;
    }

    @Override
    public void createTable() {
        String sql = "create table summary(id int(5) primary key auto_increment,"
                + "product_id int(11) not null ,"
                + "pqty int(11) not null,"
                + "sqty int(11) not null,"
                + "aqty int(11) not null,"
                + "last_update datetime,"
                + "foreign key (product_id) references product(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        String sql = "delete from summary where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
