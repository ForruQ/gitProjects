
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Wishlist;


public interface IWishlistService extends ICommonService<Wishlist>{
  public String deleteByCid(int cId);
  long getWishlistCount();
  public Wishlist getByProductCode(String pCode);
}
