package entities;

import java.math.BigDecimal;
import java.util.Date;

public class PagamentoNFE {
    private BigDecimal valor;
    private Date dataPagamento;
    private NotaFiscal notaFiscal;

    public PagamentoNFE(BigDecimal valor, Date dataPagamento, NotaFiscal notaFiscal) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.notaFiscal = notaFiscal;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public void efetuarPagamento() {
        System.out.println("Retornando método efetuarPagamento da classe PagamentoNFE!");
    }
}
