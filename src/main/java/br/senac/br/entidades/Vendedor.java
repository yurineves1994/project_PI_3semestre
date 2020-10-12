package br.senac.br.entidades;

public class Vendedor {

    private Integer idV;
    private Integer nivel_acesso;
    private String nome;
    private String setor;
    private Integer cpf;
    private Integer idFilial;
    private Integer idP;

    public Integer getIdV() {
        return idV;
    }

    public void setIdV(Integer idV) {
        this.idV = idV;
    }

    public Integer getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(Integer nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Integer idFilial) {
        this.idFilial = idFilial;
    }

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

}
