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
    /**
     * Creates new form TelaJPanel
     * 
     */
    public TelaJPanel() {
        this.lista = new ArrayList<String>();
       
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 255, 102));

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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Iterator<String> it = lista.iterator();
       int nrCar=0, nrCam=0;
       while(it.hasNext()){
           String v = it.next();
           if (v.equalsIgnoreCase("Carro")){
               desenhaCarro(g,nrCar);
               nrCar++;
           }
           if (v.equalsIgnoreCase("Caminhao")){
               desenhaCaminhao(g,nrCam);
               nrCam++;
           }
           
           
           
       }   
    }
    
    private void desenhaCarro(Graphics g,int i){
        Dimension d = this.getSize();
        int meioX = d.width / 2;
        int meioY = d.height / 2;
        
       g.drawRect(meioX+20*i, meioY+moveCarroUp, 10, 10);
       /// Por seguranca //
       if( (meioY+moveCarroUp) >= d.height){
           moveCarroUp = 0;
       }
       
        
        
    }
    
    
    private void desenhaCaminhao(Graphics g,int i){
        Dimension d = this.getSize();
        int meioX = d.width / 3;
        int meioY = d.height / 3;
        
       g.drawRect(meioX+20*i, meioY+moveCamUp, 10, 40);
       /// Por seguranca //
       if( (meioY+moveCamUp) >= d.height){
           moveCamUp = 0;
       }        
        
    }
     
    //// Vamos criar uma lista de objetos que serao nossos veiculos ///
    // Variables declaration - do not modify
    // End of variables declaration
    private ArrayList<String> lista;

    private int moveCarroUp = 0;
    private int moveCamUp = 0;
    
    public void addNovoCarro(){
        lista.add("Carro");
    }
    public void addNovoCaminhao(){
        lista.add("Caminhao");
    }
    
    
    public void movCarrosUp(){
        moveCarroUp+=10;
    }

    public void movCaminhoesUp(){
        moveCamUp+=10;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
