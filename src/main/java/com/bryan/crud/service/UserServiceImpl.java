/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bryan.crud.dao.UserDao;
import com.bryan.crud.model.User;
/**
 *
 * @author bvaldez
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;
    
    @Override
    public User findByLogin(String usuario) {
        return dao.findByLogin(usuario);
    }

    @Override
    public User findById(int id) {
        return dao.findById(id);
    }
    
}
