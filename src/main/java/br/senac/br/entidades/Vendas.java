package br.senac.br.entidades;

import java.util.Date;
import java.util.List;

public class Vendas {
    private Clientes cliente;
    private Integer idVenda;
    private Vendedor vendedor;
    private Produto produto;
    private List<Produto> listaProduto;
    private Integer qtdVenda;

    private Date data_venda;

    public Vendas() {
        vendedor = new Vendedor();
        cliente = new Clientes();
        produto = new Produto();
    }

    public Vendas(Vendedor id_vendedor, Integer qtdVenda, Produto id_produto, Date data_venda) {
        this.vendedor = id_vendedor;
        this.qtdVenda = qtdVenda;
        this.produto = id_produto;
        this.data_venda = data_venda;
    }
    
    public Clientes getCliente() {
        return cliente;
    }

    // METODOS GETTERS E SETTERS
    public void setCliente(Clientes cliente) {    
        this.cliente = cliente;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(Integer qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

}
