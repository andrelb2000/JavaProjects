/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1_listajdbc;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author andre
 */
public class BebidaViewJFrame extends javax.swing.JFrame {

    private DefaultListModel<Bebida> bebidaListModel;
    
    public BebidaViewJFrame() {
        bebidaListModel = new DefaultListModel<Bebida>();       
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bebidajTextField1 = new javax.swing.JTextField();
        nrCoposjTextField2 = new javax.swing.JTextField();
        inserejButton1 = new javax.swing.JButton();
        carregajButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bebidasjList1 = new javax.swing.JList<Bebida>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bebida");

        jLabel2.setText("NrCopos");

        bebidajTextField1.setText("Cachaca");
        bebidajTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidajTextField1ActionPerformed(evt);
            }
        });

        nrCoposjTextField2.setText("23");

        inserejButton1.setText("INSERE");

        carregajButton2.setText("CARREGA");

        bebidasjList1.setModel(bebidaListModel);
        jScrollPane1.setViewportView(bebidasjList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(bebidajTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nrCoposjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inserejButton1)
                        .addGap(18, 18, 18)
                        .addComponent(carregajButton2))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bebidajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nrCoposjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserejButton1)
                    .addComponent(carregajButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void bebidajTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidajTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bebidajTextField1ActionPerformed
    public Bebida obterBebidaDigitada(){
        String nome    = bebidajTextField1.getText();
        int    nrcopos = Integer.parseInt(nrCoposjTextField2.getText());
        Bebida bebida = new Bebida(nome, nrcopos);
        return bebida;
    }
    public void inserirBebida(Bebida bebida){
        bebidaListModel.addElement(bebida);            
    }
    public void addInserirListener(ActionListener al){
        inserejButton1.addActionListener(al);
    }
    public void addCarregarListener(ActionListener al){
        carregajButton2.addActionListener(al);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bebidajTextField1;
    private javax.swing.JList<Bebida> bebidasjList1;
    private javax.swing.JButton carregajButton2;
    private javax.swing.JButton inserejButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nrCoposjTextField2;
    // End of variables declaration//GEN-END:variables
}
