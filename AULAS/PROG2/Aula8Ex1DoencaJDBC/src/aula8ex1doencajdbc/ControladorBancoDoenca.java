/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8ex1doencajdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class ControladorBancoDoenca {
    private Connection conexaoDB;
    private String URL_CONEXAO = "jdbc:derby://localhost:1527/DOENCAMED/";
    
    public ControladorBancoDoenca(){
        try{
            conexaoDB = DriverManager.getConnection(URL_CONEXAO, "userdb", "userdb");
        }catch(Exception e){
            System.out.println("Erro de conexao: "+e);
        }
    }
    public void inserirDoenca(Doenca d){
        try{
            Statement comando = conexaoDB.createStatement();
            String sql = "INSERT INTO TB_DOENCA(NOME,NRPAC) "
                    + "VALUES (\'" + d.getNomeDoenca() + "\'" 
                    + " , "+ d.getNrPacientes()
                    + ")";
            comando.executeUpdate(sql);
            comando.close();        
        }catch(Exception e){
            System.out.println("Erro de insercao: "+e);
        }
    }
    public void carregarListaDoencas(ArrayList<Doenca> lista){
        try{
            Statement comando = conexaoDB.createStatement();
            String sql = "SELECT NOME,NRPAC "
                       + "FROM TB_DOENCA";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next()){
               String nome = resultado.getString("NOME");
               int    nr   = resultado.getInt("NRPAC");
               Doenca d = new Doenca(nome, nr);
               lista.add(d);               
            }            
        }catch(Exception e){
            System.out.println("Erro de leitura "+e);
        }
        
        
    }
    
}
