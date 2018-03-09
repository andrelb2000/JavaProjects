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
public class Estoque1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criar Visualizador
        ProdutoView pv = new ProdutoView();

        //Criar Modelo
        ProdutoModel p1 = new ProdutoModel();       
        //Inserir dados no visualizador
        pv.setNomeProduto(p1.getNomeProduto());
        pv.setQuantidade(p1.getQuantidade());
        pv.setPreco(p1.getPreco());
        //Mostrar dados
        pv.showProduto();                
                
        
        ProdutoModel p2 = new ProdutoModel("Geladeira",5,3500);
        pv.setNomeProduto(p2.getNomeProduto());
        pv.setQuantidade(p2.getQuantidade());
        pv.setPreco(p2.getPreco());
        pv.showProduto();        
        
        
    }
    
}
