
package com.blueblood.service.impl;

import com.blueblood.common.ICommonService;
import com.blueblood.model.TemporaryTable;
import java.util.List;

public interface ITemporaryTableService extends ICommonService<TemporaryTable>{
    public String deleteByCid(int cId);
     public List<TemporaryTable> getByCid(int cId);
}
