/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7ex1jdbc_exames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;


public class ControladorMedico {
    private ExamesJFrame examesView;
    private ArrayList<Exame> listaExames;  
    private ControladorBANCO controladorBANCO;
    
    protected class InserirListaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
          Exame ex = examesView.obterExame();
          listaExames.add(ex);
          examesView.insereLista(ex);
        }
        
    }
    protected class InsereBancoListener  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           //TODO fazer insercao no banco de dados
           Exame ex = examesView.obterExame();
           controladorBANCO.inserirExame(ex);
        }
        
    }
    protected class LimparListaListener  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
          examesView.limparLista();
          listaExames.clear();
        }
        
    }
    protected class CarregaListaListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            listaExames.clear();
            controladorBANCO.recuperarExames(listaExames);
            examesView.limparLista();
            Iterator<Exame> it = listaExames.iterator();
            while(it.hasNext()){
                Exame ex = it.next();
                examesView.insereLista(ex);
            }            
        }
        
    }
    public void executar(){
        examesView = new ExamesJFrame();
        listaExames = new ArrayList<Exame>();
        controladorBANCO = new ControladorBANCO();
        
        examesView.addCarregaListaListener(new CarregaListaListener());
        examesView.addInserirListaListener(new InserirListaListener());
        examesView.addInserirBancoListener(new InsereBancoListener());
        examesView.addLimpaListaListener(new LimparListaListener());

        examesView.setVisible(true);
    }
    
}
