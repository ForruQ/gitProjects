
package com.blueblood.service;



import com.blueblood.dao.impl.IAddressDAO;
import com.blueblood.dao.impl.ITemporaryTableDAO;
import com.blueblood.model.Address;
import com.blueblood.model.TemporaryTable;
import com.blueblood.service.impl.IAddressService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "addressService")
public class AddressService implements IAddressService{
    
    @Autowired
    IAddressDAO addressDAO;
    @Autowired
    ITemporaryTableDAO temporaryTableDAO;

    @Override
    public Address save(HttpServletRequest request) {
      Map<String, String[]> map = request.getParameterMap();
      int cId = Integer.parseInt(request.getParameter("cId"));
      String fname = request.getParameter("fName");
      String lName = request.getParameter("lName");
      String street = request.getParameter("street");
      String zip = request.getParameter("zip");
      String city = request.getParameter("city");
      String country = request.getParameter("country");
      String phone = request.getParameter("phone");
      String email = request.getParameter("email");
      
     Address address = addressDAO.getByCid(cId);
     Address t = new Address();
        if (address != null) {
        int id = address.getId();
        t.setId(id);
        t.setcId(cId);
        t.setfName(fname);
        t.setlName(lName);
        t.setStreet(street);
        t.setZip(zip);
        t.setCity(city);
        t.setCountry(country);
        t.setPhone(phone);
        t.setEmail(email);
         addressDAO.update(t);  
        }
        else {
        t.setcId(cId);
        t.setfName(fname);
        t.setlName(lName);
        t.setStreet(street);
        t.setZip(zip);
        t.setCity(city);
        t.setCountry(country);
        t.setPhone(phone);
        t.setEmail(email);
         addressDAO.save(t);  
        }
        return t;
    }

    @Override
    public Address update(HttpServletRequest request) {
        Map<String, String[]> map = request.getParameterMap();
        Address t = new Address();
      
         return addressDAO.update(t); }

    @Override
    public Address delete(int id) {
       return addressDAO.delete(id);
    }

    @Override
    public List<Address> getAll() {
        return addressDAO.getAll();
       }

    @Override
    public Address getById(int id) {
     return addressDAO.getById(id);   
    }

    @Override
    public Address getByCid(int cid) {
        return addressDAO.getByCid(cid);
    }

   
}
