/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2ex1_listaprodutos;

import java.util.ArrayList;

// Criar o objeto que vai conter a lista de produtos
public class EstoqueModelo {
    private ArrayList<ProdutoModelo> listaProdutos;
    private double total = 0;

    public EstoqueModelo() {
        listaProdutos = new ArrayList<ProdutoModelo>();
    }
    public void insereProduto(String nomeProduto, double precoProduto,int qdeProduto){
        ProdutoModelo pm = new ProdutoModelo(nomeProduto, 
                                             precoProduto, 
                                             qdeProduto);
        listaProdutos.add(pm);
        total += pm.totalPreco();
        
    }
    public ArrayList<ProdutoModelo> getListaProdutos() {
        return listaProdutos;
    }
    public double getTotal() {
        return total;
    }
    
}
