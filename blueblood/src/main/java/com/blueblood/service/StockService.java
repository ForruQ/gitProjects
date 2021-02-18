package com.blueblood.service;

import com.blueblood.dao.impl.ICategoryDAO;
import com.blueblood.dao.impl.IStockDAO;
import com.blueblood.model.Stock;
import com.blueblood.service.impl.IStockService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "stockService")
public class StockService implements IStockService {

    @Autowired
    IStockDAO stockDAO;

    @Autowired
    ICategoryDAO categoryDAO;
    
    
     

    //This  method will not be used 
    @Override
    public Stock save(HttpServletRequest request) {
      Map<String, String[]> map = request.getParameterMap();
        String[] ids = map.get("ids[]");
        String[] pId = (String[]) map.get("pId[]");
        String[] pName = (String[]) map.get("pName[]");
        String[] pCode = (String[]) map.get("pCode[]");
        String[] pPhoto = (String[]) map.get("pPhoto[]");
        String[] sPrice = (String[]) map.get("pPrice[]");
        String[] discount = (String[]) map.get("discount[]");
        String[] qty = (String[]) map.get("qty[]");
        String[] total = (String[]) map.get("total[]");
        String[] cId = (String[]) map.get("cId[]");
        int cid = Integer.parseInt(request.getParameter("cId"));
        String code = request.getParameter("pCode");
        
        
//      Stock stock = stockDAO.getByProductCode(code);
      Stock s = new Stock();
//        if (stock != null) {
//            System.out.println("Not null");
////            Stock s = new Stock();
              for (int i = 0; i < ids.length; i++) {
             Stock stock = stockDAO.getByProductCode(pCode[i]);
            s.setId(stock.getId());
             s.setpId(stock.getpId());
             s.setpName(stock.getpName());
             s.setpCode(stock.getpCode());
            s.setpPrice(stock.getpPrice());
            int lastQty = stock.getQty();
            int updateQty = Integer.parseInt(qty[i]);
            int finalQty = (lastQty - updateQty);
            s.setQty(finalQty);
//            double lastTotal = stock.getTotalCost();
//            double updateTotal = lastTotal + grandTotal;
            s.setTotalCost(stock.getTotalCost());
            double salesPrice = (Double.parseDouble(total[i])/Integer.parseInt(qty[i]));
                   
            s.setsPrice(salesPrice);
            double lastSales = stock.getTotalSales();
            double updateSales = Double.parseDouble(total[i]);
            double totalSales = lastSales + updateSales;
            s.setTotalSales(totalSales);
            //Getting Profit
            double pPrice = stock.getpPrice();
            double sales = Double.parseDouble(total[i]);
            int quantity = Integer.parseInt(qty[i]);
           double purchase = (pPrice * quantity);
           double profits = sales - purchase;
           double lastProfit = stock.getProfit();
           double updateProfit = lastProfit + profits;
            s.setProfit(updateProfit);
            
            int lastsQty = stock.getsQty();
            int finalsQty = lastsQty + updateQty;
            s.setsQty(finalsQty);
            stockDAO.update(s);
            
              }
      
        return s;
    }

    @Override
    public Stock update(HttpServletRequest request) {

return null;
    }

    @Override
    public Stock delete(int id) {
        return stockDAO.delete(id);
    }

    @Override
    public List<Stock> getAll() {
        return stockDAO.getAll();
    }

    @Override
    public Stock getById(int id) {
        return stockDAO.getById(id);
    }
    
    //Getting report
    


    @Override
    public double totalIncome() {
        List<Stock> sList = stockDAO.getAll();
      double  totalIncome = 0;
        for (int i = 0; i < sList.size(); i++) {
            totalIncome += sList.get(i).getProfit();
        }
        return totalIncome;
    }

    @Override
    public double totalCost() {
        List<Stock> sList = stockDAO.getAll();
      double  totalCost = 0;
        for (int i = 0; i < sList.size(); i++) {
            totalCost += sList.get(i).getTotalCost();
        }
        return totalCost;
    }

    @Override
    public double totalSales() {
        List<Stock> sList = stockDAO.getAll();
      double  totalSales = 0;
        for (int i = 0; i < sList.size(); i++) {
            totalSales += sList.get(i).getTotalSales();
        }
        return totalSales;
    }
    
    @Override
    public double  investment(){
       double investment = totalCost()- totalSales();
       return investment;
    }

    @Override
    public List<Stock> getTopSelelingProductQty() {
        return stockDAO.getTopSelelingProductQty();
    }

    @Override
    public List<Stock> getTopSelelingProductValue() {
        return stockDAO.getTopSelelingProductValue();
    }

    @Override
    public List<Stock> getTopSelelingProductByProfit() {
        return stockDAO.getTopSelelingPoductByProfit();
    
    }

}
