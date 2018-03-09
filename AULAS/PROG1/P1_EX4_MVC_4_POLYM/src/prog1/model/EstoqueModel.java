/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1.model;

public class EstoqueModel {
    ProdutoModel p1 = null;
    ProdutoModel p2 = null;
    ProdutoModel p3 = null;
    
    public ProdutoModel criaProdutoCodigo(int c){
        ProdutoModel pm = null;
        switch (c){
                case 1: pm = new Alimentos();   break;
                case 2: pm = new Eletronicos(); break;
                case 3: pm = new Moveis();      break;
                default: pm = new Alimentos();
        }
        return pm;
    }
    public void setP1(ProdutoModel p1) {
        this.p1 = p1;
    }
    public void setP2(ProdutoModel p2) {
        this.p2 = p2;
    }
    public void setP3(ProdutoModel p3) {
        this.p3 = p3;
    }
}
