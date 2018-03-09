/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

/**
 *
 * @author andre
 */
public class ProdutoModel {
    
    private String  NomeProduto = "Bicicleta";
    private int     Quantidade = 12;
    private double  Preco = 235.50;


    public ProdutoModel() {
    }

   
    
    public ProdutoModel(String nome, int qde, double preco) {
        this.NomeProduto = nome;
        this.Quantidade = qde;
        this.Preco = preco;
    }

    public double calculaTotal(){
        return Quantidade * Preco;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public double getPreco() {
        return Preco;
    }

    
    
    
    
    
}
