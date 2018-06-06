/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula9ex1jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

// Passos importantes:
// Aba Servicoes - Java DB - Propriedades - Localizacao do banco
// Adicionar o Derby JAR nas bibliotecas

public class ControladorBanco {
    
    private String DB_URL = "jdbc:derby://localhost:1527/PRODUTODB/";
    private Connection conexaoDB = null;
    
    public ControladorBanco() {
        try {            
            conexaoDB = DriverManager.getConnection(DB_URL, "userdb", "userdb");            
        } catch (SQLException ex) {
            /// Controle de erro
        }
    }    
    public void lerBanco(){
        try {
            Statement comandoSQL = conexaoDB.createStatement();
            ResultSet blocoResultados = comandoSQL.executeQuery("SELECT NOME, "
                                                             + "PRECO, "
                                                             + "QUANTIDADE "
                                                             + "FROM PRODUTO");            
            while(blocoResultados.next()){
                System.out.println("NOME: "       + 
                                            blocoResultados.getString("NOME") );
                System.out.println("PRECO: "      + 
                                           blocoResultados.getString("PRECO") );
                System.out.println("QUANTIDADE: " + 
                                      blocoResultados.getString("QUANTIDADE") );
            }    
            blocoResultados.close();
            comandoSQL.close();                       
        } catch (SQLException ex) {
            /// Controle de erro
        }
    }    
    public void encerrarBanco(){
        try {
            conexaoDB.close();
        } catch (SQLException ex) {
            /// Controle de erro
        }
    }   
}
