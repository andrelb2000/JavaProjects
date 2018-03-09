/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc1;

/**
 *
 * @author andre
 */
public class PessoaModel {
    
    private String  Nome = "";
    private int     Idade = 0;

    public PessoaModel() {
    }

    
    
    public PessoaModel(String nome, int idade) {
        Nome = nome;
        Idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }
    
    
    
    
}
