
package aula5ex1processos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class CartorioControlador {
    private ArrayList<ProcessoLegal> listaProcessos;
    private ProcessoLegalView processoView;
    
    private class inserirProcessoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         // Colocar codigo para inserir Processo na lista
         ProcessoLegal pl = processoView.retornaProcesso();
         listaProcessos.add(pl);      
        
         processoView.mostraProcesso(pl);
        }      
    }
    ////
    private class ListarProcessosListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String listaprocessos = "";
            Iterator<ProcessoLegal> it = listaProcessos.iterator();
            while(it.hasNext()){
                ProcessoLegal pl = it.next();
                String nrprocesso = pl.getNrProcesso();
                listaprocessos += "==> "+ nrprocesso + "\n";
            }
           processoView.mostraLista(listaprocessos);
        }
        
    }
    
    
    
    public void iniciarPrograma(){
        listaProcessos = new ArrayList<ProcessoLegal>();
        processoView = new ProcessoLegalView();
        processoView.adicionarListenerInserir(new inserirProcessoListener());
        processoView.adicionarListenerListar(new ListarProcessosListener());
     }
    
}
