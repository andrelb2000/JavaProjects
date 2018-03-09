/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_ex1;

import java.util.Scanner;
public class P1_Ex1 {

    public static void main(String[] args) {
        // Classe adptadora de entrada de dados
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lista de múltiplos:");
        System.out.println("Quantos números deseja que eu imprima ? ");
        int numeroMultiplos = input.nextInt();
        
       System.out.println("Múltiplos de que número ? ");
       int multiplo = input.nextInt();
       
       for(int i=0 ; i < numeroMultiplos; i++){
           System.out.println("Multiplo de " + i + " = " + i*multiplo);
       }
        System.out.println("Tarefa Encerrada!");
    }    
}
