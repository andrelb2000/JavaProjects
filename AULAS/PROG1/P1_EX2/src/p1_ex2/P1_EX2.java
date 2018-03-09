/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex2;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class P1_EX2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {        
        System.out.println("Lista de múltiplos:");
        System.out.println("Quantos números deseja que eu imprima ? ");
        int numeroMultiplos = input.nextInt();
        int m = leMultiplo();
        mostraMultiplos(numeroMultiplos, m);
        System.out.println("Tarefa Encerrada!");    
    }
    public static int leMultiplo(){
       System.out.println("Múltiplos de que número ? ");
       int multiplo = input.nextInt();
       return multiplo;
    }
    public static void mostraMultiplos(int n,int m){ 
        System.out.print("Múltiplos de "+m+ ": ");
        for(int i=0 ; i < n ; i++){
            System.out.print(" " + i*m);
        }
        System.out.println();
    }
}
