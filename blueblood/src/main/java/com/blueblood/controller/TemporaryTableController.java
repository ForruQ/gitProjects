
package com.blueblood.controller;




import com.blueblood.controller.impl.ITemporaryTableController;
import com.blueblood.dao.impl.IBasketDAO;
import com.blueblood.model.City;
import com.blueblood.model.Country;
import com.blueblood.model.TemporaryTable;
import com.blueblood.service.impl.IBasketService;
import com.blueblood.service.impl.ICityService;
import com.blueblood.service.impl.ICountryService;
import com.blueblood.service.impl.ITemporaryTableService;
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


@Controller


@RequestMapping(value = "temporaryTable")
public class TemporaryTableController implements ITemporaryTableController{
    @Autowired
    ITemporaryTableService temporaryTableService;
    @Autowired
    IBasketService basketService;
    @Autowired
    ICountryService countryService;
    @Autowired
    ICityService cityService;
    
    

    @RequestMapping(value = "/updateView")
    public ModelAndView updateView() {
        return new ModelAndView("temporaryTable/update");
    }
     @RequestMapping(value = "/register")
    public ModelAndView register() {
        return new ModelAndView("temporaryTable/register");
    }
     @RequestMapping(value = "/login")
    public ModelAndView login() {
        return new ModelAndView("temporaryTable/login");
    }

    @Override
    @RequestMapping(value = "/create")
    public ModelAndView create() {
        return new ModelAndView("temporaryTable/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
      TemporaryTable t = temporaryTableService.save(request);
      //removing previous activity
      int cId = Integer.parseInt(request.getParameter("cId"));
        basketService.deleteByCid(cId);
         List<Country> countries = countryService.getAll();
         List<TemporaryTable> tList = temporaryTableService.getAll();
        List<City> cities = cityService.getAll();        
        Map<String, Object> map = new HashMap<>();
        map.put("tList", tList);
        map.put("countries", countries);
        map.put("cities", cities);
        return new ModelAndView("/home/checkout1", "map", map);
       
    }

    @Override
        @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        TemporaryTable c = temporaryTableService.getById(id);
        c.setId(id);
       return new ModelAndView("temporaryTable/update", "c", c);
    }

    @Override
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        TemporaryTable c =  temporaryTableService.update(request);
        return new ModelAndView("temporaryTable/update");
    }

    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {
    TemporaryTable c = temporaryTableService.delete(id);
       return new ModelAndView("redirect:/temporaryTable/view");    
    }

    @Override
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView getAll() {
    Map<String, Object> map = new HashMap<String, Object>();
    List<TemporaryTable> cList = temporaryTableService.getAll();
    map.put("cList", cList);
    return new ModelAndView("temporaryTable/view", "map", map);
    }

 
    
}
