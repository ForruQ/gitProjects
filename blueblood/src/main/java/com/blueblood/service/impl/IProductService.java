
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Product;
import java.util.List;

public interface IProductService extends ICommonService<Product>{
  public List<Product> getbyCategoryWomen();
    public List<Product> getbyCategoryMen();
    public List<Product> getbyCategoryBabies();
    public long menCount();
    public long womenCount();
    public long babiesCount();
}
