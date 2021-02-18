
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Wishlist;


public interface IWishlistDAO extends ICommonDAO<Wishlist>{ 
    public String deleteByCid(int cId);
    public Wishlist getByProductCode(String pCode);
    long getWishlistCount();
    }
 

