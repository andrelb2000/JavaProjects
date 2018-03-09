/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1;

/**
 *
 * @author andre
 */
public class P1_MVC_EX1_Pessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Isis Valverde", 23);
        p1.printPessoa();
        int nmeses = p1.calculaMeses();
        System.out.println("Ja viveu "+nmeses + " Meses");        
    }    
}
