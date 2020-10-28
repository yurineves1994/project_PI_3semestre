package br.senac.sp.dao;

import br.senac.br.entidades.Vendas;
import br.senac.sp.bd.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VendasDAO {

    public static void addVenda(Vendas venda) throws SQLException, ClassNotFoundException {
        Connection con = ConexaoDB.obterConexao();
        String query = "insert into venda(id_cliente, id_vendedor , id_produto, qtdVenda, data_venda) values (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, venda.getCliente().getId_cliente());
        ps.setInt(2, venda.getVendedor().getId_vendedor());
        ps.setInt(3, venda.getProduto().getId_produto());
        ps.setLong(4, venda.getQtdVenda());       
        java.sql.Timestamp data_venda = new java.sql.Timestamp(venda.getData_venda().getTime());
        ps.setTimestamp(5, data_venda);
        ps.execute();
    }
}
