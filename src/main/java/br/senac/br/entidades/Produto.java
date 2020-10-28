package br.senac.br.entidades;

public class Produto {

    private Integer id_produto;
    private String nomeProduto;
    private Long precoProduto;
    private Long quantidade;
    private String categoria;
    private String descricao;
    private boolean disponivel;

    //Construtores
    public Produto() {
    }

    ;

    public Produto(Integer id_produto, String nomeProduto, Long precoProduto, Long quantidade, String categoria, String descricao) {
        this.id_produto = id_produto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    
    public Produto(Integer id_produto, String nomeProduto, Long precoProduto, Long quantidade, String categoria, String descricao, boolean disponivel) {
        this.id_produto = id_produto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
    }
    
    
    
   

    public Produto(String nomeProduto, Long precoProduto, Long quantidade, String categoria, String descricao, boolean disponivel) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
        this.disponivel = disponivel;
    }

    public Produto(String nomeProduto, Long precoProduto, Long quantidade, String categoria, String descricao) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    

    public Integer getId_produto() {
        return id_produto;
    }

    // Getters e Setters
    public void setId_produto(Integer id_produto) {    
        this.id_produto = id_produto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Long getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Long precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
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

    public boolean estaDisponivel() {
        if (this.getQuantidade() > 1) {
            return true;
        }
        return false;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
