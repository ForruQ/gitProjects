
package com.blueblood.service;



import com.blueblood.dao.impl.IInvoice1DAO;
import com.blueblood.model.Address;
import com.blueblood.model.Invoice1;
import com.blueblood.service.impl.IAddressService;
import com.blueblood.service.impl.IInvoice1Service;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "invoice1Service")
public class Invoice1Service implements IInvoice1Service{
    
    @Autowired
    IInvoice1DAO invoice1DAO;
    @Autowired
    IAddressService addressService;

    @Override
    public Invoice1 save(HttpServletRequest request) {
      Map<String, String[]> map = request.getParameterMap();
      double subtotal = Double.parseDouble(request.getParameter("subTotal"));
      int vat = Integer.parseInt(request.getParameter("vat"));
      int dCharge = Integer.parseInt(request.getParameter("dCharge"));
      double grandTotal = Double.parseDouble(request.getParameter("grandTotal"));
      int cid = Integer.parseInt(request.getParameter("cId"));
      int orderNo = Integer.parseInt(request.getParameter("orderNo"));
      String orderDate = request.getParameter("orderDate");
      
      Address address = addressService.getByCid(cid);
      
      Invoice1 t = new Invoice1();
       t.setSubTotal(subtotal);
       t.setVat(vat);
       t.setdCharge(dCharge);
       t.setGrandTotal(grandTotal);
       t.setOrderNo(orderNo);
       t.setCid(cid);
       t.setOrderDate(orderDate);
       t.setCustomer(address.getfName());
         return invoice1DAO.save(t);    
    }

    @Override
    public Invoice1 update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Invoice1 t = new Invoice1();
  
         return invoice1DAO.update(t); }

    @Override
    public Invoice1 delete(int id) {
       return invoice1DAO.delete(id);
    }

    @Override
    public List<Invoice1> getAll() {
        return invoice1DAO.getAll();
       }

    @Override
    public Invoice1 getById(int id) {
     return invoice1DAO.getById(id);   
    }

    @Override
    public Invoice1 getByOrderNo(int orderNo) {
        return invoice1DAO.getByOrderNo(orderNo);
    }

    @Override
    public long getCountbyCid() {
      return invoice1DAO.getCountbyCid();
    }

    @Override
    public long getCount() {
        return invoice1DAO.getCount();
    }

   
}
