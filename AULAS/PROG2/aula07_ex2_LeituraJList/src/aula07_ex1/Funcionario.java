/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alunoti
 */
public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    

    public Funcionario(double salario, String cargo, String nomePessoa, int idade) {
        super(nomePessoa, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario() {
        super();
    }

    @Override
    public String toString() {
        return nomePessoa + " - " + "R$ " + salario ;
    }
    
    
    
    public void salvar(){
        
        FileWriter fw;
        try {
            fw = new FileWriter(nomeArq, this.append);       
            fw.write(this.nomePessoa + "," + 
                     this.idade + "," +
                     this.cargo + "," +
                     this.salario +        
                     "\r\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }        
    } 
    public void carregar(){
        try {
            FileReader fr = new FileReader(this.nomeArq);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            
            StringTokenizer st = new StringTokenizer(linha,",");
            this.nomePessoa = st.nextToken(); 
            this.idade      = Integer.parseInt(st.nextToken());
            this.cargo      = st.nextToken();
            this.salario    = Double.parseDouble(st.nextToken());
            
            br.close();
            fr.close();            
        } catch (Exception e) {
            System.out.println("Deu m... Erro="+e);
        }
    }
    
    
    public void carregar(String linha){
        try {
            
            StringTokenizer st = new StringTokenizer(linha,",");
            this.nomePessoa = st.nextToken(); 
            this.idade      = Integer.parseInt(st.nextToken());
            this.cargo      = st.nextToken();
            this.salario    = Double.parseDouble(st.nextToken());            
        } catch (Exception e) {
            System.out.println("Deu m... Erro="+e);
        }
    }
    
    
    
}  

