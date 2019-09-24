/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4ex1_listajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GerenteBanco {
    private String urlConexao = "jdbc:derby://localhost:1527/BEBIDADB";
    private Connection conexaoBanco;

    public GerenteBanco() {
        try{
            conexaoBanco = DriverManager.getConnection(urlConexao,
                                                       "userdb","userdb");  
        }catch(SQLException e){
             System.out.println("Erro na conexao - "+e);
        }
    }
    public void inserirBanco(Bebida bebida){
        try{
             Statement comando = conexaoBanco.createStatement();   
             String sql = "INSERT INTO BEBIDA_TB(NOME,NRCOPOS) "
                         + "VALUES('" + bebida.getNomeBebida() + "',"+ 
                                        bebida.getNrCopos()    + ")";
             System.out.println("INSERT: "+sql);
             comando.executeUpdate(sql);
             comando.close();
        }catch(SQLException e){
             System.out.println("Erro na conexao - "+e);
        }
    }
    
    
    
    
}
