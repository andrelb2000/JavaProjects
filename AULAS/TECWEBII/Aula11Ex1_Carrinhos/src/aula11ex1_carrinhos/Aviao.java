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
public class Aviao  extends Veiculo{

    public Aviao(String nomeJogador, int xInicial, int yInicial) {
        super(nomeJogador, xInicial, yInicial);
    }
    @Override
    public int[] getPosRect1() {
        int[] coord = new int[4];
        coord[0] = xInicial;
        coord[1] = yInicial;
        return coord;
     }
    @Override
    public int[] getPosRect2() {
        int[] coord = new int[4];
        coord[0] = xInicial;
        coord[1] = yInicial;
        return coord;
    }
    @Override
    public int[] getPosCircle1() {
        int[] coord = new int[4];
        coord[0] = xInicial;
        coord[1] = yInicial;
        return coord;
    }
    @Override
    public int[] getPosCircle2() {
        int[] coord = new int[4];
        coord[0] = xInicial;
        coord[1] = yInicial;
        return coord;
    }
    
    
}
