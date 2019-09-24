/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7ex1jdbc_exames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ControladorBANCO {
    Connection conexaoDB;
    String URL_DB = "jdbc:derby://localhost:1527/DATAMED/";
    
    public ControladorBANCO(){
        try{
            conexaoDB = DriverManager.getConnection(URL_DB, "userdb", "userdb");
            System.out.println("Conexao concluida com exito");
        }catch(SQLException sqle){
            System.out.println(sqle);
        }   
    }
    public void inserirExame(Exame ex){
        try{
            Statement comando = conexaoDB.createStatement();
            String sqlInsert = "INSERT INTO TB_EXAME (EXAME,PRECO) "
                + "VALUES(\'" + ex.getNomeExame() +"\'," + ex.getPrecoExame()+")";        
            comando.executeUpdate(sqlInsert);
            comando.close();            
        }catch(SQLException sqle){
                 System.out.println(sqle);   
        }  
    }
    public void recuperarExames(ArrayList<Exame> lista){
        try{
            Statement comando = conexaoDB.createStatement();
            String sqlQuery = "SELECT EXAME,PRECO "
                            + "FROM TB_EXAME";
            ResultSet resultado = comando.executeQuery(sqlQuery);
            while(resultado.next()){
                String exame = resultado.getString("EXAME");
                double preco = resultado.getDouble("PRECO");
                Exame e = new Exame(exame, preco);
                lista.add(e);                
            }            
        }catch(SQLException se){
             System.out.println(se);  
        }
    }   
}
