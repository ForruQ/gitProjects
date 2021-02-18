package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.DailySales;
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



public class DailySalesServiceImpl extends CommonServiceAdapter<DailySales> {

    static Connection con = DbConnection.getInstance();

    @Override
    public void save(DailySales t) {
        String sql = "insert into daily_sales(show_date, last_sales, todays_sales, total_sales) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, Timestamp.valueOf(t.getShowDate()));
            ps.setDouble(2, t.getLastSales());
            ps.setDouble(3, t.getTodaysSales());
            ps.setDouble(4, t.getTotalSales());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(DailySalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public DailySales get(int id) {
        DailySales dailySales = null;
        String sql = "select * from sales where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //Product(int id, String name, String code, String photoUrl, Category category, boolean status, String note)
              dailySales = new DailySales(rs.getInt("id"), rs.getTimestamp("show_date").toLocalDateTime(), rs.getDouble("last_sales"), 
                        rs.getDouble("todays_sales"),  rs.getDouble("total_sales"));
         
            }

        } catch (SQLException ex) {
            Logger.getLogger(DailySalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dailySales;
    }

    @Override
    public List<DailySales> getList() {
        List<DailySales> saleses = new ArrayList<>();
        String sql = "select * from daily_sales";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DailySales dailySales = new DailySales(rs.getInt("id"), rs.getTimestamp("show_date").toLocalDateTime(), rs.getDouble("last_sales"), 
                        rs.getDouble("todays_sales"),  rs.getDouble("total_sales"));
                saleses.add(dailySales);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DailySalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return saleses;
    }

    @Override
    public void createTable() {
        String sql = "create table daily_sales(id int(5) primary key auto_increment,"
                + "show_date datetime,"
                + "last_sales double,"
                + "todays_sales double not null,"
                + "total_sales double unique)";
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
    public void update(DailySales t) {
        String sql = "update daily_sales set show_date=?, last_sales=?, todays_sales=?, total_sales=?, where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setTimestamp(1, Timestamp.valueOf(t.getShowDate()));
            ps.setDouble(2, t.getLastSales());
            ps.setDouble(3, t.getTodaysSales());
            ps.setDouble(4, t.getTotalSales());
            ps.setInt(5, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(DailySalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<DailySales> getListById() {
        List<DailySales> saleses = new ArrayList<>();
        String sql = "select * from daily_sales where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DailySales dailySales = new DailySales(rs.getInt("id"), rs.getTimestamp("show_date").toLocalDateTime(), rs.getDouble("last_sales"), 
                        rs.getDouble("todays_sales"),  rs.getDouble("total_sales"));
                saleses.add(dailySales);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DailySalesServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return saleses;
    }

}
