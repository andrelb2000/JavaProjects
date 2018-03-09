/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import javax.swing.JOptionPane;

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
        JOptionPane.showMessageDialog(null, "Produto: " + NomeProduto + 
                    "  Preço: R$ " + Preco + "   Qde:" + Quantidade + 
                            "   Total: R$ "+Quantidade*Preco,
                            "Visualizador de Pessoa",JOptionPane.PLAIN_MESSAGE);
    }            
    boolean lerProduto(){
        this.NomeProduto  = JOptionPane.showInputDialog(null,"Insira o nome do produto:",
                                      "Dados do Produto", JOptionPane.OK_OPTION);
        if (this.NomeProduto != null) {
            String qdeSt = JOptionPane.showInputDialog(null,"Insira a quantidade:",
                                      "Dados do Produto", JOptionPane.OK_OPTION);
            if (qdeSt != null){
                this.Quantidade = Integer.parseInt(qdeSt);
                String precoSt = JOptionPane.showInputDialog(null,"Insira o preço unitario:",
                                      "Dados do Produto", JOptionPane.OK_OPTION);
                if (precoSt != null){
                    this.Preco = Double.parseDouble(precoSt);
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
