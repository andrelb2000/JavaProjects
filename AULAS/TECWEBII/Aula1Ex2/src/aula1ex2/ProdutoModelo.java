/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ex2;

/**
 *
 * @author andre
 */
public class ProdutoModelo {
    private String nomeProduto;
    private int qdeProduto;
    private double precoProduto;
    
    /*
    public ProdutoModelo(String nome,int qde,double preco){
        nomeProduto = nome;
        qdeProduto = qde;
        precoProduto = preco;        
    }
*/

    public ProdutoModelo(String nomeProduto, int qdeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.qdeProduto = qdeProduto;
        this.precoProduto = precoProduto;
    }

    
    
    public double calculaTotal(){
        return qdeProduto * precoProduto;
    }
    
    
    
}
