package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class PedidoBasico extends Pedido {
    private String nome;
    private Funcionario funcionario;
    private Gerente gerente;

    public PedidoBasico(Date dataPedido, Boolean status, ItemPedido item, BigDecimal valorTotal,
            PagamentoNFE pagamentoNFE, ArrayList<ItemPedido> itemPedido, String nome, Funcionario funcionario,
            Gerente gerente) {
        super(dataPedido, status, item, valorTotal, pagamentoNFE, itemPedido);
        this.nome = nome;
        this.funcionario = funcionario;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
