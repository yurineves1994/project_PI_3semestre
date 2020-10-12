
package br.senac.br.entidades;

public class Vendas extends ItemVenda{
    private Integer idVenda;
    private Integer data_venda;
    private Integer preco_total;

    // Construtores
    public Vendas(Integer produto, String nomeProduto, Integer precoProduto, Integer quantidade, String categoria, String descricao, boolean disponivel) {
        super(produto, nomeProduto, precoProduto, quantidade, categoria, descricao, disponivel);
    }
  
    // Getters e Setters
    public Integer realizarVenda()
    
    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Integer getData_venda() {
        return data_venda;
    }

    public void setData_venda(Integer data_venda) {
        this.data_venda = data_venda;
    }

    public Integer getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(Integer preco_total) {
        this.preco_total = preco_total;
    }
    
    
}
