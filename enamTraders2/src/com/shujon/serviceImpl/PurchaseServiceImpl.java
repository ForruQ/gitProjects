package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.Product;
import com.shujon.pojo.Purchase;
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

public class PurchaseServiceImpl extends CommonServiceAdapter<Purchase> {

   static Connection con = DbConnection.getInstance();

    @Override
    public void save(Purchase t) {
        String sql = "insert into purchase(product_id, qty, unit_price, total_price, purchase_date) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getQty());
            ps.setDouble(3, t.getUnitPrice());
            ps.setDouble(4, t.getTotalPrice());
            ps.setTimestamp(5, Timestamp.valueOf(t.getPurchaseDateTime()));
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Purchase get(int id) {
        Purchase purchase = null;
        String sql = "select * from purchase where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                purchase = new Purchase(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("qty"),
                        rs.getDouble("unit_price"), rs.getDouble("total_price"), rs.getTimestamp("purchase_date").toLocalDateTime());
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }

    @Override
    public List<Purchase> getList() {
        List<Purchase> purchases = new ArrayList<>();
        String sql = "select * from purchase";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Purchase purchase = new Purchase(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("qty"),
                        rs.getDouble("unit_price"), rs.getDouble("total_price"), rs.getTimestamp("purchase_date").toLocalDateTime());
                purchases.add(purchase);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return purchases;
    }

    @Override
    public void createTable() {
        String sql = "create table purchase(id int(5) primary key auto_increment,"
                + "product_id int(11) not null,"
                + "qty int(11) not null,"
                + "unit_price double not null,"
                + "total_price double not null,"
                + "purchase_date datetime,"
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
    public void update(Purchase t) {
       String sql = "update purchase set product_id=?, qty=?, unit_price=?, total_price=?, total, purchase_date=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, t.getProduct().getId());
            ps.setInt(2, t.getQty());
            ps.setDouble(3, t.getUnitPrice());
            ps.setDouble(4, t.getTotalPrice());
            ps.setTimestamp(5, Timestamp.valueOf(t.getPurchaseDateTime()));
             ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    @Override
    public void delete(int id) {
        String sql = "delete from purchase where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Purchase getByProductId(int id) {
        Purchase purchase = null;
        String sql = "select * from purchase where product_id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                purchase = new Purchase(rs.getInt("id"), new Product(rs.getInt("product_id")), rs.getInt("qty"),
                        rs.getDouble("unit_price"), rs.getDouble("total_price"), rs.getTimestamp("purchase_date").toLocalDateTime());
            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    
}
