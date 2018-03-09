/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex3;

import java.util.Scanner;


/**
 *
 * @author andre
 */
public class MultiplosView {
    private Scanner input = new Scanner(System.in);
    private int QdeMultiplos = 0;
    private int MultiploGerador = 1;
    
    public boolean leMultiplosInfo(){
       System.out.println("Quantos números deseja que eu imprima ? ");
       this.QdeMultiplos = input.nextInt();
       
       System.out.println("Múltiplos de que número ? (0 para encerrar)");
       this.MultiploGerador = input.nextInt();
       if (this.MultiploGerador == 0){
           return false;
       }
       return true;              
    }    
    public void mostraMultiplos(String serie){ 
        System.out.print("Múltiplos de "+ this.MultiploGerador + ": " + serie);
        System.out.println();
    }  
    public int getQdeMultiplos() {
        return QdeMultiplos;
    }
    public int getMultiploGerador() {
        return MultiploGerador;
    }
}
