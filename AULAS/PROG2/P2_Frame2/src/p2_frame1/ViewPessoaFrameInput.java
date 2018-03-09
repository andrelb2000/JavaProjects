/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ViewPessoaFrameInput {
    // 1 - Declarar Objetos
    JFrame pessoaJFrame = null; 
    JLabel nomeLabel = null;
    JTextField nomePessoaText = null;
    JLabel idadeLabel = null;
    JTextField idadePessoaText = null;
    JButton carregaButton = null;
    
    
    // 2 - Inicializar componentes 
    public ViewPessoaFrameInput() {
        //2.1 - Criar o Frame
        pessoaJFrame = new JFrame("Dados de Pessoa");
        //2.2 - Dar o tamanho
        pessoaJFrame.setSize(400, 100);
        
        //2.3 - Colocar o Layout
        pessoaJFrame.setLayout(new FlowLayout());
        //2.4 - Indicar o que fazer ao fechar
        pessoaJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //2.5 - Criar os componentes
        nomeLabel = new JLabel("Nome:");
        nomePessoaText = new JTextField(30);
        
               
        idadeLabel = new JLabel("A idade é:");
        idadePessoaText = new JTextField(3);
        
       
        carregaButton = new JButton("Carrega");
        
        //2.6 - Adicionar componentes ao Frame
        pessoaJFrame.add(nomeLabel);
        pessoaJFrame.add(nomePessoaText);
        pessoaJFrame.add(idadeLabel);
        pessoaJFrame.add(idadePessoaText);
        pessoaJFrame.add(carregaButton);
  
        
        //2.7 - Disparar o Frame
        pessoaJFrame.setVisible(true);
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
    
}
