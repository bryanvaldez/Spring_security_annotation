/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao.hibernate;

import com.bryan.crud.dao.UserDAO;
import com.bryan.crud.helper.AbstractDao;
import com.bryan.crud.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bvaldez
 */
@Repository
public class UserDAOH extends AbstractDao<Integer, User> implements UserDAO{

    @Override
    public User findById(int id) {
        return getByKey(id);
    }

    @Override
    public User findBySSO(String sso) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("usuario", sso));
        return (User) crit.uniqueResult();
    }


}
