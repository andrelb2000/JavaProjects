/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1cassino;

import java.util.Random;

/**
 *
 * @author Administrador
 */
public class Carta extends Moeda{
    private String naipe;
    public void jogar(){
       Random r = new Random();
       Random n = new Random();
       int i = r.nextInt(13);
       int j = n.nextInt(4);
       naipe   = "Naipe "+ (j+1);        
       posicao = "Carta "+ (i+1);  
    }
    public String obterPosicao(){
        return posicao + " - " + naipe;
    }
}
