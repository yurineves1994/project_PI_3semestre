/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.br.entidades.Clientes;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yurin
 */
public class ClienteDAO {
    public static List<Clientes> listarClientes() {
        List<Clientes> listaClientes = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                Long cpf = rs.getLong("cpf");
                Long rg = rs.getLong("rg");
                String sexo = rs.getString("sexo");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String dataNascimento = rs.getString("dataNascimento");
                String endereco = rs.getString("endereco");
                Integer numero = rs.getInt("numero");
                String estado = rs.getString("estado");
                listaClientes.add(new Clientes(nome,cpf,rg,sexo,telefone,email,dataNascimento,endereco,numero,estado));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }

    public static void addCliente(Clientes cliente) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoDB.obterConexao();
        String query = "insert into cliente(nome, cpf, rg, sexo, telefone, email, dataNascimento, endereco, numero, estado) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.setLong(2, cliente.getCpf());
        ps.setLong(3, cliente.getRg());
        ps.setString(4, cliente.getSexo());
        ps.setString(5, cliente.getTelefone());
        ps.setString(6, cliente.getEmail());
        ps.setString(7, cliente.getDataNascimento());
        ps.setString(8, cliente.getEndereco());
        ps.setInt(9, cliente.getNumero());
        ps.setString(10, cliente.getEstado());
        ps.execute();
    }
     public static void updateCliente(Clientes cliente) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "update cliente set nome=?,cpf=?, rg=?, sexo=?, telefone=?, email=?, dataNascimento=?, endereco=?, numero=?, estado=? where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome());
        ps.setLong(2, cliente.getCpf());
        ps.setLong(3, cliente.getRg());
        ps.setString(4, cliente.getSexo());
        ps.setString(5, cliente.getTelefone());
        ps.setString(6, cliente.getEmail());
        ps.setString(7, cliente.getDataNascimento());
        ps.setString(8, cliente.getEndereco());
        ps.setInt(9, cliente.getNumero());
        ps.setString(10, cliente.getEstado());
        ps.execute();
    }
    public static void deleteCliente(Long cpf) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "delete from cliente where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, cpf);
        ps.execute();
    }
}
