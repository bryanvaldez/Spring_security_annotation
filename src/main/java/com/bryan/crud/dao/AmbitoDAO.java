/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao;

import com.bryan.crud.model.Ambito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bvaldez
 */
public interface AmbitoDAO {
    
    List<Ambito> findAllAmbitos();
    
    ArrayList allAmbitos();
}
