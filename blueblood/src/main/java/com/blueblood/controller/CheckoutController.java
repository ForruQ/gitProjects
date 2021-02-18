
package com.blueblood.controller;

import com.blueblood.model.Basket;
import com.blueblood.model.TemporaryTable;
import com.blueblood.service.impl.IBasketService;
import com.blueblood.service.impl.ITemporaryTableService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.blueblood.dao.impl.IPaymentDAO;
import com.blueblood.service.impl.IPaymentService;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "checkout")
public class CheckoutController {
    @Autowired
    IBasketService basketService;
    @Autowired
    ITemporaryTableService temporaryTableService;
    @Autowired
    IPaymentService paymentService;
    
   @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public ModelAndView cart() {
       Map<String, Object> map = new HashMap<String, Object>();
        List<Basket> bList = basketService.getAll();
        map.put("bList", bList);
        return new ModelAndView("cart/cart", "map", map);
    }
    @RequestMapping(value = "/checkout4", method = RequestMethod.GET)
    public ModelAndView checkout4(HttpServletRequest  request) {
        paymentService.save(request);
       Map<String, Object> map = new HashMap<String, Object>();
        List<TemporaryTable> tList = temporaryTableService.getAll();
        map.put("tList", tList);
        return new ModelAndView("home/checkout4", "map", map);
    }  
    
    @RequestMapping(value = "/checkout3", method = RequestMethod.GET)
    public ModelAndView checkout3() {
       Map<String, Object> map = new HashMap<String, Object>();
        List<TemporaryTable> tList = temporaryTableService.getAll();
        map.put("tList", tList);
        return new ModelAndView("home/checkout3", "map", map);
    }  
    
}
