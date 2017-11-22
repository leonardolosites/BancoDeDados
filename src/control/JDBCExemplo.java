/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leonardo
 */
public class JDBCExemplo {

    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection(
            "jdbc:mysql://10.219.32.30/sistema",
            "root",
            "MLidom2020!"
        );
        System.out.println("Conectado!");
        conexao.close();
    }
}
