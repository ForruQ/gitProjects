
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Invoice1;


public interface IInvoice1Service extends ICommonService<Invoice1>{
    public Invoice1 getByOrderNo(int orderNo);
    public long getCountbyCid();
    public long getCount();
}
