
package com.blueblood.dao.impl;

import com.blueblood.common.ICommonDAO;
import com.blueblood.model.TemporaryTable;
import java.util.List;



public interface ITemporaryTableDAO extends ICommonDAO<TemporaryTable>{
    public String deleteByCid(int cId);
    public List<TemporaryTable> getByCid(int cId);
}
