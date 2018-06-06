/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10ex1jdbc.banco;

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

public class ControladorBancoJDBC2 {
    
    private String DB_URL = "jdbc:derby://localhost:1527/PRODUTODB/";
    private Connection conexaoDB = null;
    
    //Criar Conexão Principal com o banco
    public ControladorBancoJDBC2() {
        try {            
            
            conexaoDB = DriverManager.getConnection(DB_URL, "userdb", "userdb");            
        } catch (SQLException ex) {
            System.out.println("Erro de Conexao com o banco: "+ex);/// Controle de erro
        }
    }    
    // Ler todas as informações do BANCO
    public void lerBanco(){
        try {
            Statement comandoSQL = conexaoDB.createStatement();
            ResultSet blocoResultados = comandoSQL.executeQuery("SELECT NOME, "
                                                             + "PRECO, "
                                                             + "QUANTIDADE "
                                                             + "FROM PRODUTO");            
            while(blocoResultados.next()){
                System.out.print("NOME: "       + 
                                            blocoResultados.getString("NOME") );
                System.out.print(" | PRECO: "      + 
                                           blocoResultados.getString("PRECO") );
                System.out.println(" | QUANTIDADE: " + 
                                      blocoResultados.getString("QUANTIDADE") );
            }    
            blocoResultados.close();
            comandoSQL.close();                       
        } catch (SQLException ex) {
            System.out.println("Erro de LEITURA do banco: "+ex);/// Controle de erro
        }
    }    
    /// Inserir um registro no banco ///
    public void inserirBanco(String nome, double preco, int quantidade){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            String sql = "INSERT INTO PRODUTO"
                                 + "(NOME,PRECO,QUANTIDADE) "
                                 + "VALUES(\'"
                                 + nome + "\', "
                                 + preco + ", "
                                 + quantidade + ")";
            
            comandoSQL.executeUpdate(sql);            
            comandoSQL.close();
        }catch(SQLException e){
            System.out.println("Erro de INSERCAO no banco: "+e);
        }
    }
     
    /// Atualizar um registro do banco ///
    public void AtualizarBanco(String nome, double preco, int quantidade){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            comandoSQL.executeUpdate("UPDATE PRODUTO "
                                   + "SET PRECO = "   + preco + ", "
                                   + "QUANTIDADE = "  + quantidade 
                                   + " WHERE NOME = \'" + nome + "\'");
            comandoSQL.close();
        }catch(SQLException e){
            System.out.println("Erro de Atualizacao no banco: "+e);
        }
    }
        
   /// Remover Registro ///
    public void RemoverBanco(String nome){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            comandoSQL.executeUpdate("DELETE FROM PRODUTO "
                                   + "WHERE NOME = \'" + nome +"\'" );        
            comandoSQL.close();
        }catch(SQLException e){
            System.out.println("Erro de Remocao no banco: "+e);
        }
    }
   
    /// Remover Registro ///
    public void LimparBanco(){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            comandoSQL.executeUpdate("DELETE FROM PRODUTO");        
            comandoSQL.close();
        }catch(SQLException e){
            System.out.println("Erro de Remocao no banco: "+e);
        }
    }
    
    
    
    //Fechar a conexão com o banco
    public void encerrarBanco(){
        try {
            conexaoDB.close();
        } catch (SQLException ex) {
            System.out.println("Erro de fechamento do banco: "+ex);/// Controle de erro
        }
    }   
}
