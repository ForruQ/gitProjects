
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Payment;


public interface IPaymentDAO extends ICommonDAO<Payment>{
    public Payment getBycId(int cId);
}
