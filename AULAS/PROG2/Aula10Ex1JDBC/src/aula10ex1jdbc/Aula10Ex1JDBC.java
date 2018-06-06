/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1jdbc;

/**
 *
 * @author andre
 */
public class Aula10Ex1JDBC {
    public static void main(String[] args) {
        ControladorBancoJDBC cbj = new ControladorBancoJDBC();
        cbj.LimparBanco();
        System.out.println("======== CONTEUDO 1 (INSERT)============");
        cbj.inserirBanco("GASOLINA", 10, 500);
        cbj.inserirBanco("ALCOOL",    5, 800);
        cbj.inserirBanco("DIESEL",    3, 500);
        cbj.inserirBanco("GNV",       2, 1000);       
        cbj.lerBanco();       
        System.out.println("======== CONTEUDO 2 (UPDATE)=============");
        cbj.AtualizarBanco("DIESEL", 6, 700);
        cbj.lerBanco();
        System.out.println("======== CONTEUDO 3 (DELETE)===========");
        cbj.RemoverBanco("ALCOOL");
        cbj.lerBanco();               
        System.out.println("======== CONTEUDO 4 (Limpar tudo)======");
        cbj.RemoverBanco("GASOLINA");
        cbj.RemoverBanco("DIESEL");
        cbj.RemoverBanco("GNV");
        cbj.lerBanco();        
        cbj.encerrarBanco();
    }
    
}
