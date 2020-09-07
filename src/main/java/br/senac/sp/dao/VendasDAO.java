
package br.senac.sp.dao;

import br.senac.br.entidades.Vendas;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendasDAO {
    public static List<Vendas> getClientes() {
        List<Vendas> listaClientes = new ArrayList();
        try {
            // faz a conexao com o Banco de dados criado na pasta bd
            Connection con = ConexaoDB.obterConexao();
            //queery de requisicao do banco de dados
            String query = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet resultado = ps.executeQuery();

            // para mostrar na tela
            while (resultado.next()) {
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");
                listaVendas.add(new Vendas(nome,email));

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;  
    }
}
