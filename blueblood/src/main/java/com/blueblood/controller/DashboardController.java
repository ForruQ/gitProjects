
package com.blueblood.controller;


import com.blueblood.dao.impl.IDeliveredDAO;
import com.blueblood.model.Delivered;
import com.blueblood.model.Invoice;
import com.blueblood.model.Stock;
import com.blueblood.service.impl.IDeliveredService;
import com.blueblood.service.impl.IInvoice1Service;
import com.blueblood.service.impl.IInvoiceService;
import com.blueblood.service.impl.IStockService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "dash")
public class DashboardController {
    @Autowired
    IStockService stockService;
    @Autowired
    IInvoice1Service invoice1Service;
    @Autowired
    IInvoiceService invoiceService;
    @Autowired
    IDeliveredService deliveredService;
    
    
    @RequestMapping(value = "/dash")
    public ModelAndView dash(){
        int totalIncome = (int) stockService.totalIncome();
        int totalCost = (int)stockService.totalCost();
        int totalSales = (int)stockService.totalSales();
        int investment = (int)stockService.investment();
        long count = invoice1Service.getCountbyCid();
        List<Invoice> iList = invoiceService.getAll();
        System.out.println(count + "..........................");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("totalIncome", totalIncome);
        map.put("totalCost", totalCost);
        map.put("totalSales", totalSales);
        map.put("investment", investment);
        map.put("iList", iList);
        return new ModelAndView("dash/dash", "map", map);
    }
    @RequestMapping(value = "/stock")
    public String stock(){
        return "dash/stock";
    }
     @RequestMapping(value = "/sales")
    public ModelAndView reports(){
        int oCount = (int)invoiceService.getCount();
        int dCount = (int)invoice1Service.getCount();
        int totalSales = (int)stockService.totalSales();
//        double investment = stockService.investment();
        int count = (int)invoice1Service.getCountbyCid();
        List<Stock> qList = stockService.getTopSelelingProductQty();
        List<Stock> vList = stockService.getTopSelelingProductValue();
        List<Stock> pList = stockService.getTopSelelingProductByProfit();

        List<Delivered> dList = deliveredService.getByDays();
        List<Delivered> wList = deliveredService.getByWeaks();
        List<Delivered> mList = deliveredService.getByMonths();
        List<Delivered> yList = deliveredService.getByYears();
       
        int todaysSales = (int)deliveredService.getTodaysSales();
        int currentWeek = (int)deliveredService.getCurrentWeek();
        int previousWeek = (int)deliveredService.getPreviousWeek();
        int currentMonth = (int)deliveredService.getCurrentMonth();
        int currentyear = (int)deliveredService.getCurrentYear();
         

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oCount", oCount);
        map.put("dCount", dCount);
        map.put("totalSales", totalSales);
        map.put("count", count);
        map.put("qList", qList);
        map.put("vList", vList);
        map.put("pList", pList);
        map.put("dList", dList);
        map.put("wList", wList);
        map.put("mList", mList);
        map.put("yList", yList);
        map.put("todaysSales", todaysSales);
        map.put("currentWeek", currentWeek);
        map.put("previousWeek", previousWeek);
        map.put("currentMonth", currentMonth);
        map.put("currentyear", currentyear);

        return new ModelAndView("reports/sales", "map", map);
    }
   
    @RequestMapping(value = "/dailySales")
    public ModelAndView todaysSales(){
        List<Delivered> dList = deliveredService.getByDays();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("dList", dList);
        return new ModelAndView("reports/todaysSales", "map", map);
    }
   @RequestMapping(value = "/weeklySales")
    public ModelAndView weeksSales(){
        List<Delivered> wList = deliveredService.getByWeaks();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("wList", wList);
        return new ModelAndView("reports/weeksSales", "map", map);
    }
    @RequestMapping(value = "/monthlySales")
    public ModelAndView monthlySales(){
        List<Delivered> mList = deliveredService.getByMonths();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("mList", mList);
        return new ModelAndView("reports/monthlySales", "map", map);
    }
    @RequestMapping(value = "/yearlySales")
    public ModelAndView yearlySales(){
        List<Delivered> yList = deliveredService.getByYears();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("yList", yList);
        return new ModelAndView("reports/yearlySales", "map", map);
    }
    @RequestMapping(value = "/topProduct")
    public ModelAndView topProduct(){
       List<Stock> qList = stockService.getTopSelelingProductQty();
        List<Stock> vList = stockService.getTopSelelingProductValue();
        List<Stock> pList = stockService.getTopSelelingProductByProfit();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("qList", qList);
        map.put("vList", vList);
        map.put("pList", pList);
        return new ModelAndView("reports/topProduct", "map", map);
    }
    
    @RequestMapping(value = "/salesByCustomer")
    public ModelAndView salesByCustomer(){
        List<Delivered> cList = deliveredService.getByCustomer();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cList", cList);
        return new ModelAndView("reports/salesByCustomer", "map", map);
    }

    @RequestMapping(value = "/salesByProduct")
    public ModelAndView salesByProduct(){
        List<Delivered> cList = deliveredService.getByProduct();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("cList", cList);
        return new ModelAndView("reports/salesByProduct", "map", map);
    }
}
