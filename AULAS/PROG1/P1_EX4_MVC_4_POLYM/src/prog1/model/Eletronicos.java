/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1.model;

/**
 *
 * @author andre
 */
public class Eletronicos extends ProdutoModel {
    Eletronicos() {}
    @Override
    public double ajustaPreco() {
        this.Preco = this.Preco *2;
        return this.Preco;
    }
}
