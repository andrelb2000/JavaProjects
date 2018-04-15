
package aula07_ex1;

import java.io.BufferedReader;
import java.io.FileWriter;


public abstract class Pessoa {
    protected String nomePessoa;
    protected int idade;
    protected String nomeArq = "";
    protected boolean append = true;

    public Pessoa(String nomePessoa, int idade) {
        this.nomePessoa = nomePessoa;
        this.idade = idade;
    }
    
    public Pessoa(){        
    }
    public abstract void salvar();
    public abstract void salvar(FileWriter fw);
    public abstract boolean carregar(BufferedReader bfr);
    
    
    public void setNomeArq(String nomeArq) {
        this.nomeArq = nomeArq;
    }

    public void setAppend(boolean append) {
        this.append = append;
    }
    
    
    
    
}
