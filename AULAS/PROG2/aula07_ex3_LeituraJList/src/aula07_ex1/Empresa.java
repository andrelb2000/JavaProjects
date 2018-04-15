package aula07_ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


public class Empresa {
    //private Funcionario[] listaFuncionarios;
    private ArrayList<Funcionario> listaFuncionarios; 
    private PessoaView viewP;
    protected String nomeArq = "D:\\funcionarios.txt";

        
    public Empresa() {
        listaFuncionarios = new ArrayList<Funcionario>();       
        viewP = new PessoaView();
        viewP.setListenerInserir(new InserirListener());
        viewP.setListenerSalvar(new SalvarListener());
        viewP.setListenerCarregar(new CarregarListener()); 
        viewP.setNomeArq(nomeArq);        
    }
    
    public void iniciarEmpresa(){
        viewP.setVisible(true);
    }
    
    
    
    
    public class CarregarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                viewP.limparLista();
                nomeArq = viewP.getNomeArq();
                listaFuncionarios.clear();
                FileReader fr = new FileReader(nomeArq);
                BufferedReader br = new BufferedReader(fr);
                Funcionario f = new Funcionario();
                boolean linhaLida = f.carregar(br);
                while(linhaLida){
                    listaFuncionarios.add(f);                
                    viewP.addElementoLista(f);
                    f = new Funcionario();
                    linhaLida = f.carregar(br);
                }            
                br.close();
                fr.close();            
            } catch (Exception e) {
                System.out.println("Deu m... Erro="+e);
            }                        
        }
    }
    
    public class InserirListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String nome = viewP.getNome();
            int idade = viewP.getIdade();
            double salario = viewP.getSalario();
            String cargo = viewP.getCargo();
            Funcionario f = new Funcionario(salario, cargo, nome, idade);            
            listaFuncionarios.add(f);
            ///--------------------///
            viewP.addElementoLista(f);            
            ///--------------------///
        }
        
    }
    
    public class SalvarListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {            
            try {
                //------------------//
                nomeArq = viewP.getNomeArq();
                //------------------//
                FileWriter fw = new FileWriter(nomeArq, viewP.getApend());    
                Iterator<Funcionario> it = listaFuncionarios.iterator();
                while(it.hasNext()){
                    Funcionario f = it.next();
                    //------------------//
                    f.salvar(fw);            
                    //------------------//                
                }
                fw.close();
            } catch (IOException ex) {             }  
        }        
    }

    
}


