/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2_frame1;

/**
 *
 * @author andre
 */
public class PessoaModel {
    
    private String  Nome = "";
    private int     Idade = 0;

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

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    
    
    
}
