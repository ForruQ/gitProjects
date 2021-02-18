package com.blueblood.dao;

import com.blueblood.dao.impl.IProductDAO;
import com.blueblood.model.Product;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "productDAO")
@Transactional
public class ProductDAO implements IProductDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Product save(Product t) {
        sessionFactory.getCurrentSession().save(t);
        return t;
    }

    @Override
    public Product update(Product t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Product delete(int id) {
        Product c = (Product) sessionFactory.getCurrentSession().load(Product.class, id);
        sessionFactory.getCurrentSession().delete(c);
        return c;
    }

    @Override
    public List<Product> getAll() {
        List<Product> cList = sessionFactory.getCurrentSession().createCriteria(Product.class).list();
        return cList;
    }

    @Override
    public Product getById(int id) {
        Product c = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
        return c;
    }

    //getting list by category
    @Override
    public List<Product> getbyCategoryMen() {
        String hql = "from product where cId= 1";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<Product> pList = query.list();
        return pList;

    }

    @Override
    public List<Product> getbyCategoryWomen() {
        String hql = "from product where cId= 2";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<Product> pList = query.list();
        return pList;

    }

    @Override
    public List<Product> getbyCategoryBabies() {
        String hql = "from product where cId= 3";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<Product> pList = query.list();
        return pList;

    }

    @Override
    public long menCount() {
        String hql = "select count(*) from product where cId= 1";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public long womenCount() {
       String hql = "select count(*) from product where cId= 2";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        System.out.println(count);
        return count;
    }

    @Override
    public long babiesCount() {
       String hql = "select count(*) from product where cId= 3";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        
        return count; 
        
    }

}
