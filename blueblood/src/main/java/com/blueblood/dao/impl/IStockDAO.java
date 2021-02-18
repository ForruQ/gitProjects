
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.Stock;
import java.util.List;


public interface IStockDAO extends ICommonDAO<Stock>{
    public Stock getByProductCode(String pCode);
    public List<Stock> getTopSelelingProductQty();
    public List<Stock> getTopSelelingProductValue();
    public List<Stock> getTopSelelingPoductByProfit();
}
