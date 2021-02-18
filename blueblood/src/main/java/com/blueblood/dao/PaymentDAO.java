package com.blueblood.dao;


import com.blueblood.model.Payment;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.blueblood.dao.impl.IPaymentDAO;
import org.hibernate.Query;

@Repository(value = "paymentDAO")
@Transactional
public class PaymentDAO implements IPaymentDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Payment save(Payment t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    @Override
    public Payment update(Payment t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Payment delete(int id) {
    Payment c = (Payment) sessionFactory.getCurrentSession().load(Payment.class, id);
    sessionFactory.getCurrentSession().delete(c);
    return c;      
    }

    @Override
    public List<Payment> getAll() {
    List<Payment> cList = sessionFactory.getCurrentSession().createCriteria(Payment.class).list();
        return cList;    
    }

    @Override
    public Payment getById(int id) {
    Payment c = (Payment) sessionFactory.getCurrentSession().get(Payment.class, id);
       return c;    
    }

    @Override
    public Payment getBycId(int cId) {
       String hql = "from payment where cId = :cId";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("cId", cId);
        Payment payement = (Payment) query.uniqueResult();
        return payement; 
    }

}

