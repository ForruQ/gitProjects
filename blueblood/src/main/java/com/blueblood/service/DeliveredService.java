package com.blueblood.service;

import com.blueblood.dao.impl.IInvoiceDAO;
import com.blueblood.model.Delivered;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blueblood.dao.impl.IDeliveredDAO;
import com.blueblood.model.Address;
import com.blueblood.service.impl.IAddressService;
import com.blueblood.service.impl.IDeliveredService;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

@Service(value = "deliveredService")
public class DeliveredService implements IDeliveredService {

    @Autowired
    IDeliveredDAO deliveredDAO;
    @Autowired
    IInvoiceDAO invoiceDAO;
    @Autowired
    IAddressService addressService;

    @Override
    public Delivered save(HttpServletRequest request) {

        Map<String, String[]> map = request.getParameterMap();
        String[] ids = map.get("ids[]");
        String[] pId = (String[]) map.get("pId[]");
        String[] pName = (String[]) map.get("pName[]");
        String[] pCode = (String[]) map.get("pCode[]");
        String[] pPhoto = (String[]) map.get("pPhoto[]");
        String[] pPrice = (String[]) map.get("pPrice[]");
        String[] discount = (String[]) map.get("discount[]");
        String[] qty = (String[]) map.get("qty[]");
        String[] total = (String[]) map.get("total[]");
        String[] cId = (String[]) map.get("cId[]");
        String[] orderNo = (String[]) map.get("orderNo[]");
        int cid = Integer.parseInt(request.getParameter("cId"));

        Address address = addressService.getByCid(cid);

        Delivered t = new Delivered();

        for (int i = 0; i < ids.length; i++) {
            t.setpId(Integer.parseInt(pId[i]));
            t.setpName(pName[i]);
            t.setpCode(pCode[i]);
            t.setpPhoto(pPhoto[i]);
            t.setpPrice(Double.parseDouble(pPrice[i]));
            t.setDiscount(Integer.parseInt(discount[i]));
            t.setQty(Integer.parseInt(qty[i]));
            t.setTotal(Double.parseDouble(total[i]));
            t.setcId(Integer.parseInt(cId[i]));
            t.setOrderNo(Integer.parseInt(orderNo[i]));
            t.setCustomer(address.getfName());

            //Reporting purpose
            LocalDate currentdate = LocalDate.now();
            //getting current day
            int days = currentdate.getDayOfMonth();
            //getting current week
            Calendar calendar = Calendar.getInstance();
            int weeks = calendar.WEEK_OF_MONTH;
            //GEtting current months
            Month currentMonth = currentdate.getMonth();
            String months = currentMonth.toString();
            //getting current years
            int years = currentdate.getYear();
            System.out.println("days   " + days + "weeks   " + weeks + months + years);
            t.setDays(days);
            t.setWeeks(weeks);
            t.setMonths(months);
            t.setYears(years);
            deliveredDAO.save(t);
        }
        return t;
    }

    @Override
    public Delivered update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Delivered t = new Delivered();

        return deliveredDAO.update(t);
    }

    @Override
    public Delivered delete(int id) {
        return deliveredDAO.delete(id);
    }

    @Override
    public List<Delivered> getAll() {
        return deliveredDAO.getAll();

    }

    @Override
    public Delivered getById(int id) {
        return deliveredDAO.getById(id);
    }

    @Override
    public List<Delivered> getByOrderNo(int orderNo) {
        return deliveredDAO.getByOrderNo(orderNo);
    }

    @Override
    public String deleteByOrderNo(int orderNo) {
        return deliveredDAO.deleteByOrderNo(orderNo);
    }

    @Override
    public List<Delivered> getTopSelelingProductByQty() {
        return deliveredDAO.getTopSelelingProductByQty();
    }

    // getting dates
    LocalDate currentdate = LocalDate.now();
    //getting current day
    int days = currentdate.getDayOfMonth();
    //getting current week
    Calendar calendar = Calendar.getInstance();
    int weeks = calendar.WEEK_OF_MONTH;
    //GEtting current months
    Month currentMonth = currentdate.getMonth();
    String months = currentMonth.toString();
    //getting current years
    int years = currentdate.getYear();

    @Override
    public List<Delivered> getByDays() {
        return deliveredDAO.getByDays(days, weeks, months, years);
    }

    @Override
    public List<Delivered> getByWeaks() {
        return deliveredDAO.getByWeaks(weeks, months, years);
        
    }

    @Override
    public List<Delivered> getByMonths() {
        return deliveredDAO.getByMonths(months, years);
    }

    @Override
    public List<Delivered> getByYears() {
        return deliveredDAO.getByYears(years);
    }
    
    
    //Sales Totals
   public long getTodaysSales(){
      List<Delivered> dList = getByDays();
      long total = 0;
       for (int i = 0; i < dList.size(); i++) {
           total += dList.get(i).getTotal();
       }
       return total;
   }
   
   
    public long getCurrentWeek(){
      List<Delivered> dList = getByWeaks();
      long total = 0;
       for (int i = 0; i < dList.size(); i++) {
           total += dList.get(i).getTotal();
       }
       return total;
   }
     public long getPreviousWeek(){
     Calendar calendar = Calendar.getInstance();
    int wk = calendar.WEEK_OF_MONTH;
    int wks = wk - 1;
      List<Delivered> dList = deliveredDAO.getByWeaks(wks, months, years);
      long total = 0;
       for (int i = 0; i < dList.size(); i++) {
           total += dList.get(i).getTotal();
       }
       return total;
   }
     
      public long getCurrentMonth(){
      List<Delivered> dList = getByMonths();
      long total = 0;
       for (int i = 0; i < dList.size(); i++) {
           total += dList.get(i).getTotal();
       }
       return total;
   }
       public long getCurrentYear(){
      List<Delivered> dList = getByYears();
      long total = 0;
       for (int i = 0; i < dList.size(); i++) {
           total += dList.get(i).getTotal();
       }
       return total;
   }

    @Override
    public List<Delivered> getByCustomer() {
        return deliveredDAO.getByCustomer();
    }

    @Override
    public List<Delivered> getByProduct() {
       return deliveredDAO.getByProduct();
    }

}
