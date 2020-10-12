
package br.senac.br.entidades;

public class Produto {
    
    private Integer idProduto;
    private String nomeProduto;
    private Integer precoProduto;
    private Integer quantidade;
    private String categoria;
    private String descricao;
    private boolean disponivel;
    
    //Construtores

    public Produto(Integer produto, String nomeProduto, Integer precoProduto, Integer quantidade, String categoria, String descricao, boolean disponivel) {
        this.idProduto = produto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
    }

    public Produto(String nomeProduto, Integer precoProduto, Integer quantidade, String categoria, String descricao, boolean disponivel) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
    }
    
    
    // Getters e Setters

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Integer precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
