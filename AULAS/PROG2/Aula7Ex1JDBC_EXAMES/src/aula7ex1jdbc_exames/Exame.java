/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7ex1jdbc_exames;


public class Exame {
    private String nomeExame;
    private double precoExame;

    public Exame(String nomeExame, double precoExame) {
        this.nomeExame = nomeExame;
        this.precoExame = precoExame;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public double getPrecoExame() {
        return precoExame;
    }

    @Override
    public String toString() {
        return  nomeExame ;
    }
    
    
}
