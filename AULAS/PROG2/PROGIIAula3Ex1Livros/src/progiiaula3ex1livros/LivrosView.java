/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiiaula3ex1livros;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class LivrosView {
    private JFrame      livrosJFrame;
    /////////////////////////////////
    private JLabel      livroNomeJLabel;
    private JTextField  livroNomeJTextField;
    private JLabel      livroPagJLabel;
    private JTextField  livroPagJTextField;
    private JLabel      livroPrecoJLabel;
    private JTextField  livroPrecoJTextField;
    private JLabel      livroQdeJLabel;
    private JTextField  livroQdeJTextField;
    //////////////////////////////////////     
    public LivrosView(){
        livrosJFrame = new JFrame("Livros");
        livrosJFrame.setSize(300, 300);
        ///////////////////////////////
        livrosJFrame.setLayout(new FlowLayout());
        ///////////////////////////////
        livrosJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        livroNomeJLabel       = new JLabel("Nome Livro:");
        livroNomeJTextField   = new JTextField(20);
        livroPagJLabel        = new JLabel("Nr Pag:");
        livroPagJTextField    = new JTextField(5);
        livroPrecoJLabel      = new JLabel("Preço Livro R$:");
        livroPrecoJTextField  = new JTextField(5);
        livroQdeJLabel        = new JLabel("Qde de Livros:");
        livroQdeJTextField    = new JTextField(5);
        /// Adicionar no Frame ///
        livrosJFrame.add(livroNomeJLabel);       
        livrosJFrame.add(livroNomeJTextField); 
        
        livrosJFrame.add(livroPagJLabel);       
        livrosJFrame.add(livroPagJTextField);  
        
        livrosJFrame.add(livroPrecoJLabel);     
        livrosJFrame.add(livroPrecoJTextField); 
        
        livrosJFrame.add(livroQdeJLabel);       
        livrosJFrame.add(livroQdeJTextField);   
        
        livrosJFrame.setVisible(true);
    }
    /*
    public Livro leLivro(){
        
        String nome  = JOptionPane.showInputDialog("Nome do Livro:");
        int    nrPag = Integer.parseInt(JOptionPane.showInputDialog("Nr.Pg. do Livro:"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco do Livro:"));
        int    qde   = Integer.parseInt(JOptionPane.showInputDialog("Qde em estoque:"));
        
        return new Livro(nome, nrPag, preco, qde);  
    }*/
    public void mostraLivro(Livro l){
        /*
        JOptionPane.showMessageDialog(null,"Livro:  "    + l.getNomeLivro()+
                                           "\nNr.Pg.:  " + l.getNrPaginas()+
                                           "\nPreco R$:" + l.getPrecoLivro()+
                                           "\nQde:     " + l.getQdeEstoque());
*/
        livroNomeJTextField.setText(l.getNomeLivro());
        livroPagJTextField.setText(Integer.toString(l.getNrPaginas()));
        livroPrecoJTextField.setText(""+l.getPrecoLivro());
        livroQdeJTextField.setText(""+l.getQdeEstoque());
    }  
}
