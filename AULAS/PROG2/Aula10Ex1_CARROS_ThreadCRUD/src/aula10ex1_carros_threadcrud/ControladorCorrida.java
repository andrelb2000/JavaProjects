/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1_carros_threadcrud;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author professor
 */
public class ControladorCorrida {
    private CarrosViewJFrame carrosView;
    private class InserirVeiculoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Veiculo v = carrosView.obterVeiculoDigitado();
            carrosView.insereVeiculoPista(v);
        }
    }
    private class LimparPistaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            carrosView.limparPista();
        }        
    }
    private class IniciarCorridaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            carrosView.iniciarCorrida();
        }
    }
    private class PararCorridaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            carrosView.pararCorrida();
        }
    }
    
    public void iniciar(){
        carrosView = new CarrosViewJFrame();
        carrosView.addInsereListener(new InserirVeiculoListener());
        carrosView.addLimparPistaListener(new LimparPistaListener());
        carrosView.addIniciarCorridaListener(new IniciarCorridaListener());
        carrosView.addPararCorridaListener(new PararCorridaListener());
        carrosView.setVisible(true);
    }
}
