/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.SQLException;
import control.ConnectionFactory;

/**
 *
 * @author leonardo
 */
public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        con.close();
        System.out.println("Conexão Fechada!");
    }
}
