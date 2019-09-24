
package aula6ex1listasviagem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

public class ViagemControlador {
    private ViagemViewJFrame viagemView;
    private ArrayList<Viagem> listaViagens;  
    
    private class InserirListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Viagem v = viagemView.obterViagem();
            listaViagens.add(v);
            viagemView.insereListaViagem(v);
        }       
    }
    private class TotalizarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double total=0;
            int    milhas=0;
            Iterator<Viagem> it = listaViagens.iterator();
            while(it.hasNext()){
                Viagem v = it.next();
                total += v.getPrecoViagem();
                milhas += v.getMilhasViagem();                
            }
            viagemView.mostrarTotalPreco(total);
            viagemView.mostraTotalMilhas(milhas);
        }       
    }
   
    public void executar(){
        viagemView = new ViagemViewJFrame();
        listaViagens = new ArrayList<Viagem>();
        
        viagemView.adicionarInserirListener(new InserirListener());
        viagemView.adicionarTotaisListener(new TotalizarListener());
        viagemView.setVisible(true);
              
        
    }
    
}
