
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Invoice;


public interface IInvoiceService extends ICommonService<Invoice>{
    public Invoice getByOrderNo(int orderNo);
    public String deleteByOrderNo(int orderNo);
    public long getCount();
}
