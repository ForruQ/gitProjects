
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.Stock;
import java.util.List;

public interface IStockService extends ICommonService<Stock>{
        public double totalIncome();
        public double totalCost();
        public double totalSales();
        public double investment();
        public List<Stock> getTopSelelingProductQty();
        public List<Stock> getTopSelelingProductValue();
        public List<Stock> getTopSelelingProductByProfit();
}
