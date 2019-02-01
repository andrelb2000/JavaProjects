/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aularevisaocarros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class BancoCarro {
    
    private String DB_URL = "jdbc:derby://localhost:1527/VEICULODB/";
    private Connection conexaoDB = null;

    public BancoCarro() {
        try {                        
            conexaoDB = DriverManager.getConnection(DB_URL, "usrmob", "usrmob");            
        } catch (SQLException ex) {
            System.out.println("Erro de Conexao com o banco: "+ex);/// Controle de erro
        }
    }
    
    // Ler todas as informações do BANCO
    public ArrayList<Carro> lerBanco(){
        ArrayList<Carro> lista = new ArrayList<Carro>();                
                
        try {
            Statement comandoSQL = conexaoDB.createStatement();
            ResultSet blocoResultados = comandoSQL.executeQuery("SELECT DONO,  "
                                                                     + "TIPO,  "
                                                                     + "PRECO, "
                                                                     + "VEND   "
                                                               + "FROM TABVEICULO");            
            while(blocoResultados.next()){
                boolean vendido = true;
                if( blocoResultados.getInt("VEND")==1){
                    vendido = false;
                }
                Carro c = new Carro(blocoResultados.getString("DONO"),
                                    blocoResultados.getString("TIPO"),
                                    blocoResultados.getDouble("PRECO"),
                                    vendido);
                lista.add(c);
            }    
            blocoResultados.close();
            comandoSQL.close();                       
        } catch (SQLException ex) {
            System.out.println("Erro de LEITURA do banco: "+ex);/// Controle de erro
        }
        return lista;
    }    
    /// Inserir um registro no banco ///
    public void inserirBanco(Carro c){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            int vendido = 1;
            if(c.isVendidoCarro()){
                vendido = 0;
            }
            String sql = "INSERT INTO TABVEICULO"
                                 + "(DONO,TIPO,PRECO,VEND) "
                                 + "VALUES(" +
                                 "\'" + c.getDonoCarro()  + "\'," +
                                 "\'" + c.getTipoCarro()  + "\'," +
                                      + c.getPrecoCarro() + ", "  +                                
                                      + vendido           + ")";
            
            comandoSQL.executeUpdate(sql);            
            comandoSQL.close();
        }catch(SQLException e){
            System.out.println("Erro de INSERCAO no banco: "+e);
        }
    }
    /// Remover todos Registro ///
    public void LimparBanco(){
        try{
            Statement comandoSQL = conexaoDB.createStatement();
            comandoSQL.executeUpdate("DELETE FROM TABVEICULO");        
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

    
    
 