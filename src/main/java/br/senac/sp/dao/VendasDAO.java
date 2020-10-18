package br.senac.sp.dao;

import br.senac.br.entidades.Vendas;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasDAO {

    public static void addVenda(Vendas venda) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoDB.obterConexao();
        String query = "insert into venda(id_cliente, id_vendedor , nomeProduto, qtdVenda, preco, data_venda) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, venda.getCliente().getId_cliente());
        ps.setInt(2, venda.getVendedor().getId_vendedor());
        ps.setString(3, venda.getProduto().getNomeProduto());
        ps.setLong(4, venda.getQtdVenda());
        ps.setLong(5, venda.getProduto().getPrecoProduto());
        java.sql.Timestamp data = new java.sql.Timestamp(venda.getData_venda().getTime());
        
        ps.execute();
    }
}
