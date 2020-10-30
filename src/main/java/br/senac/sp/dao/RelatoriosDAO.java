package br.senac.sp.dao;

import br.senac.br.entidades.Relatorios;
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
//    public static void addRelatorio(Vendas venda) throws SQLException, ClassNotFoundException {
//        Connection con = ConexaoDB.obterConexao();
//        String query = "insert into relatorio(id_cliente, id_vendedor , id_produto, qtdVenda, filial, categoria_produto, data_venda) values (?,?,?,?,?,?,?)";
//        PreparedStatement ps = con.prepareStatement(query);
//        ps.setInt(1, venda.getCliente().getId_cliente());
//        ps.setInt(2, venda.getVendedor().getId_vendedor());
//        ps.setInt(3, venda.getProduto().getId_produto());
//        ps.setInt(4, venda.getQtdVenda());  
//        ps.setString(5, venda.getFilial_vendedor());  
//        ps.setString(6, venda.getProduto().getCategoria());
//        java.sql.Timestamp data_venda = new java.sql.Timestamp(venda.getData_venda().getTime());
//        ps.setTimestamp(7, data_venda);
//        ps.execute();
//    }

    public static List<Relatorios> RelatorioPorCliente() {
        List<Relatorios> relatorioCliente = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select venda.id_venda, cliente.nome_cliente, vendedor.nome_vendedor, vendedor.filial, produto.nomeProduto, venda.qtdVenda, venda.data_venda from venda inner join cliente on venda.id_cliente = cliente.id_cliente inner join vendedor on venda.id_vendedor = vendedor.id_vendedor inner join produto on venda.id_produto = produto.id_produto order by cliente.nome_cliente;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer venda = rs.getInt("id_venda");
                String cliente = rs.getString("nome_cliente");
                String vendedor = rs.getString("nome_vendedor");
                String filial = rs.getString("filial");               
                String produto = rs.getString("nomeProduto");
                Date data_venda = rs.getDate("data_venda");

                relatorioCliente.add(new Relatorios(filial, venda, cliente, vendedor, produto, data_venda));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                   log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletBD.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return relatorioCliente;
    }
   public static List<Relatorios> RelatorioPorFilial() {
      List<Relatorios> relarioFilial = new ArrayList();

        try {
           Connection con = ConexaoDB.obterConexao();
            String query = "select vendedor.filial, venda.id_venda, cliente.nome_cliente, vendedor.nome_vendedor, produto.nomeProduto, venda.data_venda from  venda inner join cliente on venda.id_cliente = cliente.id_cliente inner join vendedor on venda.id_vendedor = vendedor.id_vendedor inner join produto on venda.id_produto = produto.id_produto order by vendedor.filial;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String filial = rs.getString("filial");
               Integer venda = rs.getInt("id_venda");
                String cliente = rs.getString("nome_cliente");
                String vendedor = rs.getString("nome_vendedor");
                String produto = rs.getString("nomeProduto");
                Date data_venda = rs.getDate("data_venda");

                relarioFilial.add(new Relatorios(filial, venda, cliente, vendedor, produto, data_venda));
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
        List<Relatorios> relarioFilial = new ArrayList();
        try {
            Connection con = ConexaoDB.obterConexao();
            String query = "select produto.categoria, venda.id_venda, produto.nomeProduto, cliente.nome_cliente, vendedor.nome_vendedor, vendedor.filial, venda.qtdVenda, venda.data_venda from venda inner join cliente on venda.id_cliente = cliente.id_cliente inner join vendedor on venda.id_vendedor = vendedor.id_vendedor inner join produto on venda.id_produto = produto.id_produto order by produto.categoria;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String filial = rs.getString("filial");
                Integer venda = rs.getInt("id_venda");
                String cliente = rs.getString("nome_cliente");
                String vendedor = rs.getString("nome_vendedor");
                String produto = rs.getString("nomeProduto");
                Date data_venda = rs.getDate("data_venda");

                relarioFilial.add(new Relatorios(filial, venda, cliente, vendedor, produto, data_venda));
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
}