package br.senac.sp.dao;

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

    public static Vendedor obterVendedor(String usuario) {
        Vendedor funcionario = null;
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from vendedor where usuario=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario);          
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome_vendedor = rs.getString("nome_vendedor");
                String senha = rs.getString("senha");  
                String cargo = rs.getString("cargo");
                String filial = rs.getString("filial");
                String departamento = rs.getString("departamento");
                funcionario = new Vendedor();
                funcionario.setNome_vendedor(nome_vendedor);
                funcionario.setSenha(senha);
                funcionario.setCargo(cargo);
                funcionario.setFilial(filial);
                funcionario.setDepartamento(departamento);
                
                
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
