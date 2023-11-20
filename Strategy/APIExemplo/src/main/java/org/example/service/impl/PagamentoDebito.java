package org.example.service.impl;

import org.example.context.Compra;
import org.example.service.EstrategiaPagamento;

public class PagamentoDebito implements EstrategiaPagamento {
    @Override
    public String pagar(Compra compra) {
        //...processos
        return "Pagou no Debito " + compra.getValor();
    }
}
