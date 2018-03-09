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
    private int     Quantidade = 13;
    private double  Preco = 123.50;


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
    
    
    
    void showProduto(){
        System.out.println("Visualizador de Produtos:");
        System.out.println("Produto: " + NomeProduto);
        System.out.println("Preço: R$ " + Preco);
        System.out.println("Qde:" + Quantidade);
        System.out.println("Total: R$ "+ calculaTotal());
    }      
    
    
    
    
    
}
