/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao;

import com.bryan.crud.helper.GenericDAO;
import com.bryan.crud.model.User;

/**
 *
 * @author bvaldez
 */
public interface UserDAO{
    User findById(int id);
    User findBySSO(String sso);
}
