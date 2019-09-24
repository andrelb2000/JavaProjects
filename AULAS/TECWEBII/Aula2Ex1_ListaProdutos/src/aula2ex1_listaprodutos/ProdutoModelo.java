/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2ex1_listaprodutos;

// Passo 2 - Construir o Modelo
public class ProdutoModelo {
    private String nomeProduto;
    private double precoProduto;
    private int    qdeProduto;
    
    // Construtor
    public ProdutoModelo(String nomeProduto, double precoProduto,int qdeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qdeProduto = qdeProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public int getQdeProduto() {
        return qdeProduto;
    }
    public double totalPreco(){
        return qdeProduto*precoProduto;
    }
    
    
}