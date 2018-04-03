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
    private String nomeArq = null;
    
    public Pessoa(String nome, int idade, String nomearq) {
        nomePessoa = nome;
        idadePessoa = idade;
        pessoaFile = new File(nomearq);
        nomeArq = nomearq;
    }
    public void savePessoa(){    
        try {
            boolean noFinal = true;
            FileWriter fw = new FileWriter(nomeArq,noFinal); 
                String linha = "Pessoa:" + this.nomePessoa + "Idade:" + 
                                idadePessoa + "\r\n";
                fw.write(linha);
            fw.close();
        } catch (IOException ex) {
            System.out.println("Erro de arquivo");
        }
    }
    
    
    public Pessoa(String nome, int idade) {
        nomePessoa = nome;
        idadePessoa = idade;
    }  
    public void savePessoa2(){
        try {
            boolean noFinal = true;
            FileWriter fw = new FileWriter(pessoaFile,noFinal); 
                BufferedWriter bw = new BufferedWriter(fw);
                String linha = "Pessoa:" + this.nomePessoa + "Idade:" +
                               idadePessoa + "\r\n";
                bw.write(linha);               
            bw.close();                    
        } catch (IOException ex) {
            System.out.println("Erro de arquivo");
        }
    }
    public void savePessoa3(){   
        try {
            boolean noFinal = true;
            FileWriter fw = new FileWriter(pessoaFile,noFinal); 
                BufferedWriter bw = new BufferedWriter(fw);
                String linha = "Pessoa:" + this.nomePessoa + "Idade:" + 
                               idadePessoa + "\r\n";
                bw.write(linha);
            bw.close();                   
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
