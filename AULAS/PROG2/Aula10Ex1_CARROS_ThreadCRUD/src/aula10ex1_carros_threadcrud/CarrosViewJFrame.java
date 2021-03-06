/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1_carros_threadcrud;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author professor
 */
public class CarrosViewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CarrosViewJFrame
     */
    private ArrayList<Veiculo> pistaCarros;    

    
    public CarrosViewJFrame() {
        pistaCarros = new ArrayList<Veiculo>();
        initComponents();
        pistaCorridaJPanel1.setPistaCorrida(pistaCarros);
    }

    public Veiculo obterVeiculoDigitado(){
        String jogador = jogadorjTextField1.getText();
        String veiculo = veiculojTextField2.getText();
        if(veiculo.equalsIgnoreCase("Carro")){
            return new Carro(jogador);
        }else if(veiculo.equalsIgnoreCase("Moto")){
            return new Moto(jogador);
        }else{
            return new Carro(jogador);
        }            
    }
    public void insereVeiculoPista(Veiculo v){
        int nrCarros = pistaCarros.size();
        v.setyInicial(nrCarros*60+50);
        //Thread t = new Thread(v);
        //t.start();
        pistaCarros.add(v); 
        pistaCorridaJPanel1.repaint();        
    }
    public void limparPista(){
        pistaCarros.clear();
    }
    public void iniciarCorrida(){
            Iterator<Veiculo> it = pistaCarros.iterator();
            while(it.hasNext()){
                Veiculo v = (Veiculo) it.next();     
                v.go();
                v.setPainel(pistaCorridaJPanel1);
                Thread t = new Thread(v);
                t.start();
            }
    }
    public void pararCorrida(){
            Iterator<Veiculo> it = pistaCarros.iterator();
            while(it.hasNext()){
                Veiculo v = (Veiculo) it.next();
                v.pare();
            }        
    }
    public void addInsereListener(ActionListener al){
        inserejButton1.addActionListener(al);
    }
    public void addIniciarCorridaListener(ActionListener al){
       iniciarjButton6.addActionListener(al);
    }
    public void addPararCorridaListener (ActionListener al){
        pararjButton7.addActionListener(al);
    }
    public void addLimparPistaListener(ActionListener al){
        limpajButton2.addActionListener(al);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pistaCorridaJPanel1 = new aula10ex1_carros_threadcrud.PistaCorridaJPanel();
        jLabel1 = new javax.swing.JLabel();
        jogadorjTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        veiculojTextField2 = new javax.swing.JTextField();
        inserejButton1 = new javax.swing.JButton();
        limpajButton2 = new javax.swing.JButton();
        alterajButton3 = new javax.swing.JButton();
        removejButton4 = new javax.swing.JButton();
        listarjButton5 = new javax.swing.JButton();
        iniciarjButton6 = new javax.swing.JButton();
        pararjButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pistaCorridaJPanel1.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout pistaCorridaJPanel1Layout = new javax.swing.GroupLayout(pistaCorridaJPanel1);
        pistaCorridaJPanel1.setLayout(pistaCorridaJPanel1Layout);
        pistaCorridaJPanel1Layout.setHorizontalGroup(
            pistaCorridaJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        pistaCorridaJPanel1Layout.setVerticalGroup(
            pistaCorridaJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        jLabel1.setText("JOGADOR: ");

        jogadorjTextField1.setText("Jogador1");

        jLabel2.setText("VEICULO");

        veiculojTextField2.setText("Carro");

        inserejButton1.setText("INSERE");

        limpajButton2.setText("Limpa Pista");

        alterajButton3.setText("Alterar");

        removejButton4.setText("Remover");

        listarjButton5.setText("Listar");

        iniciarjButton6.setText("Iniciar");

        pararjButton7.setText("Parar");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jogadorjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(veiculojTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inserejButton1)
                                .addGap(18, 18, 18)
                                .addComponent(limpajButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alterajButton3)
                                .addGap(18, 18, 18)
                                .addComponent(removejButton4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listarjButton5)
                        .addGap(18, 18, 18)
                        .addComponent(iniciarjButton6)
                        .addGap(18, 18, 18)
                        .addComponent(pararjButton7)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(pistaCorridaJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jogadorjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserejButton1)
                    .addComponent(limpajButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(veiculojTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterajButton3)
                    .addComponent(removejButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarjButton5)
                    .addComponent(iniciarjButton6)
                    .addComponent(pararjButton7)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pistaCorridaJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pistaCorridaJPanel1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterajButton3;
    private javax.swing.JButton iniciarjButton6;
    private javax.swing.JButton inserejButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jogadorjTextField1;
    private javax.swing.JButton limpajButton2;
    private javax.swing.JButton listarjButton5;
    private javax.swing.JButton pararjButton7;
    private aula10ex1_carros_threadcrud.PistaCorridaJPanel pistaCorridaJPanel1;
    private javax.swing.JButton removejButton4;
    private javax.swing.JTextField veiculojTextField2;
    // End of variables declaration//GEN-END:variables
}
