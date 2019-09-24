package aula6ex1curso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;


public class CursosControlador {
    private CursosNewJFrame cursosView;
    private ArrayList<Curso> listaCursos;
    
    public void executar(){
        cursosView = new CursosNewJFrame();
        listaCursos = new ArrayList<Curso>();
        /// Adicionar o listener na view
        cursosView.addInserirListener(new InserirListener());
        cursosView.addTotalizarListener(new TotalizarListener());
        cursosView.setVisible(true);
    }
    /// Declarar o Listener
    private class InserirListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Curso c = cursosView.obtemCurso();
            listaCursos.add(c);           
        }       
    }
    private class TotalizarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double total = 0;
            Iterator<Curso> it = listaCursos.iterator();
            while(it.hasNext()){
                Curso c = it.next();
                total += c.getPrecoCurso();
            }
            cursosView.mostrarTotal(total);
        } 
    }
}
