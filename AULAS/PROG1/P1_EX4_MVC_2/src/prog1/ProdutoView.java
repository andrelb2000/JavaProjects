/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import java.util.Scanner;


/**
 *
 * @author andre
 */
public class ProdutoView {
    private String  NomeProduto = "";
    private int     Quantidade = 0;
    private double  Preco = 1.0;
    private double  Total = 0.0;

    public ProdutoView() {
    }
    // Mostra o conteudo do visualizador
    void showProduto(){
        System.out.println("Visualizador de Produtos:");
        System.out.println("Produto: " + NomeProduto);
        System.out.println("Preço: R$ " + Preco);
        System.out.println("Qde:" + Quantidade);
        System.out.println("Total: R$ "+ Total);
    }            

    public void setTotal(double Total) {
        this.Total = Total;
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
