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
public class EstoqueControler {

    public void showProduto(){
        ProdutoModel pm = new ProdutoModel();
        ProdutoView  pv = new ProdutoView();
       
        if (pv.lerProduto()){
            // carregar o modelo com os dados lidos
            pm.setNomeProduto(pv.getNomeProduto());
            pm.setQuantidade(pv.getQuantidade());
            pm.setPreco(pv.getPreco());
            //Processar
            pv.setTotal(pm.calculaTotal());
            //Mostar produto
            pv.showProduto();    
        };            
    }    
}
