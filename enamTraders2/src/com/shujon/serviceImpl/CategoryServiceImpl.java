/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shujon.serviceImpl;

import com.shujon.connection.DbConnection;
import com.shujon.pojo.Category;
import com.shujon.service.CommonServiceAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class CategoryServiceImpl extends CommonServiceAdapter<Category>{
    static Connection con = DbConnection.getInstance();

    @Override
    public void save(Category t) {
        String sql = "insert into category(name, code, note) values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCode());
            ps.setString(3, t.getNote());
            ps.executeUpdate();
            System.out.println("::::: Data Inserted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Category t) {
        String sql = "update category set name=?, code=?,note=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCode());
            ps.setString(3, t.getNote());
            ps.setInt(4, t.getId());
            ps.executeUpdate();
            System.out.println("::::: Data Updated Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from category where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("::::: Data Deleted Successfully :::::");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Category get(int id) {
        Category category = null;
        String sql = "select * from category where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("note"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

    @Override
    public Category getByName(String name) {
        Category category = null;
        String sql = "select * from category where name=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("note"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

    @Override
    public Category getCategoryByCatId(int id) {
        Category category = null;
        String sql = "select distinct  c.id ,c.name,c.code, c.note from category c, product p where c.id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("note"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

    @Override
    public List<Category> getList() {
        List<Category> categorys = new ArrayList<>();
        String sql = "select * from category";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt("id"), rs.getString("name"), rs.getString("code"),
                        rs.getString("note"));
                categorys.add(category);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categorys;
    }

    @Override
    public void createTable() {
        String sql = "create table category(id int(5) primary key auto_increment,"
                + " name varchar(50) not null unique,"
                + "code varchar(50) not null unique,"
                + "note varchar(500) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("::::: Table Created :::::");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
