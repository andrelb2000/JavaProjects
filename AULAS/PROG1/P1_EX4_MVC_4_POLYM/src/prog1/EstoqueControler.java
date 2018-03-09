/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import prog1.model.EstoqueModel;
import prog1.model.ProdutoModel;

/**
 *
 * @author andre
 */
public class EstoqueControler {

    public void showProduto(){
        ProdutoModel pm;
        EstoqueModel em = new EstoqueModel();
        ProdutoView  pv = new ProdutoView();   
        String n1=null; String n2 = null; String n3=null;
        if(pv.lerProduto()){
            // carregar o modelo com os dados lidos
            pm = em.criaProdutoCodigo(pv.getTipoProd());
            pm.setNomeProduto(pv.getNomeProduto());
            n1 = pv.getNomeProduto();
            pm.setQuantidade(pv.getQuantidade());
            pm.setPreco(pv.getPreco());
            pv.setPreco(pm.ajustaPreco());           
            pv.setTotal(pm.calculaTotal());
            //Mostar produto
            pv.showProduto();    
            em.setP1(pm);
        }
        if(pv.lerProduto()){
            pm = em.criaProdutoCodigo(pv.getTipoProd());
            pm.setNomeProduto(pv.getNomeProduto());
            n2 = pv.getNomeProduto();
            pm.setQuantidade(pv.getQuantidade());
            pm.setPreco(pv.getPreco());
            pv.setPreco(pm.ajustaPreco());           
            pv.setTotal(pm.calculaTotal());
            pv.showProduto();    
            em.setP2(pm);
        }        
        if(pv.lerProduto()){
            pm = em.criaProdutoCodigo(pv.getTipoProd());
            pm.setNomeProduto(pv.getNomeProduto());
            n3 = pv.getNomeProduto();
            pm.setQuantidade(pv.getQuantidade());
            pm.setPreco(pv.getPreco());
            pv.setPreco(pm.ajustaPreco());           
            pv.setTotal(pm.calculaTotal());
            pv.showProduto();    
            em.setP3(pm);
        }        
        
        pv.showProdutosList(n1, n2, n3);
        
    }    
}
