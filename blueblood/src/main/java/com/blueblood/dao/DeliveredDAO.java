package com.blueblood.dao;

import com.blueblood.model.Delivered;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.blueblood.dao.impl.IDeliveredDAO;
import com.blueblood.model.Sales;
import com.blueblood.model.Stock;
import java.util.ArrayList;
import org.hibernate.Query;

@Repository(value = "deliveredDAO")
@Transactional
public class DeliveredDAO implements IDeliveredDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Delivered save(Delivered t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    @Override
    public Delivered update(Delivered t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Delivered delete(int id) {
        Delivered c = (Delivered) sessionFactory.getCurrentSession().load(Delivered.class, id);
        sessionFactory.getCurrentSession().delete(c);
        return c;
    }

    @Override
    public List<Delivered> getAll() {
        List<Delivered> cList = sessionFactory.getCurrentSession().createCriteria(Delivered.class).list();
        return cList;
    }

    @Override
    public Delivered getById(int id) {
        Delivered c = (Delivered) sessionFactory.getCurrentSession().get(Delivered.class, id);
        return c;
    }

    @Override
    public List<Delivered> getByOrderNo(int orderNo) {
        String hql = "from delivered where orderNo = :orderNo";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("orderNo", orderNo);
        List<Delivered> oList = query.list();
        for (int i = 0; i < oList.size(); i++) {
            Sales s = new Sales();
            s.setPrice(oList.get(i).getpPrice());
//             salesDA
        }

        return oList;
    }

    @Override
    public String deleteByOrderNo(int orderNo) {
        String hql = "delete from delivered where orderNo= :orderNo";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setInteger("orderNo", orderNo);
        int res = query.executeUpdate();
        sessionFactory.getCurrentSession().flush();
        return hql;

    }
    //getting top Selling product by Qty
//    @Override
//    public List<Delivered> getTopSelelingProductByQTY() {
//        String hql = "SELECT pCode, SUM(qty) FROM delivered GROUP BY pCode ORDER BY SUM(qty) DESC";
//        Query q = sessionFactory.getCurrentSession().createQuery(hql);
//        List<Delivered> qList =(List<Delivered>) q.list();
//        
//        return qList;
//    }

    @Override
    public List<Delivered> getTopSelelingProductByQty() {
        String hql = "from delivered order by qty desc";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Delivered> qList = q.list();
        return qList;

    }
    //Date wise reports

    @Override
    public List<Delivered> getByDays(int days, int weeks, String months, int years) {
       String hql = "from delivered where days= :days and weeks = :weeks  and months= :months and years= :years";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("days", days);
        q.setParameter("weeks", weeks);
        q.setParameter("months", months);
        q.setParameter("years", years);
        List<Delivered> qList = q.list();
        return qList; 
    }

    @Override
    public List<Delivered> getByWeaks(int weeks, String months, int years) {
        String hql = "from delivered where weeks= :weeks and months= :months and years= :years";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("weeks", weeks);
        q.setParameter("months", months);
        q.setParameter("years", years);
        List<Delivered> qList = q.list();
        return qList;  }

    @Override
    public List<Delivered> getByMonths(String months, int years) {
         String hql = "from delivered where months= :months and years= :years";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("months", months);
        q.setParameter("years", years);
        List<Delivered> qList = q.list();
        return qList; 
    }

    @Override
    public List<Delivered> getByYears(int years) {
       String hql = "from delivered where years= :years";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("years", years);
        List<Delivered> qList = q.list();
        
        return qList; 
    }

    @Override
    public List<Delivered> getByCustomer() {
       String hql = "from delivered order by cId";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Delivered> qList = q.list();
        return qList;
    }

    @Override
    public List<Delivered> getByProduct() {
        String hql = "from delivered order by pId";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Delivered> qList = q.list();
        return qList;
    }
}
