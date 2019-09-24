/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1_listajdbc;

/**
 *
 * @author andre
 */
public class Bebida {
    private String nomeBebida;
    private int    nrCopos;

    public Bebida(String nomeBebida, int nrCopos) {
        this.nomeBebida = nomeBebida;
        this.nrCopos = nrCopos;
    }

    public String getNomeBebida() {
        return nomeBebida;
    }

    public int getNrCopos() {
        return nrCopos;
    }

    @Override
    public String toString() {
        return nomeBebida + " - Nr.Copos:" + nrCopos;
    }
    
    
}
