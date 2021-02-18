
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Invoice;


public interface IInvoiceDAO extends ICommonDAO<Invoice>{
    public Invoice getByOrderNo(int orderNo);
    public String deleteByOrderNo(int orderNo);
    public long getCount();
}
