/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.service;

import com.bryan.crud.model.User;

/**
 *
 * @author bvaldez
 */
public interface UserService{
    
    User findByLogin(String usuario);
    
    User findById(Long id);
}
