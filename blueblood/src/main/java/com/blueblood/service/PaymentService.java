
package com.blueblood.service;



import com.blueblood.model.Payment;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blueblood.dao.impl.IPaymentDAO;
import com.blueblood.service.impl.IPaymentService;

@Service(value = "paymentService")
public class PaymentService implements IPaymentService{
    
    @Autowired
    IPaymentDAO paymentDAO;

    @Override
    public Payment save(HttpServletRequest request) {
        int cId = Integer.parseInt(request.getParameter("cId"));
        String mName = request.getParameter("mName");
        String name = request.getParameter("name");
        String cardNo = request.getParameter("cardNo");
        String eDate = request.getParameter("eDate");
        String ccv = request.getParameter("ccv");
  
         Payment t = new Payment();
        t.setcId(cId);
        t.setmName(mName);
        t.setName(name);
        t.setCardNo(cardNo);
        t.seteDate(eDate);
        t.setCcv(ccv);
        t.setStatus("In Progress");
         return paymentDAO.save(t);    
    }

    @Override
    public Payment update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Payment t = new Payment();
      
         return paymentDAO.update(t); }

    @Override
    public Payment delete(int id) {
       return paymentDAO.delete(id);
    }

    @Override
    public List<Payment> getAll() {
        return paymentDAO.getAll();
       }

    @Override
    public Payment getById(int id) {
     return paymentDAO.getById(id);   
    }

    @Override
    public Payment getBycId(int cId) {
       return paymentDAO.getBycId(cId);
    }

   
}
