
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Product;
import java.util.List;


public interface IProductDAO extends ICommonDAO<Product>{
    public List<Product> getbyCategoryWomen();
    public List<Product> getbyCategoryMen();
    public List<Product> getbyCategoryBabies();
    public long menCount();
    public long womenCount();
    public long babiesCount();
}
