package entities;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Gerente extends Pessoa {

    ArrayList<Funcionario> funcionario;
    ArrayList<PedidoBasico> pedidoBasico;

    public Gerente(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
            Boolean status, String senha, Endereco endereco, ArrayList<Funcionario> funcionario,
            ArrayList<PedidoBasico> pedidoBasico) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha, endereco);
        this.funcionario = funcionario;
        this.pedidoBasico = pedidoBasico;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<PedidoBasico> getPedidoBasico() {
        return pedidoBasico;
    }

    public void setPedidoBasico(ArrayList<PedidoBasico> pedidoBasico) {
        this.pedidoBasico = pedidoBasico;
    }

    public void listaFuncionario() {
        System.out.println("Retornando método listaFuncionario da classe Gerente!");
    }

    public void listaCliente() {
        System.out.println("Retornando método listaCliente da classe Gerente!");
    }

    public void criarFuncionario() {
        System.out.println("Retornando método criarFuncionario da classe Gerente!");
    }

}
