/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1_carros_threadcrud;

/**
 *
 * @author professor
 */
public class Carro extends Veiculo{

    public Carro(String NomeJogador) {
        super(NomeJogador);
    }

    @Override
    public int[] getRect1() {
        int[] coord = new int[4];
        coord[0] = xInicial;
        coord[1] = yInicial;
        coord[2] = 50;
        coord[3] = 15;
        return coord;
    }

    @Override
    public int[] getRect2() {
        int[] coord = new int[4];
        coord[0] = xInicial + 5;
        coord[1] = yInicial-10;
        coord[2] = 30;
        coord[3] = 10;
        return coord;
    }

    @Override
    public int[] getCirc1() {
        int[] coord = new int[4];
        coord[0] = xInicial - 10;
        coord[1] = yInicial + 5;
        coord[2] = 20;
        coord[3] = 20;
        return coord;
    }

    @Override
    public int[] getCirc2() {
        int[] coord = new int[4];
        coord[0] = xInicial + 40;
        coord[1] = yInicial +5;
        coord[2] = 20;
        coord[3] = 20;
        return coord;
    }

 
}
