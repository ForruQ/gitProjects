
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Payment;


public interface IPaymentService extends ICommonService<Payment>{
    public Payment getBycId(int cId);
}
