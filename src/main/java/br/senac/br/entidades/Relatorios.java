package br.senac.br.entidades;

import java.util.Date;

public class Relatorios {

    private Integer id_relatorio;
    private String cliente;
    private String vendedor;
    private String produto;
    private Integer venda;
    private String filial;
    private Long qtdVenda;
    private Date data_venda;

    public Relatorios(String filial, Integer venda, String cliente, String vendedor, String produto, Date data_venda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.filial = filial;
        this.data_venda = data_venda;
    }
 
    public Relatorios(String filial, String cliente, String vendedor, String produto, Long qtdVenda, Date data_venda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.filial = filial;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(String cliente, String vendedor, String produto, Long qtdVenda, Date data_venda) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Relatorios(Integer id_relatorio, String cliente, String vendedor, String produto, Long qtdVenda, Date data_venda) {
        this.id_relatorio = id_relatorio;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produto;
        this.qtdVenda = qtdVenda;
        this.data_venda = data_venda;
    }

    public Integer getId_relatorio() {
        return id_relatorio;
    }

    public void setId_relatorio(Integer id_relatorio) {
        this.id_relatorio = id_relatorio;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getId_cliente() {
        return cliente;
    }

    public void setId_cliente(String cliente) {
        this.cliente = cliente;
    }

    public String getId_vendedor() {
        return vendedor;
    }

    public void setId_vendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getId_produto() {
        return produto;
    }

    public void setId_produto(String produto) {
        this.produto = produto;
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
