/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ViewPessoaFrameInput extends JFrame {
    // 1 - Declarar Objetos
    JFrame pessoaJFrame = null; 
    JLabel nomeLabel = null;
    JTextField nomePessoaText = null;
    JLabel idadeLabel = null;
    JTextField idadePessoaText = null;
    JButton carregaButton = null;
    
    JLabel listPessoas = null;
    
    
    public void iniciarComponentes(){
        nomeLabel = new JLabel("Nome:");
        nomePessoaText = new JTextField(10);
        
               
        idadeLabel = new JLabel("A idade é:");
        idadePessoaText = new JTextField(3);
        
       
        carregaButton = new JButton("Carrega");
        
        listPessoas = new JLabel("\nLista de Pessoas:\n");
        
        //2.6 - Adicionar componentes ao Frame
        add(nomeLabel);
        add(nomePessoaText);
        add(idadeLabel);
        add(idadePessoaText);
        add(carregaButton);
        add(listPessoas);
    }
    // 2 - Inicializar componentes 
    //2.1 - Criar o Frame
    public ViewPessoaFrameInput(String title) throws HeadlessException {
        super(title);       
        //2.2 - Dar o tamanho
        setSize(400, 100);
        //2.3 - Colocar o Layout
        setLayout(new FlowLayout());
        //2.4 - Indicar o que fazer ao fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //2.5 - Criar os componentes
        //2.6 - Adicionar componentes ao Frame
        iniciarComponentes();
        //2.7 - Disparar o Frame
        setVisible(true);
    }
    //3 - Adicionar Manipulador
    public void inicializarManipulador(ActionListener manipulador){
        carregaButton.addActionListener(manipulador);
    }
    
    //4 - Metodos de acesso
    public String getNome(){
        return (this.nomePessoaText.getText());
    }
   
    public int getIdade(){
        return Integer.parseInt(this.idadePessoaText.getText());
    }
    public void addPessoa(String nome,int idade){
        String listaAtual = listPessoas.getText();
        listPessoas.setText(listaAtual + " ||"+ nome + " - " + idade + "|| \n");
    }
    
}
