/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ESCRITORIO
 */

//Classes necessárias para conexão do banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySQL {
    
    public static String status = "Não conectou...";
    
    public ConexaoMySQL(){
        
    }
    
    //Método de conexão
    public static java.sql.Connection getConnectionMySQL(){
        
        Connection connection = null;
        
        try {
        //Carregando o drive padrão JDBC
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName);
        
        //Configurando a conexão com o banco de dados
        String serverName = "localhost";
        String mydatabase = "sistema";
        String url = "jdbc:mysql://"+serverName+"/"+mydatabase;
        String username = "root";
        String password = "sh*589574";
        
        connection = DriverManager.getConnection(url, username, password);
                
        if(connection != null){
            status = "STATUS--->Conectado com sucesso!";
        }else{
            status = "STATUS--->Não foi possível realizar a conexão";
        }
        
        return connection;
        
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            System.out.println("Detalhes: "+e.getMessage());
            return null;
            
        } catch (SQLException e){
            System.out.println("Não foi possível conectar ao Banco de Dados");
            System.out.println("Detalhes: "+e.getMessage());
            return null;
        }
    }
    
    //Metodo que retorna o status da conexao
    public static String statusConnection(){
        return status;
    }
    
    //Metodo que fecha a conexao
    public static boolean fecharConexao(){
        try {
            ConexaoMySQL.getConnectionMySQL().close();
            status = "STATUS--->A conexão foi encerrada";
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
    //Metodo que fecha a conexao
    public static java.sql.Connection reiniciarConexao(){
        fecharConexao();
        status = "STATUS--->A conexão foi reiniciada";
        return ConexaoMySQL.getConnectionMySQL();
    }
}
