/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */




public class ControlerFrame {
    
    //1 - Declarar o modelo e views no controler
    private PessoaModel pm = null;
    private ViewPessoaFrameInput pvi = null;
    private ViewPessoaFrame  pv = null;
    
    //2 - Declarar o manipulador de eventos
    private class ManipuladorEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            pm.setNome(pvi.getNome());
            pm.setIdade(pvi.getIdade());
            pv.showPessoa(pm.getNome(),pm.getIdade());     
        }               
    }
    //3 - Criar o metodo principal para ligar o modelo e as views
    public void showPessoa(){
        //3.1 - Criar Modelo
        pm = new PessoaModel("Darth Vader", 123);        
        //3.2 - Criar Views
        pvi = new ViewPessoaFrameInput();
        pv = new ViewPessoaFrame();        
        //3.3 - Adicionar Manipulador as views
        pvi.inicializarManipulador(new ManipuladorEventos());   
    }
       
    
}


