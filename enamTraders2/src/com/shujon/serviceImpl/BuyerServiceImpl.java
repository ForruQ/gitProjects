
package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.Buyer;
import com.shujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BuyerServiceImpl extends CommonServiceAdapter<Buyer> {
    
    static Connection con = DbConnection.getInstance();
    
    @Override
    public void save(Buyer t) {
        String sql = "insert into buyer(name, mobile,village, post, thana) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getMobile());
            ps.setString(3, t.getVillage());
            ps.setString(4, t.getPost());
            ps.setString(5, t.getThana());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(BuyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void update(Buyer t) {
        String sql = "update buyer set name=?, mobile=?,village=?, post=?,thana=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getMobile());
            ps.setString(3, t.getVillage());
            ps.setString(4, t.getPost());
            ps.setString(5, t.getThana());
            ps.setInt(6, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(BuyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void delete(int id) {
        String sql = "delete from buyer where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(BuyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Buyer get(int id) {
        Buyer buyer = null;
        String sql = "select * from buyer where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
                buyer = new Buyer(rs.getInt("id"), rs.getString("name"), rs.getString("mobile"),
                                  rs.getString("village"), rs.getString("post"),rs.getString("thana"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BuyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buyer;
    }
    
    
    @Override
    public List<Buyer> getList() {
        List<Buyer> buyers = new ArrayList<>();
        String sql = "select * from buyer";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 Buyer  buyer = new Buyer(rs.getInt("id"), rs.getString("name"), rs.getString("mobile"),
                                  rs.getString("village"), rs.getString("post"),rs.getString("thana"));
                buyers.add(buyer);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BuyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return buyers;
    }
    
    
    @Override
    public void createTable() {
        String sql = "create table buyer(id int(5) primary key auto_increment,"
                + "name varchar(50),"
                + "mobile varchar(50),"
                + "village varchar(50),"
                + "post varchar(50),"
                + "thana varchar(50))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
}
