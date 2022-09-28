package entities;

import java.util.ArrayList;
import java.util.Date;

public class Juridica extends Pessoa {
    protected String cnpj;
    protected String inscricaoEstadual;
    protected Date fundacao;

    ArrayList<Parceiro> listaParceiroJ;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

}
