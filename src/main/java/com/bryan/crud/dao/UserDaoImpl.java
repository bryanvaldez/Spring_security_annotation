/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bryan.crud.model.User;

/**
 *
 * @author bvaldez
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

    @Override
    public User findByLogin(String usuario) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("usuario", usuario));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User findById(int id) {
        return getByKey(id);
    }


    
}
