/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1cassino;

/**
 *
 * @author Administrador
 */
public class Ex1Cassino {

    public static void main(String[] args) {
        
        CasinoMgr cassinoMgr = new CasinoMgr();
        
        String res1 = cassinoMgr.jogarMoeda();
        String res2 = cassinoMgr.jogarDado();
        String res3 = cassinoMgr.jogarCarta();       
        System.out.println("Valor Jogado1:"+res1); 
        System.out.println("Valor Jogado2:"+res2); 
        System.out.println("Valor Jogado3:"+res3);         
    }    
}
/*

        Moeda moeda = new Moeda();
        moeda.jogar();
        String resultado = moeda.obterPosicao();
        System.out.println("Valor Jogado:"+resultado); 
         /*------------------------------*/
