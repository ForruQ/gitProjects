package com.blueblood.service;

import com.blueblood.dao.impl.ICategoryDAO;
import com.blueblood.dao.impl.ISalesDAO;
import com.blueblood.dao.impl.IStockDAO;
import com.blueblood.model.Sales;
import com.blueblood.model.Stock;
import com.blueblood.service.impl.ISalesService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "salesService")
public class SalesService implements ISalesService {

    @Autowired
    ISalesDAO salesDAO;

    @Autowired
    ICategoryDAO categoryDAO;
    @Autowired
    IStockDAO stockDAO;

    //This  method will not be used 
    @Override
    public Sales save(HttpServletRequest request) {
        int pId = Integer.parseInt(request.getParameter("pId"));
        String pName = request.getParameter("pName");
        String pCode = request.getParameter("pCode");
        //Get Category by category id
        int cId = Integer.parseInt(request.getParameter("cId"));
        String cName = request.getParameter("cName");
        String pDesc = request.getParameter("pDesc");
        String pPhoto = request.getParameter("pPhoto");
        double price = Double.parseDouble(request.getParameter("price"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        double total = Double.parseDouble(request.getParameter("total"));
        double vat = Double.parseDouble(request.getParameter("vat"));
        double grandTotal = Double.parseDouble(request.getParameter("grandTotal"));

        Sales p = new Sales();
        p.setpId(pId);
        p.setpName(pName);
        p.setpCode(pCode);
        p.setcId(cId);
        p.setcName(cName);
        p.setpDesc(pDesc);
        p.setpPhoto(pPhoto);
        p.setPrice(price);
        p.setQty(qty);
        p.setTotal(total);
        p.setVat(vat);
        p.setGrandTotal(grandTotal);
        salesDAO.save(p);

//        Map<String, String[]> map = request.getParameterMap();
//        String[] ids = map.get("ids[]");
//        String[] sPrice = (String[]) map.get("pPrice[]");
////        String[] qty = (String[]) map.get("qty[]");
////        String[] total = (String[]) map.get("total[]");
//        String code = request.getParameter("code");
//        Stock stock = stockDAO.getByProductCode(code);
//        Stock s = new Stock();
//        if (stock != null) {
//            System.out.println("Not null");
////            Stock s = new Stock();
//            for (int i = 0; i < ids.length; i++) {
//                s.setId(stock.getId());
//                s.setpId(stock.getpId());
//                s.setpName(stock.getpName());
//                s.setpCode(stock.getpCode());
//                s.setpPrice(stock.getpPrice());
//                int lastQty = stock.getQty();
////                int updateQty = Integer.parseInt(qty[i]);
//                int finalQty = (lastQty - updateQty);
//                s.setQty(updateQty);
//                s.setTotalCost(stock.getTotalCost());
//                s.setsPrice(Double.parseDouble(sPrice[i]));
//                double lastSales = stock.getTotalSales();
////                double updateSales = Double.parseDouble(total[i]);
//                double totalSales = lastSales + updateSales;
//                s.setTotalSales(updateSales);
//                stockDAO.update(s);
//            }
//        } else {
//            
//        }
        return p;
    }

    @Override
    public Sales update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        String[] ids = map.get("ids[]");
        String[] sPrice = (String[]) map.get("pPrice[]");
        String[] qty = (String[]) map.get("qty[]");
        String[] total = (String[]) map.get("total[]");
        String code = request.getParameter("code");
        Stock stock = stockDAO.getByProductCode(code);
        Stock s = new Stock();
        if (stock != null) {
            System.out.println("Not null");
//            Stock s = new Stock();
            for (int i = 0; i < ids.length; i++) {
                s.setId(stock.getId());
                s.setpId(stock.getpId());
                s.setpName(stock.getpName());
                s.setpCode(stock.getpCode());
                s.setpPrice(stock.getpPrice());
                int lastQty = stock.getQty();
                int updateQty = Integer.parseInt(qty[i]);
                int finalQty = (lastQty - updateQty);
                s.setQty(updateQty);
//            double lastTotal = stock.getTotalCost();
//            double updateTotal = lastTotal + grandTotal;
                s.setTotalCost(stock.getTotalCost());
                s.setsPrice(Double.parseDouble(sPrice[i]));
                double lastSales = stock.getTotalSales();
                double updateSales = Double.parseDouble(total[i]);
                double totalSales = lastSales + updateSales;
                s.setTotalSales(updateSales);
                stockDAO.update(s);
            }
        } else {
            
        } 
    return null;
    
}

@Override
        public Sales delete(int id) {
        return salesDAO.delete(id);
    }

    @Override
        public List<Sales> getAll() {
        return salesDAO.getAll();
    }

    @Override
        public Sales getById(int id) {
        return salesDAO.getById(id);
    }

}
