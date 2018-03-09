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
public class Pessoa {
    private String nomePessoa = "Sem nome";
    private int    idadePessoa   = 0;

    public Pessoa(String nome, int idade) {
        nomePessoa = nome;
        idadePessoa = idade;
    }
    public void printPessoa(){
        System.out.println("Nome:" + nomePessoa + " Idade:"+idadePessoa);
    }
    public int calculaMeses(){
        return idadePessoa *12;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public int getIdadePessoa() {
        return idadePessoa;
    }
    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
}
