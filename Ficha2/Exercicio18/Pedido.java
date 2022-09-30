package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Date dataPedido;
    private Boolean status;
    private ItemPedido item;
    private BigDecimal valorTotal;
    private PagamentoNFE pagamentoNFE;

    ArrayList<ItemPedido> itemPedido;

    public Pedido(Date dataPedido, Boolean status, ItemPedido item, BigDecimal valorTotal, PagamentoNFE pagamentoNFE,
            ArrayList<ItemPedido> itemPedido) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.item = item;
        this.valorTotal = valorTotal;
        this.pagamentoNFE = pagamentoNFE;
        this.itemPedido = itemPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ItemPedido getItem() {
        return item;
    }

    public void setItem(ItemPedido item) {
        this.item = item;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public PagamentoNFE getPagamentoNFE() {
        return pagamentoNFE;
    }

    public void setPagamentoNFE(PagamentoNFE pagamentoNFE) {
        this.pagamentoNFE = pagamentoNFE;
    }

    public ArrayList<ItemPedido> getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(ArrayList<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }

    public void statusPedido() {
        System.out.println("Retornando método statusPedido da classe Pedido!");
    }
}
