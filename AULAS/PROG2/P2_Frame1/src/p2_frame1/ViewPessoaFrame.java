/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ViewPessoaFrame {
    
    JFrame pessoaJFrame = null; 
    
    JLabel nomeLabel = null;
    JTextField nomePessoaText = null;
    JLabel idadeLabel = null;
    JTextField idadePessoaText = null;

    public ViewPessoaFrame() {
        //1 - Criar o Frame
        pessoaJFrame = new JFrame("Dados de Pessoa");
        //2 - Dar o tamanho
        pessoaJFrame.setSize(400, 100);
        
        //3 - Colocar o Layout
        pessoaJFrame.setLayout(new FlowLayout());
        //4 - Indicar o que fazer ao fechar
        pessoaJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5 - Criar os componentes
        nomeLabel = new JLabel("Nome:");
        nomePessoaText = new JTextField(10);
               
        idadeLabel = new JLabel("A idade é:");
        idadePessoaText = new JTextField(3);
        
        //6 - Adicionar componentes ao Frame
        pessoaJFrame.add(nomeLabel);
        pessoaJFrame.add(nomePessoaText);
        pessoaJFrame.add(idadeLabel);
        pessoaJFrame.add(idadePessoaText);
  
        //7 - Disparar o Frame
        pessoaJFrame.setVisible(true);
    }
    
    public void showPessoa(String nome,int idade){
        nomePessoaText.setText(nome);
        idadePessoaText.setText(Integer.toString(idade));
        
    }
    
   
    
    
}
