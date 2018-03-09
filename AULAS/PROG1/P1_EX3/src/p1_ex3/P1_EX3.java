/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex3;

import java.util.Scanner;

public class P1_EX3 {
// Classe adptadora de entrada de dados
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Lista de múltiplos:");
        int numeroMultiplos = input.nextInt();
        boolean continuar = true;
        while (continuar){
            int m = leMultiplo();
            if (m>0){
                mostraMultiplos(numeroMultiplos, m);
            } else{
                continuar = false;
            }
        }
        System.out.println("Tarefa Encerrada!");    
    }
    public static int leMultiplo(){
       System.out.println("Múltiplos de que número ? (digite 0 para encerrar");
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
