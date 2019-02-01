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
public class Dado extends Moeda {
    public void jogar(){
       Random r = new Random();
       int i = r.nextInt(6);
       posicao = "Lado "+ (i+1);  
    }
}
