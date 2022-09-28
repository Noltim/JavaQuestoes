package entities;

public class Parceiro {
    private String tipoPessoa;
    private float desempenho;
    private Fisica fisica;
    private Juridica juridica;

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public void cadastrar() {
        System.out.println("Pessoa Cadastrada!");
    }

    public void bloquear() {
        System.out.println("Pessoa Bloqueada!");
    }

    public void excluir() {
        System.out.println("Pessoa Excluída!");
    }
}
