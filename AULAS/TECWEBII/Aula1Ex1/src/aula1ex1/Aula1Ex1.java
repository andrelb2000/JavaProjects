/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1ex1;

import javax.swing.JOptionPane;



/**
 *
 * @author andre
 */
public class Aula1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nrPokemons;
      String tipoPokemon;
      nrPokemons = JOptionPane.showInputDialog("Diga quantos Pokemons:");
      tipoPokemon = JOptionPane.showInputDialog("Diga o tipo:");
      
      int nrPok = Integer.parseInt(nrPokemons);
      
      JOptionPane.showMessageDialog(null, "Eu peguei  "+ nrPok + " pokemons "
                                   + "do tipo "+ tipoPokemon);
      }
    
}
