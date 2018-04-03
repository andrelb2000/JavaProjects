/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;
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
    
    public Pessoa(String nomearq) {
        nomeArq = nomearq;
        loadPessoa();
    }
    
    public Pessoa(String nome, int idade, String nomearq) {
        nomePessoa = nome;
        idadePessoa = idade;
        pessoaFile = new File(nomearq);
        nomeArq = nomearq;
    }
    
    public void loadPessoa(){
        try {
            FileReader fr = new FileReader(this.nomeArq);
            BufferedReader br = new BufferedReader(fr);
                String linha = br.readLine();
                StringTokenizer st = new StringTokenizer(linha, ",");
                this.nomePessoa = (String) st.nextElement();
                this.idadePessoa = Integer.parseInt((String)st.nextElement());  
            fr.close();
        } catch (IOException ex) {
            System.out.println("Erro de arquivo");
        }               
    }
    

    public void savePessoa(){    
        try {
            boolean noFinal = true;
            FileWriter fw = new FileWriter(nomeArq,noFinal); 
                fw.write(this.nomePessoa + "\r\n");
                fw.write(this.idadePessoa + "\r\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Erro de arquivo");
        }
    }

    
    
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
