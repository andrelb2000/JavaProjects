
package aula8ex1doencajdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class DoencaControlador {
    private DoencaViewJFrame doencaViewJFrame;
    private ArrayList<Doenca> listaDoencas;  
    private ControladorBancoDoenca controladorBancoDoenca;

    private class InserirListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Doenca d = doencaViewJFrame.obterDoencaDigitada();
            listaDoencas.add(d);
            doencaViewJFrame.inserirNaLista(d);    
            controladorBancoDoenca.inserirDoenca(d);
         }       
    }
    private class LimparListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            doencaViewJFrame.limparLista();            
        }
    }
    private class CarregarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            listaDoencas.clear();
            controladorBancoDoenca.carregarListaDoencas(listaDoencas);
                 
            doencaViewJFrame.limparLista();
            Iterator<Doenca> it = listaDoencas.iterator();
            while(it.hasNext()){
                Doenca d = it.next();
                doencaViewJFrame.inserirNaLista(d);   
            }  
        }
    }
    
    
    public void executar(){
        doencaViewJFrame = new DoencaViewJFrame();
        listaDoencas     = new ArrayList<Doenca>();   
        controladorBancoDoenca = new ControladorBancoDoenca();
        
        doencaViewJFrame.adicionarCarregarListener(new CarregarListener());
        doencaViewJFrame.adicionarInserirListener(new InserirListener());
        doencaViewJFrame.adicionarLimparListener(new LimparListener());     
        doencaViewJFrame.setVisible(true);
    }
    
}
