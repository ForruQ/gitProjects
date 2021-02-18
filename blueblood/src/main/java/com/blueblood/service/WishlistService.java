package com.blueblood.service;

import com.blueblood.dao.impl.ICategoryDAO;
import com.blueblood.dao.impl.IWishlistDAO;
import com.blueblood.model.Wishlist;
import com.blueblood.service.impl.IWishlistService;
import java.util.List;

import javax.servlet.ServletContext;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "wishlistService")
public class WishlistService implements IWishlistService {

    @Autowired
    IWishlistDAO wishlistDAO;

    @Autowired
    ICategoryDAO categoryDAO;

    @Autowired
    ServletContext servletContext;

    //For multipart data
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Wishlist save(HttpServletRequest request) {
        int pId = Integer.parseInt(request.getParameter("pId"));
        String pName = request.getParameter("pName");
        String pCode = request.getParameter("pCode");
        String pPhoto = request.getParameter("pPhoto");
        double pPrice = Double.parseDouble(request.getParameter("pPrice"));
        int discount = Integer.parseInt(request.getParameter("discount"));
        int qty = 1;
        double  total = (pPrice - ((pPrice * discount)/100));
        
         Wishlist b = new Wishlist();
        Wishlist wishlist = wishlistDAO.getByProductCode(pCode);
        if(wishlist != null) {
            System.out.println("Product has allready added");  
        } else {
           
        b.setpId(pId);
        b.setpName(pName);
        b.setpCode(pCode);
        b.setpPrice(pPrice);
        b.setpPhoto(pPhoto);
        b.setQty(qty);
        b.setDiscount(discount);
        b.setTotal(total);
        wishlistDAO.save(b);
        }
        return b;
    }

    @Override
    public Wishlist update(HttpServletRequest request) {
//        Map<String, String[]> map = request.getParameterMap();
//        int i = Integer.parseInt(map.get("category")[0]);
//        Category c = categoryDAO.getById(i);
//
//        Wishlist t = new Wishlist();
//        t.setpPrice(Integer.parseInt(map.get("pId")[0]));
//        t.setpName(map.get("pName")[0]);
//        t.setpDescription(map.get("pDescription")[0]);
//        t.setpPhoto(map.get("pPhoto")[0]);
//        t.setpPrice(Integer.parseInt(map.get("pPrice")[0]));
//        t.setpDiscount(Integer.parseInt(map.get("pDiscount")[0]));
//        t.setpQuantity(Integer.parseInt(map.get("pQuantity")[0]));
//
//        return wishlistDAO.update(t);
        return null;
    }

    @Override
    public Wishlist delete(int id) {
        return wishlistDAO.delete(id);
    }

    @Override
    public List<Wishlist> getAll() {
        return wishlistDAO.getAll();
    }

    @Override
    public Wishlist getById(int id) {
        return wishlistDAO.getById(id);
    }

    @Override
    public String deleteByCid(int cId) {
        return wishlistDAO.deleteByCid(cId);
    }

    @Override
    public long getWishlistCount() {
        return wishlistDAO.getWishlistCount();
    }

    @Override
    public Wishlist getByProductCode(String pCode) {
    return wishlistDAO.getByProductCode(pCode);
    }

}
