package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.Product;
import com.shujon.pojo.Sales;
import com.shujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesServiceImpl extends CommonServiceAdapter<Sales> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Sales t) {
        String sql = "insert into sales(product_id, qty, unit_price, total_price, sales_date) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getQty());
            ps.setDouble(3, t.getUnitPrice());
            ps.setDouble(4, t.getTotalPrice());
            ps.setTimestamp(5, Timestamp.valueOf(t.getSalesDateTime()));
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Sales get(int id) {
        Sales sales = null;
        String sql = "select * from sales where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                sales = new Sales(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("qty"),
                        rs.getDouble("unit_price"), rs.getDouble("total_price"), rs.getTimestamp("sales_date").toLocalDateTime());
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sales;
    }

    @Override
    public List<Sales> getList() {
        List<Sales> saleses = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("qty"),
                        rs.getDouble("unit_price"), rs.getDouble("total_price"), rs.getTimestamp("sales_date").toLocalDateTime());
                saleses.add(sales);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return saleses;
    }

    @Override
    public void createTable() {
        String sql = "create table sales(id int(5) primary key auto_increment,"
                + "product_id int(11) not null,"
                + "qty int(11) not null,"
                + "unit_price double not null,"
                + "total_price double not null,"
                + "sales_date datetime,"
                + " foreign key (product_id) references product(id))";
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sales t) {
        String sql = "update sales product_id=?, qty=?, unit_price=?, total_price=?, sales_date=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getQty());
            ps.setDouble(3, t.getUnitPrice());
            ps.setDouble(4, t.getTotalPrice());
            ps.setTimestamp(5, Timestamp.valueOf(t.getSalesDateTime()));
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(SalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
