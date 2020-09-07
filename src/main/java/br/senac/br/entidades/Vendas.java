
package br.senac.br.entidades;

public class Vendas {
   private int valor;
   private int data_venda;

    public Vendas(int valor, int data_venda) {
        this.valor = valor;
        this.data_venda = data_venda;
    }
    
    public static void efetuarVenda(int valor) {
       
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getData_venda() {
        return data_venda;
    }

    public void setData_venda(int data_venda) {
        this.data_venda = data_venda;
    }
   
   
}
