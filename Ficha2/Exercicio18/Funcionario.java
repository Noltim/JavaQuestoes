package entities;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private Gerente gerente;

    ArrayList<PedidoBasico> pedidoBasicos;

    public Funcionario(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
            Boolean status, String senha, Endereco endereco, Gerente gerente, ArrayList<PedidoBasico> pedidoBasicos) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha, endereco);
        this.gerente = gerente;
        this.pedidoBasicos = pedidoBasicos;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<PedidoBasico> getPedidoBasicos() {
        return pedidoBasicos;
    }

    public void setPedidoBasicos(ArrayList<PedidoBasico> pedidoBasicos) {
        this.pedidoBasicos = pedidoBasicos;
    }

    public void listarPedidos() {
        System.out.println("Retornando método listaPedidos da classe Funcionario!");
    }

    public void editarPedido() {
        System.out.println("Retornando método editarPedido da classe Funcionario!");
    }
}
