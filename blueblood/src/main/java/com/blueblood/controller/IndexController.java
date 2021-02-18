
package com.blueblood.controller;

import com.blueblood.service.impl.IBasketService;
import com.blueblood.service.impl.IWishlistService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @Autowired
    IBasketService basketService;
    @Autowired
    IWishlistService wishlistService;
    
    
    @RequestMapping(value = "")
    public ModelAndView home(){
        Map<String, Object> map = new HashMap<String, Object>();
        long count = basketService.getBasketCount();
         long wishlistCount = wishlistService.getWishlistCount();
         map.put("wishlistCount", wishlistCount);
        map.put("count", count);
        return new ModelAndView("home/index", "map", map);
    }
    @RequestMapping(value = "/dash")
    public String dash(){
        return "common/dashboard";
    }
 
     
}
