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
    
    private String  NomeProduto = "";
    private int     Quantidade = 0;
    private double  Preco = 1.0;


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
    
    
    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    
    
}
