package br.senac.sp.dao;

import br.senac.br.entidades.Clientes;
import br.senac.br.servelet.ServletBD;
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
                String nome_cliente = rs.getString("nome_cliente");
                Long cpf = rs.getLong("cpf");
                Long rg = rs.getLong("rg");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                Integer numero = rs.getInt("numero");
                String estado = rs.getString("estado");
                listaClientes.add(new Clientes(nome_cliente, cpf, rg, telefone, email, endereco, numero, estado));
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
        String query = "insert into cliente(nome_cliente, cpf, rg, telefone, email, endereco, numero, estado) values (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome_cliente());
        ps.setLong(2, cliente.getCpf());
        ps.setLong(3, cliente.getRg());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getEndereco());
        ps.setInt(7, cliente.getNumero());
        ps.setString(8, cliente.getEstado());
        ps.execute();
    }

    public static void updateCliente(Clientes cliente) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "update cliente set nome_cliente=?, rg=?, telefone=?, email=?, endereco=?, numero=?, estado=? where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, cliente.getNome_cliente());
        ps.setLong(2, cliente.getCpf());
        ps.setLong(3, cliente.getRg());
        ps.setString(4, cliente.getTelefone());
        ps.setString(5, cliente.getEmail());
        ps.setString(6, cliente.getEndereco());
        ps.setInt(7, cliente.getNumero());
        ps.setString(8, cliente.getEstado());
        ps.execute();
    }

    public static void deleteCliente(Long cpf) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "delete from cliente where cpf=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, cpf);
        ps.execute();
    }

    public static Clientes obterCliente(Long cpf) {
        Clientes cliente = null;
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from cliente where cpf=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setLong(1, cpf);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome_cliente = rs.getString("nome_cliente");
                Long rg = rs.getLong("rg");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                Integer numero = rs.getInt("numero");
                String estado = rs.getString("estado");
                cliente = new Clientes(nome_cliente, cpf, rg, telefone, email, endereco, numero, estado);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
}
