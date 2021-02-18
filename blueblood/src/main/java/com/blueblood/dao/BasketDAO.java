package com.blueblood.dao;


import com.blueblood.dao.impl.IBasketDAO;
import com.blueblood.model.Basket;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "basketDAO")
@Transactional
public class BasketDAO implements IBasketDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Basket save(Basket t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Basket update(Basket t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Basket delete(int id) {
    Basket c = (Basket) sessionFactory.getCurrentSession().load(Basket.class, id);
    sessionFactory.getCurrentSession().delete(c);
    return c;      
    }

    @Override
    public List<Basket> getAll() {
    List<Basket> cList = sessionFactory.getCurrentSession().createCriteria(Basket.class).list();
        return cList;    
    }

    @Override
    public Basket getById(int id) {
    Basket c = (Basket) sessionFactory.getCurrentSession().get(Basket.class, id);
       return c;    
    }
    
      @Override
    public String deleteByCid(int cId) {
          String hql = "delete from basket where cId= :cId";
          Query query = sessionFactory.getCurrentSession().createQuery(hql);
          query.setInteger("cId", cId);
          int res = query.executeUpdate();
          sessionFactory.getCurrentSession().flush();
     return hql;

}

    @Override
    public long getBasketCount() {
        String hql = "select count(*) from basket";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public Basket getByProductCode(String pCode) {
         String hql = "from basket where pCode = :pCode";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("pCode", pCode);
        Basket b = (Basket) query.uniqueResult();
        if(b != null){
            return b;
        } else {
            return null;
        }
    }

}