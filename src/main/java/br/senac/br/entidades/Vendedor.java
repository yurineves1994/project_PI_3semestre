package br.senac.br.entidades;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class Vendedor {

    private String nome_vendedor;
    private Integer id_vendedor;
    private String usuario;
    private String senha;
    private String cargo;
    private String filial;
    private String departamento;

    public Vendedor() {
    }

    ;

    
    public Vendedor(String nome_vendedor, Integer id_vendedor, String senha, String cargo, String filial, String departamento) {
        this.nome_vendedor = nome_vendedor;
        this.id_vendedor = id_vendedor;
        this.senha = senha;
        this.cargo = cargo;
        this.filial = filial;
        this.departamento = departamento;
    }

    public Vendedor(String nome_vendedor, String cargo, String filial, String departamento) {
        this.nome_vendedor = nome_vendedor;
        this.cargo = cargo;
        this.filial = filial;
        this.departamento = departamento;
    }

    public Vendedor(String nome_vendedor, String senha, String cargo, String filial, String departamento) {
        this.nome_vendedor = nome_vendedor;
        this.senha = senha;
        this.cargo = cargo;
        this.filial = filial;
        this.departamento = departamento;
    }

    public Vendedor(String nome_vendedor, String usuario, String senha, String cargo, String filial, String departamento) {
        this.nome_vendedor = nome_vendedor;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
        this.filial = filial;
        this.departamento = departamento;
    }

    public boolean isAdmin() {
        return this.cargo.equalsIgnoreCase("gerente");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    public Integer getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Integer id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
