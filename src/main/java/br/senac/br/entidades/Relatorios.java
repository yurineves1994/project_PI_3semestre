package br.senac.br.entidades;

import java.util.Date;

public class Relatorios {

    private Integer id_relatorio;
    private Integer id_cliente;
    private Integer id_vendedor;
    private Integer id_produto;
    private String filial;
    private Long qtdVenda;
    private Date data_venda;

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public Relatorios(String filial, Integer id_cliente, Integer id_vendedor, Integer id_produto,  Long qtdVenda, Date data_venda) {
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.id_produto = id_produto;
        this.filial = filial;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(Integer id_cliente, Integer id_vendedor, Integer id_produto, Long qtdVenda, Date data_venda) {
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.id_produto = id_produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(Integer id_relatorio, Integer id_cliente, Integer id_vendedor, Integer id_produto, Long qtdVenda, Date data_venda) {
        this.id_relatorio = id_relatorio;
        this.id_cliente = id_cliente;
        this.id_vendedor = id_vendedor;
        this.id_produto = id_produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Integer getId_relatorio() {
        return id_relatorio;
    }

    public void setId_relatorio(Integer id_relatorio) {
        this.id_relatorio = id_relatorio;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Integer id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public Long getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(Long qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

}
