/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9ex1jdbc;

/**
 *
 * @author andre
 */
public class AULA9Ex1JDBC {
    public static void main(String[] args) {
        ControladorBanco cb = new ControladorBanco();
        cb.lerBanco();
        cb.encerrarBanco();
    }    
}
