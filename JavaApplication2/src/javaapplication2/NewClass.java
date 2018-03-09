/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class NewClass {
    private int att1 = 0;
    private static final Logger LOG = Logger.getLogger(NewClass.class.getName());
    
    
    public NewClass() {
        System.out.println("Construtor");
    }

 
    public void relatar(){
        LOG.log(Level.SEVERE, "Primeira mengagem de log");       
    }   
    
}
