/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import java.util.Scanner;

public class ProdutoView {
    private Scanner input = new Scanner(System.in);
    private String  NomeProduto = "";
    private int     Quantidade = 0;
    private double  Preco = 1.0;
    private double  Total = 0.0;

    void showProduto(){
        System.out.println("Visualizador de Produtos:");
        System.out.println("Produto: " + NomeProduto);
        System.out.println("Preço: R$ " + Preco);
        System.out.println("Qde:" + Quantidade);
        System.out.println("Total: R$ "+ Total);
    }            
    boolean lerProduto(){
        System.out.println("Insira o nome do produto:");
        this.NomeProduto  = input.next();
        if (this.NomeProduto != null) {            
            System.out.println("Insira a quantidade: (-1) para encerrar");
            this.Quantidade = input.nextInt();
            if (this.Quantidade >= 0){
                System.out.println("Insira o preço unitario: (-1) para encerrar");
                this.Preco = input.nextDouble();
                if (this.Preco >=0){
                    return true;
                }
            }          
        }
        return false;
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
