package org.example.context;

import org.example.service.EstrategiaPagamento;

import java.math.BigDecimal;

public class Compra {
    BigDecimal valor;

    public Compra(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String processarCompra(EstrategiaPagamento estrategiaPagamento){
        return estrategiaPagamento.pagar(this);
    }
}
