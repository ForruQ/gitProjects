
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Delivered;
import java.util.List;


public interface IDeliveredService extends ICommonService<Delivered>{
     public List<Delivered> getByOrderNo(int orderNo);
     public String deleteByOrderNo(int orderNo);
     //getting top Selling product by Qty
    public List<Delivered> getTopSelelingProductByQty();
    
    //Getting reports by dates
     public List<Delivered> getByDays();
    public List<Delivered> getByWeaks();
    public List<Delivered> getByMonths();
    public List<Delivered> getByYears();
    public long getTodaysSales();
    public long getCurrentWeek();
    public long getCurrentMonth();
    public long getCurrentYear();
    public long getPreviousWeek();
    public List<Delivered> getByCustomer();
    public List<Delivered> getByProduct();
}
