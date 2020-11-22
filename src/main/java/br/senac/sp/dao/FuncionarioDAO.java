package br.senac.sp.dao;

import br.senac.br.entidades.Clientes;
import br.senac.br.entidades.Vendedor;
import br.senac.br.servelet.ServletBD;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDAO {

    public static Vendedor obterVendedor(String usuario, String senha) {
        Vendedor funcionario = null;
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from vendedor where usuario=? and senha=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome_vendedor = rs.getString("nome_vendedor");             
                String cargo = rs.getString("cargo");
                String filial = rs.getString("filial");
                String departamento = rs.getString("departamento");

                funcionario = new Vendedor(nome_vendedor, usuario, senha, cargo, filial, departamento);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return funcionario;
    }

}
