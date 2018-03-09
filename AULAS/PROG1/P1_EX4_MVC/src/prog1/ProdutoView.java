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
    Scanner input = new Scanner(System.in);
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
    boolean lerProduto(){
        System.out.println("Entrar Produtos:");
        System.out.print("Insira o nome do produto:");
        this.NomeProduto = input.next();
                
        System.out.print("Insira a quantidade:");
        this.Quantidade = input.nextInt();
        
        System.out.print("Insira o preço unitario:");
        this.Preco = input.nextDouble();
        return true;
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
    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    
    
    
}
