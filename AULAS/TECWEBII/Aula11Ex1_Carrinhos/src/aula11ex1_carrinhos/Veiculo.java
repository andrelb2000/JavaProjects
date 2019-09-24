/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11ex1_carrinhos;

/**
 *
 * @author andre
 */
public abstract class Veiculo {
    protected String nomeJogador;
    protected int xInicial,yInicial;

    public Veiculo(String nomeJogador, int xInicial, int yInicial) {
        this.nomeJogador = nomeJogador;
        this.xInicial = xInicial;
        this.yInicial = yInicial;
    }
    
    abstract public int[] getPosRect1();
    abstract public int[] getPosRect2();
    abstract public int[] getPosCircle1();
    abstract public int[] getPosCircle2();

    public String getNomeJogador() {
        return nomeJogador;
    }

    public int getxInicial() {
        return xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }
    
}
