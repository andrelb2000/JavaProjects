/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2ex1_listaprodutos;

/**
 *
 * @author andre
 */
public class ProdutoControlador {
    // Passo 1 - Criar metodo de execucao inicial
    public void executar(){
        //1 - Criar o Modelo
        EstoqueModelo em = new EstoqueModelo();
        //2 - Criar a View
        ProdutoView pv = new ProdutoView();
        
        //3 - Executar a view
        pv.leProdutos(em);
        pv.mostraProdutos(em);
        pv.mostraTotal(em);
    }
    
}
