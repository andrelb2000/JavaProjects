/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class Pessoa {
    private String nomePessoa = "Sem nome";
    private int    idadePessoa   = 0;
    private File pessoaFile = null;

    public Pessoa(String nome, int idade) {
        nomePessoa = nome;
        idadePessoa = idade;
    }
    
    public Pessoa(String nome, int idade, String nomearq) {
        nomePessoa = nome;
        idadePessoa = idade;
        pessoaFile = new File(nomearq);
        
        
    }
    public void savePessoa(){
        
        try {
            boolean noFinal = true;
            FileWriter fw = new FileWriter(pessoaFile,noFinal); 
                BufferedWriter bw = new BufferedWriter(fw);
                String linha = "Pessoa:" + this.nomePessoa + "Idade:" + idadePessoa + "\\n";
                fw.write(linha + "\r\n");
                fw.write(linha + "\r\n");
                fw.write(linha + "\r\n");
                fw.write(linha + "\r\n");
                
            fw.close();
                    
        } catch (IOException ex) {
            System.out.println("Erro de arquivo");
        }

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
