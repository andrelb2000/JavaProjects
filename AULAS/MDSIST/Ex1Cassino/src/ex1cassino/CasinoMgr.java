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
public class CasinoMgr {
    private Moeda moeda;
    private Dado  dado;
    private Carta carta;
    
    public CasinoMgr(){
        moeda = new Moeda();
        dado  = new Dado();
        carta = new Carta();        
    }
    public String jogarMoeda(){
        // 1 - Jogar a Moeda
        moeda.jogar();
        // 2 - Obter o resultado
        String resultado = moeda.obterPosicao();
       return resultado;    
    } 
    public String jogarDado(){
        // 1 - Jogar o dado
        dado.jogar();
        // 2 - Obter resultado
        String resultado = dado.obterPosicao();
        return resultado;
    }
    public String jogarCarta(){
        // 1 - Jogar a carta
        carta.jogar();
        // 2 - Obter resultado
        String resultado = carta.obterPosicao();
        return resultado;
    }   
}
