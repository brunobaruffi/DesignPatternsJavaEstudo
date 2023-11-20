package org.example.enums;

import org.example.service.impl.PagamentoCredito;
import org.example.service.impl.PagamentoDebito;
import org.example.service.EstrategiaPagamento;
public enum FormaPagamentoEnum {
    DEBITO {
        @Override
        public EstrategiaPagamento criarEstrategia() {
            return new PagamentoDebito();
        }
    },
    CREDITO {
        @Override
        public EstrategiaPagamento criarEstrategia() {
            return new PagamentoCredito();
        }
    };
    public abstract EstrategiaPagamento criarEstrategia();
}
