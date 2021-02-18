package com.blueblood.dao;

import com.blueblood.dao.impl.ITemporaryTableDAO;
import com.blueblood.model.TemporaryTable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "temporaryTableDAO")
@Transactional
public class TemporaryTableDAO implements ITemporaryTableDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public TemporaryTable save(TemporaryTable t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    @Override
    public TemporaryTable update(TemporaryTable t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public TemporaryTable delete(int id) {
    TemporaryTable c = (TemporaryTable) sessionFactory.getCurrentSession().load(TemporaryTable.class, id);
    sessionFactory.getCurrentSession().delete(c);
    return c;      
    }

    @Override
    public List<TemporaryTable> getAll() {
    List<TemporaryTable> cList = sessionFactory.getCurrentSession().createCriteria(TemporaryTable.class).list();
        return cList;    
    }

    @Override
    public TemporaryTable getById(int id) {
    TemporaryTable c = (TemporaryTable) sessionFactory.getCurrentSession().get(TemporaryTable.class, id);
       return c;    
    }
 
       @Override
    public String deleteByCid(int cId) {
          String hql = "delete from temporaryTable where cId= :cId";
          Query query = sessionFactory.getCurrentSession().createQuery(hql);
          query.setInteger("cId", cId);
          int res = query.executeUpdate();
          sessionFactory.getCurrentSession().flush();
     return hql;
}

    @Override
    public List<TemporaryTable> getByCid(int cId) {
        String hql = "from temporaryTable where cId= :cId";
          Query query = sessionFactory.getCurrentSession().createQuery(hql);
          query.setInteger("cId", cId);
         List<TemporaryTable> t = query.list();
         if(t != null) {
             return t;
         } else {
             return null;
         }

    }

}