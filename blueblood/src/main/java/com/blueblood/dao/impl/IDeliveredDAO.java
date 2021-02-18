
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Delivered;
import java.util.List;




public interface IDeliveredDAO extends ICommonDAO<Delivered>{
    public List<Delivered> getByOrderNo(int orderNo);
    public String deleteByOrderNo(int orderNo);
    //getting top Selling product by Qty
    public List<Delivered> getTopSelelingProductByQty();
    //Getting date wise Report From Salse
    public List<Delivered> getByDays(int days, int weeks, String months, int years);
    public List<Delivered> getByWeaks(int weeks, String months, int years);
    public List<Delivered> getByMonths(String months, int years);
    public List<Delivered> getByYears(int years);
    public List<Delivered> getByCustomer();
    public List<Delivered> getByProduct();
    
    
}
