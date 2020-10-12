package br.senac.br.entidades;

public class ItemVenda extends Produto {
    private Integer idItemVenda;
    private Integer idProduto;
    private Integer preco;
    private Integer quantidade;
    
    //Construtores
    public ItemVenda(Integer produto, String nomeProduto, Integer precoProduto, Integer quantidade, String categoria, String descricao, boolean disponivel) {
        super(produto, nomeProduto, precoProduto, quantidade, categoria, descricao, disponivel);
    }
    // Getters e Setters
    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getPreco() {
        return preco;
    }

    public void setPreco(Integer preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
}
