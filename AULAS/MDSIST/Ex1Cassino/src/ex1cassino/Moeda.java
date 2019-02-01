/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1cassino;
import java.util.Random;
public class Moeda {
   protected String posicao;  
   public void jogar(){
       //TODO fazer codigo do Jogar
       Random r = new Random();
       int i = r.nextInt(2);
       if(i==0){
           posicao = "Cara";
       }else{
           posicao = "Coroa";
       }
   }
   public String obterPosicao(){
       return posicao;
   }
}
