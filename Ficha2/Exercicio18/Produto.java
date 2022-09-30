package entities;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Produto {
    private double peso;
    private int quantidade;
    private String nome;
    private BigDecimal valor;
    private String descricao;

    ArrayList<ItemPedido> itemPedido;

    public Produto(double peso, int quantidade, String nome, BigDecimal valor, String descricao,
            ArrayList<ItemPedido> itemPedido) {
        this.peso = peso;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.itemPedido = itemPedido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ArrayList<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }

}
