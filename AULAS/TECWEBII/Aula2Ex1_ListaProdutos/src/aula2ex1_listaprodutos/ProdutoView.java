/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2ex1_listaprodutos;

// Criar Métodos da View

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ProdutoView {
    
    public void leProdutos(EstoqueModelo estoque){
        boolean fim = false;
        while(!fim){           
           // ler os dados do produto a partir da tela
           String nomeProdutoView = JOptionPane.showInputDialog(
                                             "Produto ?(fim para encerrar)");
           double precoProdutoView = Double.parseDouble(JOptionPane.showInputDialog(
                                                       "Preco:"));
           int qdeProdutoView  = Integer.parseInt(JOptionPane.showInputDialog(
                                                    "Quantidade do Produto:"));
           if(nomeProdutoView.equalsIgnoreCase("fim")){
               fim = true;
           }else{
               estoque.insereProduto(nomeProdutoView, 
                                     precoProdutoView, 
                                     qdeProdutoView);
           }
        }
    }
    public void mostraProdutos(EstoqueModelo estoque){
        ArrayList<ProdutoModelo> pml = estoque.getListaProdutos();
        Iterator<ProdutoModelo> it = pml.iterator();
        String lista = "";
        while(it.hasNext()){
            ProdutoModelo pm = it.next();
            lista += pm.getNomeProduto() + " - R$ " + pm.getPrecoProduto()+"\n";
        }
        JOptionPane.showMessageDialog(null, lista);
        
    }
    public void mostraTotal(EstoqueModelo estoque){
       JOptionPane.showMessageDialog(null,"Total:" + estoque.getTotal()); 
    }
    
}
