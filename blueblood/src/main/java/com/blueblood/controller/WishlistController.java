package com.blueblood.controller;

import com.blueblood.controller.impl.IWishlistController;
import com.blueblood.dao.impl.IWishlistDAO;
import com.blueblood.model.Wishlist;
import com.blueblood.model.Wishlist;
import com.blueblood.model.Product;
import com.blueblood.service.impl.IBasketService;
import com.blueblood.service.impl.IWishlistService;
import com.blueblood.service.impl.IWishlistService;
import com.blueblood.service.impl.IProductService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping(value = "wishlist")
public class WishlistController implements IWishlistController {

    @Autowired
    IWishlistService wishlistService;
    @Autowired
    IWishlistDAO wishlistDAO;
    @Autowired
    IProductService productService;
    @Autowired
    IBasketService basketService;




    @Override
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        List<Category> catList = categoryService.getAll();
//        map.put("catList", catList);
        return new ModelAndView("wishlist/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Wishlist t = wishlistService.save(request);
        return new ModelAndView("redirect:/home/category");

    }

    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Wishlist c = wishlistService.getById(id);
        c.setpId(id);
        return new ModelAndView("wishlist/create", "c", c);
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Wishlist c = wishlistService.update(request);
        return new ModelAndView("wishlist/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
        Wishlist c = wishlistService.delete(id);
        return new ModelAndView("redirect:/wishlist/view");
    }

    //To View
    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Wishlist> pList = wishlistService.getAll();
         long count = basketService.getBasketCount();
       long wishlistCount = wishlistService.getWishlistCount() ;
        map.put("wishlistCount", wishlistCount);
        map.put("count", count);
        map.put("pList", pList);
        return new ModelAndView("wishlist/view", "map", map);
    }

    //To show wishlist in Cart
    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ModelAndView category() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Wishlist> pList = wishlistService.getAll();
        map.put("pList", pList);
        return new ModelAndView("home/category", "map", map);
    }

   //To return update page
   @RequestMapping(value = "/updateView")
    public ModelAndView updateView() {
        return new ModelAndView("wishlist/update");
    }
    
    //method for search wishlist
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(HttpServletRequest request) {
        int pId = Integer.parseInt(request.getParameter("pId"));
        Wishlist wishlist = wishlistService.getById(pId);
        //wishlist.se(pId);
        return new ModelAndView("wishlist/create", "wishlist", wishlist);
    }
    
     @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cart() {
       Map<String, Object> map = new HashMap<String, Object>();
       long count = wishlistService.getWishlistCount();
        List<Wishlist> bList = wishlistService.getAll();
        map.put("bList", bList);
        map.put("count", count);
        return new ModelAndView("cart/cart", "map", map);
    }

}
