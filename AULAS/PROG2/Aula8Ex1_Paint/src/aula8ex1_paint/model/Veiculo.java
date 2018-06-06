/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8ex1_paint.model;

import java.awt.Graphics;

/**
 *
 * @author andre
 */
public abstract class Veiculo {
    protected int posX,posY;
    protected String nomeVeiculo;

    public Veiculo(int posX, int posY, String nomeVeiculo) {
        this.posX = posX;
        this.posY = posY;
        this.nomeVeiculo = nomeVeiculo;
    }
    
    
    
    public abstract void desenha(Graphics g);    
}
