package br.senac.sp.dao;

import br.senac.br.entidades.Produto;
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

public class ProdutoDAO {

    public static List<Produto> listarProdutos() {
        List<Produto> listaProdutos = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from produto";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer id_produto = rs.getInt("id_produto");
                String nomeProduto = rs.getString("nomeProduto");
                Long precoProduto = rs.getLong("precoProduto");
                Long quantidade = rs.getLong("quantidade");
                String categoria = rs.getString("categoria");
                String descricao = rs.getString("descricao");
                listaProdutos.add(new Produto(id_produto, nomeProduto, precoProduto, quantidade, categoria, descricao));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return listaProdutos;
    }

    public static void addProduto(Produto produto) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoDB.obterConexao();
        String query = "insert into produto(nomeProduto, precoProduto, quantidade, categoria, descricao) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, produto.getNomeProduto());
        ps.setLong(2, produto.getPrecoProduto());
        ps.setLong(3, produto.getQuantidade());
        ps.setString(4, produto.getCategoria());
        ps.setString(5, produto.getDescricao());

        ps.execute();
    }

    public static void updateProduto(Produto produto) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "update produto set nomeProduto=?, precoProduto=?, quantidade=?, categoria=?, descricao=? where id_produto=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, produto.getId_produto());
        ps.setString(2, produto.getNomeProduto());
        ps.setLong(3, produto.getPrecoProduto());
        ps.setLong(4, produto.getQuantidade());
        ps.setString(5, produto.getCategoria());
        ps.setString(6, produto.getDescricao());

        ps.execute();
    }

    public static void deleteProduto(Integer id_produto) throws ClassNotFoundException, SQLException {
        Connection con = ConexaoDB.obterConexao();
        String query = "delete from produto where id_produto=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id_produto);
        ps.execute();
    }

    public static Produto obterProduto(Integer id_produto) {
        Produto produto = null;
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select * from produto where id_produto=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id_produto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nomeProduto = rs.getString("nomeProduto");
                Long precoProduto = rs.getLong("precoProduto");
                Long quantidade = rs.getLong("quantidade");
                String categoria = rs.getString("categoria");
                String descricao = rs.getString("descricao");
                produto = new Produto(id_produto, nomeProduto, precoProduto, quantidade, categoria, descricao);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        return produto;
    }
}
