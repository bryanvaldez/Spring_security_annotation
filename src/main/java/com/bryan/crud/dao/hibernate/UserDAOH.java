/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao.hibernate;

import com.bryan.crud.dao.UserDao;
import com.bryan.crud.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bvaldez
 */
@Repository
public class UserDAOH extends HibernateTemplate implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
            return sessionFactory.getCurrentSession();
    }    
    
    @Autowired
    public UserDAOH(SessionFactory sessionFactory){
        super(sessionFactory);
    }
    
    @Override
    public User findByLogin(String usuario) {
        Criteria criteria = this.getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("usuario", usuario));
        return (User) criteria.uniqueResult();                
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
