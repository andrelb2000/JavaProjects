/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1_listajdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CtrlBebida {
    
    private BebidaViewJFrame bebidaView;
    private GerenteBanco     gerenteBanco;
    
    
    private class inserirListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
          Bebida bebida = bebidaView.obterBebidaDigitada();
          bebidaView.inserirBebida(bebida);
          /// AGORA INSERIR NO BANCO /// 
          gerenteBanco.inserirBanco(bebida);
        }
    }
    private class carregarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        /// CARREGAR DO BANCO ////
        }
    }   
     public void executar(){
        bebidaView   = new BebidaViewJFrame();
        gerenteBanco = new GerenteBanco();
        bebidaView.addInserirListener(new inserirListener());
        bebidaView.addCarregarListener(new carregarListener());    
        bebidaView.setVisible(true);        
    }
    
}
