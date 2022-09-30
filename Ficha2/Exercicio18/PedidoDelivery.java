package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class PedidoDelivery extends Pedido {
    private Cliente cliente;

    public PedidoDelivery(Date dataPedido, Boolean status, ItemPedido item, BigDecimal valorTotal,
            PagamentoNFE pagamentoNFE, ArrayList<ItemPedido> itemPedido, Cliente cliente) {
        super(dataPedido, status, item, valorTotal, pagamentoNFE, itemPedido);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
