package br.senac.br.entidades;

import java.util.Date;

public class Relatorios {

    private Integer id_relatorio;
    private String cliente;
    private String vendedor;
    private String produto;
    private String categoria_produto;
    private Integer id_venda;
    private String filial;
    private Integer qtdVenda;
    private Date data_venda;

    public Relatorios() {
    }

    public Relatorios(String filial, Integer id_venda, String cliente, String vendedor, String produto, Date data_venda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.filial = filial;
        this.data_venda = data_venda;
    }

    public Relatorios(String cliente, String vendedor, String produto, Integer qtdVenda, Date data_venda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(Integer id_relatorio, String cliente, String vendedor, String produto, Integer qtdVenda, Date data_venda) {
        this.id_relatorio = id_relatorio;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(Integer venda, String produto, String cliente, String vendedor, Date data_venda) {
        this.id_relatorio = venda;
        this.produto = produto;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.data_venda = data_venda;
    }

    public Integer getId_venda() {
        return id_venda;
    }

    public void setId_venda(Integer id_venda) {
        this.id_venda = id_venda;
    }

    public Integer getId_relatorio() {
        return id_relatorio;
    }

    public void setId_relatorio(Integer id_relatorio) {
        this.id_relatorio = id_relatorio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public Integer getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(Integer qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

}
