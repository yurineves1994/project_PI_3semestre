package br.senac.sp.dao;

import br.senac.br.entidades.Relatorios;
import br.senac.br.entidades.Vendas;
import br.senac.br.servelet.ServletBD;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yurin
 */
public class RelatoriosDAO {

    public static List<Relatorios> RelatorioPorCliente() {
        List<Relatorios> relarioCliente = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select cliente.id_cliente, vendedor.id_vendedor, produto.id_produto, qtdVenda, data_venda from \n"
                    + "(((venda \n"
                    + "inner join cliente on venda.id_cliente = cliente.nome_cliente)\n"
                    + "inner join vendedor on venda.id_vendedor = vendedor.nome_vendedor)\n"
                    + "inner join produto on venda.id_produto = produto.nomeProduto)\n"
                    + "group by cliente.id_cliente order by venda.data_venda;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer cliente = rs.getInt("id_cliente");
                Integer vendedor = rs.getInt("id_vendedor");
                Integer produto = rs.getInt("id_produto");
                Long qtdVenda = rs.getLong("qtdVenda");
                Date data_venda = rs.getDate("data_venda");

                relarioCliente.add(new Relatorios(cliente, vendedor, produto, qtdVenda, data_venda));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return relarioCliente;
    }

    public static List<Relatorios> RelatorioPorFilial() {
        List<Relatorios> relarioFilial = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select vendedor.filial, venda.id_venda, cliente.id_cliente, produto.id_produto, venda.data_venda from venda, produto, vendedor, cliente where venda.id_vendedor = vendedor.id_vendedor and venda.id_cliente = cliente.id_cliente and venda.id_produto = produto.id_produto order by vendedor.filial;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String filial = rs.getString("filial");
                Integer id_venda = rs.getInt("id_venda");
                Integer id_cliente = rs.getInt("id_cliente");
                Integer id_vendedor = rs.getInt("id_vendedor");
                Integer id_produto = rs.getInt("id_produto");
                Long qtdVenda = rs.getLong("qtdVenda");
                Date data_venda = rs.getDate("data_venda");

                relarioFilial.add(new Relatorios(filial, cliente, vendedor, venda,  produto, qtdVenda, data_venda));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return relarioFilial;
    }

    public static List<Relatorios> RelatorioPorProduto() {
        List<Relatorios> relarioProduto = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select cliente.id_cliente, vendedor.id_vendedor, produto.id_produto, qtdVenda, data_venda from \n"
                    + "(((venda \n"
                    + "inner join cliente on venda.id_cliente = cliente.nome_cliente)\n"
                    + "inner join vendedor on venda.id_vendedor = vendedor.nome_vendedor)\n"
                    + "inner join produto on venda.id_produto = produto.nomeProduto)\n"
                    + "group by produto.categoria order by venda.data_venda;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer cliente = rs.getInt("id_cliente");
                Integer vendedor = rs.getInt("id_vendedor");
                Integer produto = rs.getInt("id_produto");
                Long qtdVenda = rs.getLong("qtdVenda");
                Date data_venda = rs.getDate("data_venda");

                relarioProduto.add(new Relatorios(cliente, vendedor, produto, qtdVenda, data_venda));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return relarioProduto;
    }
}
