/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ProdutoVierw {
    private String nomeProdutoView;
    private int    qdeProdutoView;
    private double precoProdutoView;
    
    public void leProduto(){
        // ler os dados do produto a partir da tela
        nomeProdutoView = JOptionPane.showInputDialog("Produto ?");
        qdeProdutoView  = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto:"));
        precoProdutoView = Double.parseDouble(JOptionPane.showInputDialog("Preco:"));
    }
    public void mostraProduto(double total){
        // Usar o JOptionPane para mostrar o produto lido
        JOptionPane.showMessageDialog(null, 
                "Comprei "+ qdeProdutoView + " do "+ nomeProdutoView + "E custou "+total);
       }

    public String getNomeProdutoView() {
        return nomeProdutoView;
    }

    public int getQdeProdutoView() {
        return qdeProdutoView;
    }

    public double getPrecoProdutoView() {
        return precoProdutoView;
    }
    
    
    
}
