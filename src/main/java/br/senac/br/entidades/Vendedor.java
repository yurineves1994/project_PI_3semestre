package br.senac.br.entidades;

public class Vendedor {

    private String nome;
    private int salario_fixo;
    private String filial;

    public Vendedor(String nome, int salario_fixo, String filial) {
        this.nome = nome;
        this.salario_fixo = salario_fixo;
        this.filial = filial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario_fixo() {
        return salario_fixo;
    }

    public void setSalario_fixo(int salario_fixo) {
        this.salario_fixo = salario_fixo;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

}
