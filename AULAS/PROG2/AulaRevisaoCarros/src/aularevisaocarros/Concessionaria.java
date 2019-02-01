/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aularevisaocarros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author andre
 */
public class Concessionaria {
    
    private BancoCarro banco;
    //private CarrosJFrame viewCarros;
    
    
    public void executar(){
        banco = new BancoCarro();  
        
    }
    
    /////////////////////////////////
    
    public void teste1(){
        banco.LimparBanco();
        banco.inserirBanco(new Carro("Ana",     "Fusca",      10000,  false));
        banco.inserirBanco(new Carro("Jennifer","Porche",    580000,  true));
        banco.inserirBanco(new Carro("Maria",   "Logan",      52000,  false));
        banco.inserirBanco(new Carro("Rafael",  "Bicicleta",   580,    true));
        banco.inserirBanco(new Carro("Laiza",   "BarbieMovel", 10000, false));               
    }
    
    public void teste2(){
        ArrayList<Carro> lista = banco.lerBanco();
        Iterator<Carro> it = lista.iterator();
        while(it.hasNext()){
            System.out.println("===> "+ it.next());
        }
    }
    

    
    
}
