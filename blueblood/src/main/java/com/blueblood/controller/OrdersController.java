
package com.blueblood.controller;




import com.blueblood.model.Orders;
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
import com.blueblood.service.impl.IOrdersService;
import com.blueblood.controller.impl.IOrdersController;
import com.blueblood.model.Address;
import com.blueblood.model.Delivered;
import com.blueblood.model.Invoice;
import com.blueblood.model.Invoice1;
import com.blueblood.model.Payment;
import com.blueblood.service.InvoiceService;
import com.blueblood.service.impl.IAddressService;
import com.blueblood.service.impl.IDeliveredService;
import com.blueblood.service.impl.IInvoice1Service;
import com.blueblood.service.impl.IInvoiceService;
import com.blueblood.service.impl.IPaymentService;
import com.blueblood.service.impl.IStockService;
import com.blueblood.service.impl.ITemporaryTableService;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping(value = "orders")
public class OrdersController implements IOrdersController{
    @Autowired
    IOrdersService ordersService;
    @Autowired
    IInvoiceService invoiceService;
    @Autowired
    ITemporaryTableService temporaryTableService;
    @Autowired
    IInvoice1Service invoice1Service;
    @Autowired
    IDeliveredService deliveredService;
    @Autowired
    IStockService stockService;
    @Autowired
    IInvoice1Service invoice1Service1;
    @Autowired
    IAddressService addressService;
    @Autowired
    IPaymentService paymentService;
    

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        
        return new ModelAndView("orders/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
      Orders t = ordersService.save(request);
      int cId = Integer.parseInt(request.getParameter("cId"));
        temporaryTableService.deleteByCid(cId);
        Map<String, Object> map = new HashMap<>();
        map.put("t", t);
        return new ModelAndView("/home/checkout5", "map", map);
       
    }

    @Override
        @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Orders c = ordersService.getById(id);
        c.setoId(id);
       return new ModelAndView("orders/update", "c", c);
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Orders c =  ordersService.update(request);
        return new ModelAndView("orders/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
    Orders c = ordersService.delete(id);
    
       return new ModelAndView("redirect:/orders/view");    
    }

    @Override
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ModelAndView getAll() {
    Map<String, Object> map = new HashMap<String, Object>();
    List<Orders> cList = ordersService.getAll();
    map.put("cList", cList);
    return new ModelAndView("orders/view", "map", map);
    }

    //Getting order details
      @RequestMapping(value = "/details", method = RequestMethod.GET)
    public ModelAndView details(HttpServletRequest request) {
    Map<String, Object> map = new HashMap<String, Object>();
    List<Invoice> iList = invoiceService.getAll();
    map.put("iList", iList);
    return new ModelAndView("orders/view", "map", map);
    }
    //Getting Completed order details
      @RequestMapping(value = "/details1", method = RequestMethod.GET)
    public ModelAndView details1(HttpServletRequest request) {
    Map<String, Object> map = new HashMap<String, Object>();
    List<Invoice1> iList = invoice1Service.getAll();
    map.put("iList", iList);
    return new ModelAndView("orders/view", "map", map);
    }
    
    //Getting product details for Orders
     @RequestMapping(value = "/pDetails/{orderNo}", method = RequestMethod.GET)
    public ModelAndView getByOrderNo(@PathVariable("orderNo") int orderNo){
        Map<String, Object> map = new HashMap<String, Object>();
       List<Orders> oList =  ordersService.getByOrderNo(orderNo);
       map.put("oList", oList);
       return new ModelAndView("orders/pDetails", "map", map);  
    }
    //Getting product details for completed Orders
     @RequestMapping(value = "/pDetails1/{orderNo}", method = RequestMethod.GET)
    public ModelAndView getByOrderNo1(@PathVariable("orderNo") int orderNo){
        Map<String, Object> map = new HashMap<String, Object>();
       List<Delivered> oList =  deliveredService.getByOrderNo(orderNo);
       map.put("oList", oList);
       return new ModelAndView("orders/pDetails", "map", map);  
    }
    
    //Getting invoice for Order
      @RequestMapping(value = "/invoice/{orderNo}", method = RequestMethod.GET)
    public ModelAndView getByOrderNo(HttpServletRequest request, @PathVariable("orderNo") int orderNo){
       
        Map<String, Object> map = new HashMap<String, Object>();
//        int cid = Integer.parseInt(request.getParameter("cid"));
//       
//          System.out.println(cid+ "...................");
//        Address address = addressService.getByCid(cid);
        Invoice invoice = invoiceService.getByOrderNo(orderNo) ;
        List<Orders> oList = ordersService.getByOrderNo(orderNo);
        
       map.put("invoice", invoice);
       map.put("oList", oList);
//       map.put("address", address);
       return new ModelAndView("orders/invoice", "map", map);  
    }
    //Getting invoice for completed Order
      @RequestMapping(value = "/invoice1/{orderNo}", method = RequestMethod.GET)
    public ModelAndView getByOrderNo1(ModelMap map, @PathVariable("orderNo") int orderNo){
        Invoice1 invoice = invoice1Service.getByOrderNo(orderNo) ;
        List<Delivered> oList = deliveredService.getByOrderNo(orderNo);
       map.addAttribute("invoice", invoice);
       return new ModelAndView("orders/invoice", "oList", oList);  
    }
    
    //orders view
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView viewWithOrders() {
    Map<String, Object> map = new HashMap<String, Object>();
    List<Orders> cList = ordersService.getAll();
  
    map.put("cList", cList);
    return new ModelAndView("orders/view", "map", map);
    }
    
    //Getting Confirmation page to confirm ordered Delivered
     @RequestMapping(value = "/confirm/{orderNo}", method = RequestMethod.GET)
    public ModelAndView confirm(ModelMap map, @PathVariable("orderNo") int orderNo){
        Invoice invoice = invoiceService.getByOrderNo(orderNo) ;
        List<Orders> oList = ordersService.getByOrderNo(orderNo);
       map.addAttribute("invoice", invoice);
       return new ModelAndView("orders/confirm", "oList", oList);  
    }
    //Save orders after delivered
     @RequestMapping(value = "/delivered", method = RequestMethod.POST)
    public ModelAndView delivered(HttpServletRequest request){
        int orderNo = Integer.parseInt(request.getParameter("orderNo"));
        deliveredService.save(request);
        invoice1Service.save(request);
        stockService.save(request);
        
        ordersService.deleteByOrderNo(orderNo);
        invoiceService.deleteByOrderNo(orderNo);
       return new ModelAndView("redirect:/orders/details");  
    }
    

    //Getting order details
      @RequestMapping(value = "/dView", method = RequestMethod.GET)
    public ModelAndView dView(HttpServletRequest request) {
    Map<String, Object> map = new HashMap<String, Object>();
    List<Invoice1> iList = invoice1Service.getAll();
    map.put("iList", iList);
    return new ModelAndView("orders/dView", "map", map);
    }
    
    @RequestMapping(value = "/deleteByOrderNo/{orderNo}", method = RequestMethod.GET)
    public ModelAndView deleteByOrderNo(@PathVariable("orderNo") int orderNo) {
    ordersService.deleteByOrderNo(orderNo);
    invoiceService.deleteByOrderNo(orderNo);

       return new ModelAndView("redirect:/orders/details");    
    }
    
    @RequestMapping(value = "/payment/{cId}", method = RequestMethod.GET)
    public ModelAndView payment(@PathVariable("cId") int cId){
        Map<String, Object> map = new HashMap<>();
        Payment payment = paymentService.getBycId(cId) ;
        map.put("payment", payment);
       return new ModelAndView("orders/payment", "map", map);  
    }

}
