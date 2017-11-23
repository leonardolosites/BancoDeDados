/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import control.ConnectionFactory;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ESCRITORIO
 */
public class ClienteDao {

    private Connection conn;

    public ClienteDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void insert(Cliente cliente) {

        String sql = "INSERT INTO cliente ("
                + "documento_cliente, "
                + "endereco_cliente, "
                + "telefone_cliente, "
                + "email_cliente, "
                + "nome_cliente, "
                + "sobrenome_cliente, "
                + "data_nasc_cliente, "
                + "sexo_cliente"
                + ") VALUES (?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getDocumento());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getNome());
            stmt.setString(6, cliente.getSobrenome());
            stmt.setString(7, cliente.getDataNasc());
            stmt.setString(8, cliente.getSexo());

            stmt.execute();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Cliente> getLista() {
        try {
            List<Cliente> clientes = new ArrayList<Cliente>();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM cliente");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setSobrenome(rs.getString("sobrenome_cliente"));
                cliente.setSexo(rs.getString("sexo_cliente"));
                clientes.add(cliente);
            }

            rs.close();
            stmt.close();
            conn.close();

            return (List) clientes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
