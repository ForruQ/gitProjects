
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Invoice1;


public interface IInvoice1DAO extends ICommonDAO<Invoice1>{
    public Invoice1 getByOrderNo(int orderNo);
   public long getCountbyCid();
   public long getCount();
   public Invoice1 getByDate();
}
