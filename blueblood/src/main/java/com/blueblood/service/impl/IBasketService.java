
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Basket;


public interface IBasketService extends ICommonService<Basket>{
  public String deleteByCid(int cId);
  long getBasketCount();
  public Basket getByProductCode(String pCode);
}
