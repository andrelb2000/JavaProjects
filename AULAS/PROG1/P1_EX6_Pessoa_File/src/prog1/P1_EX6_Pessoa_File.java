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
public class P1_EX6_Pessoa_File {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Isis Valverde", 23,"D:\\pessoa.txt");
        p1.savePessoa();
        
        p1.printPessoa();
        int nmeses = p1.calculaMeses();
        System.out.println("Ja viveu "+nmeses + " Meses");  
        
        System.out.println("Lendo do Arquivo"); 
        Pessoa p2 = new Pessoa("D:\\pessoa.txt");
        p2.printPessoa();
        
        
    }    
}
