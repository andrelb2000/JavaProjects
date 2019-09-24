/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1_carros_threadcrud;

import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author professor
 */
public abstract class Veiculo implements Runnable{
    protected int xInicial = 30;
    protected int yInicial = 50;
    protected String NomeJogador;
    private boolean parado = true;
    private JPanel painel;

    public Veiculo (String NomeJogador) {
        this.NomeJogador = NomeJogador;
    }
    public abstract int[] getRect1();
    public abstract int[] getRect2();
    public abstract int[] getCirc1();
    public abstract int[] getCirc2();

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }  

    public void go(){
        parado = false;
    }
    public void pare(){
        parado = true;
    }
    
    @Override
    public void run() {
        while(true){
            if(!parado){
                try{
                    Random r = new Random();                    
                    xInicial += r.nextInt(20);
                    Thread.sleep(500);
                    painel.repaint();
                }catch(Exception e){
                    
                }
            }
        }
        
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getxInicial() {
        return xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }
    
}
