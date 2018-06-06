/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8ex1_paint.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class TelaJPanel extends javax.swing.JPanel {

    public TelaJPanel() {
        this.lista = new ArrayList<String>();       
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(java.awt.Color.orange);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
// </editor-fold>                        
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Iterator<String> it = lista.iterator();        
       while(it.hasNext()){
           String v = it.next();
           if (v.equalsIgnoreCase("Carro")){
               desenhaCarro(g);
           }
           if (v.equalsIgnoreCase("Caminhao")){
               desenhaCaminhao(g);
           }
       }   
    }
    
    private void desenhaCarro(Graphics g){
        Dimension d = this.getSize();
        int meioX = d.width / 2;
        int meioY = d.height / 2;        
       g.drawRect(meioX, meioY, 10, 10);
    }
    
    private void desenhaCaminhao(Graphics g){
        Dimension d = this.getSize();
        int meioX = d.width / 3;
        int meioY = d.height / 3;        
       g.drawRect(meioX, meioY, 10, 40);
    }
     
    //// Vamos criar uma lista de objetos que serao nossos veiculos ///
    // Variables declaration - do not modify
    // End of variables declaration
    private ArrayList<String> lista;
    
    public void addNovoCarro(){
        lista.add("Carro");
    }
    public void addNovoCaminhao(){
        lista.add("Caminhao");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
