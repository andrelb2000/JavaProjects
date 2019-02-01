/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class CidadaoGalaxyView {
    private JFrame cidFrame;
    
    
    private JLabel cidNomeJL;
    private JLabel cidPlanetaJL;
    private JLabel cidIdadeJL;
    private JLabel cidForcaJL;
    
    private JTextField cidNomeTF;
    private JTextField cidPlanetaTF;
    private JTextField cidIdadeTF;
    private JTextField cidForcaTF;

    private JButton armazenarCidButton;
    private JButton buscaCidButton;

    public CidadaoGalaxyView() {
      cidFrame     = new JFrame("Cidadao View");
      cidFrame.setSize(400, 400);
      cidFrame.setLayout(new FlowLayout());
      cidFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      cidNomeJL    = new JLabel("Nome Cidadao:");
      cidPlanetaJL = new JLabel("Planeta:");
      cidIdadeJL   = new JLabel("Idade:");
      cidForcaJL   = new JLabel("Forca:");
      
      cidNomeTF    = new JTextField(50);
      cidPlanetaTF = new JTextField(50);
      cidIdadeTF   = new JTextField(5); 
      cidForcaTF   = new JTextField(5);
      armazenarCidButton = new JButton("Armazenar");
      buscaCidButton   = new JButton("Buscar");
  
      cidFrame.add(cidNomeJL);
      cidFrame.add(cidNomeTF);
      
      cidFrame.add(cidPlanetaJL);
      cidFrame.add(cidPlanetaTF);
      
      cidFrame.add(cidIdadeJL);
      cidFrame.add(cidIdadeTF);
      
      
      cidFrame.add(cidForcaJL);
      cidFrame.add(cidForcaTF);

      cidFrame.add(armazenarCidButton);
      cidFrame.add(buscaCidButton);
        
      cidFrame.setVisible(true);
        
        
    }
    
    public void addArmazenaLisner(ActionListener l){
        armazenarCidButton.addActionListener(l);
    }
  
    public void addBuscaLisner(ActionListener l){
        buscaCidButton.addActionListener(l);
    }
    
    public CidadaoGalaxia obtemCid(){
        String nome    = cidNomeTF.getText();
        String planeta = cidPlanetaTF.getText();
        int    idade   = Integer.parseInt(cidIdadeTF.getText());
        int    forca   = Integer.parseInt(cidForcaTF.getText());
                
        CidadaoGalaxia cd = new CidadaoGalaxia(nome, planeta, idade,forca);
        return cd;
    }
    
    public void colocarCidadao(CidadaoGalaxia c){
        cidNomeTF.setText(c.getNomeCidadao());
        cidPlanetaTF.setText(c.getPlanetaCidadao());
        cidIdadeTF.setText(""+c.getIdadeCidadao());
        cidForcaTF.setText(""+c.getForcaCidadao());
        
    }
    
    
    
}
