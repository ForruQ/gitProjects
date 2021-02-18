
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Basket;


public interface IBasketDAO extends ICommonDAO<Basket>{ 
    public String deleteByCid(int cId);
    public Basket getByProductCode(String pCode);
    long getBasketCount();
    }
 

