/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class GalaxyControler {
         private CadastroCidadao cadastro;
         private CidadaoGalaxyView cidadaoView;
       public void executar(){
           
           cadastro = new CadastroCidadao();
           cidadaoView = new CidadaoGalaxyView();
           cidadaoView.addArmazenaLisner(new ArmazenaListener());
           cidadaoView.addBuscaLisner(new BuscarListener());
           
           
       }
       public class ArmazenaListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro.insereCidadao(cidadaoView.obtemCid());              
            }          
       }
       
       public class BuscarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            CidadaoGalaxia cg = cadastro.buscaCidadao(cidadaoView.obtemCid());
            cidadaoView.colocarCidadao(cg);
           
        }
           
       }
       
       
       
       
}
