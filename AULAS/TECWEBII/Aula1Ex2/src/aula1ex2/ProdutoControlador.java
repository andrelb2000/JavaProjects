/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ex2;

/**
 *
 * @author andre
 */
public class ProdutoControlador {
    
    // Metodo principal de inicio do sistema
    public void executar(){
        //TODO Codigo do sistema
        // 1 - Criar a view
        ProdutoVierw pv = new ProdutoVierw();
        
       // 2 - Mandar ler o produto
        pv.leProduto();
        
       //3 - Criar um Produto (Modelo) a partir do produto lido
       String nome = pv.getNomeProdutoView();
       int qde = pv.getQdeProdutoView();
       double preco = pv.getPrecoProdutoView();
       ProdutoModelo  pm = new ProdutoModelo(nome, qde, preco);
       
       //4 - Obter o total processadso no modelo
       double total = pm.calculaTotal();
       
       //5 - Mostrar o Produto
       pv.mostraProduto(total);       
    }
}
