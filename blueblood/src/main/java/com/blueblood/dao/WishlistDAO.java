package com.blueblood.dao;


import com.blueblood.dao.impl.IWishlistDAO;
import com.blueblood.model.Wishlist;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "wishlistDAO")
@Transactional
public class WishlistDAO implements IWishlistDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Wishlist save(Wishlist t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Wishlist update(Wishlist t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
        return t;
    }

    @Override
    public Wishlist delete(int id) {
    Wishlist c = (Wishlist) sessionFactory.getCurrentSession().load(Wishlist.class, id);
    sessionFactory.getCurrentSession().delete(c);
    return c;      
    }

    @Override
    public List<Wishlist> getAll() {
    List<Wishlist> cList = sessionFactory.getCurrentSession().createCriteria(Wishlist.class).list();
        return cList;    
    }

    @Override
    public Wishlist getById(int id) {
    Wishlist c = (Wishlist) sessionFactory.getCurrentSession().get(Wishlist.class, id);
       return c;    
    }
    
      @Override
    public String deleteByCid(int cId) {
          String hql = "delete from wishlist where cId= :cId";
          Query query = sessionFactory.getCurrentSession().createQuery(hql);
          query.setInteger("cId", cId);
          int res = query.executeUpdate();
          sessionFactory.getCurrentSession().flush();
     return hql;

}

    @Override
    public long getWishlistCount() {
        String hql = "select count(*) from wishlist";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        long count = (long) q.uniqueResult();
        return count;
    }

    @Override
    public Wishlist getByProductCode(String pCode) {
         String hql = "from wishlist where pCode = :pCode";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("pCode", pCode);
        Wishlist b = (Wishlist) query.uniqueResult();
        if(b != null){
            return b;
        } else {
            return null;
        }
    }

}