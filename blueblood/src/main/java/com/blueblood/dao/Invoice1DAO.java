package com.blueblood.dao;

import com.blueblood.dao.impl.IInvoice1DAO;
import com.blueblood.model.Basket;
import com.blueblood.model.Invoice1;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "invoice1DAO")
@Transactional
public class Invoice1DAO implements IInvoice1DAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Invoice1 save(Invoice1 t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    @Override
    public Invoice1 update(Invoice1 t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Invoice1 delete(int id) {
    Invoice1 c = (Invoice1) sessionFactory.getCurrentSession().load(Invoice1.class, id);
    sessionFactory.getCurrentSession().delete(c);
    return c;      
    }

    @Override
    public List<Invoice1> getAll() {
    List<Invoice1> cList = sessionFactory.getCurrentSession().createCriteria(Invoice1.class).list();
        return cList;    
    }

    @Override
    public Invoice1 getById(int id) {
    Invoice1 c = (Invoice1) sessionFactory.getCurrentSession().get(Invoice1.class, id);
       return c;    
    }

    @Override
    public Invoice1 getByOrderNo(int orderNo) {
       String hql = "from invoice1 where orderNo = :orderNo";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("orderNo", orderNo);
        Invoice1 invoice1 = (Invoice1) query.uniqueResult();
        if(invoice1 != null){
            return invoice1;
        } else {
            return null;
        }    
    }

    @Override
    public long getCountbyCid() {
         String hql = "select COUNT(DISTINCT cid) from invoice1";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public long getCount() {
        String hql = "select count(*) from invoice1";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public Invoice1 getByDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
    

}

