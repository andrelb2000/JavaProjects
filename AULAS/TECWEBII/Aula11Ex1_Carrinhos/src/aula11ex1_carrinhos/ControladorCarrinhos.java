/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11ex1_carrinhos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class ControladorCarrinhos {
    private CarrinhosViewJFrame carrinhosView;
    
    public class InserirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Veiculo v = carrinhosView.obterVeiculoDigitado();
            carrinhosView.insereVeiculo(v);      
        }
        
    }
    public class DispararListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }        
    }
    public class PararListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        }
        
    }
    
    public void iniciar(){
        carrinhosView = new CarrinhosViewJFrame();
        
        carrinhosView.setVisible(true);
        
        carrinhosView.addInsereListener(new InserirListener());
        carrinhosView.addDispararListener(new DispararListener());
        carrinhosView.addPararListener(new PararListener());

    }
    
}
