package aula07_ex1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;


public class Empresa {
    //private Funcionario[] listaFuncionarios;
    private ArrayList<Funcionario> listaFuncionarios; 
    private PessoaView viewP;
    protected String nomeArq = "D:\\funcionarios_Base.txt";

        
    public Empresa() {
        listaFuncionarios = new ArrayList<Funcionario>();       
        viewP = new PessoaView();
        viewP.setListenerInserir(new InserirListener());
        viewP.setListenerSalvar(new SalvarListener());
        viewP.setListenerCarregar(new CarregarListener());                
    }
    
    public void iniciarEmpresa(){
        viewP.setVisible(true);
    }
    
    
    
    
    public class CarregarListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        try {
            viewP.limparLista();            
            listaFuncionarios.clear();
            
            FileReader fr = new FileReader(nomeArq);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            while (linha !=null){
                Funcionario f = new Funcionario();
                f.carregar(linha);
                listaFuncionarios.add(f);                
                viewP.addElementoLista(f);
                linha = br.readLine();
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
            Iterator<Funcionario> it = listaFuncionarios.iterator();
            while(it.hasNext()){
                Funcionario f = it.next();
                //------------------//
                f.setNomeArq(nomeArq);
                //------------------//
                
                
                
                
                
                f.salvar();            
            }
            //----------------------------------------//
        }
        
    }

    
}


