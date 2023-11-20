package org.example.dto;

import org.example.enums.FormaPagamentoEnum;

import java.math.BigDecimal;

public class PagamentoDTO {
    BigDecimal valor;
    FormaPagamentoEnum formaPagamentoEnum;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamentoEnum;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamentoEnum) {
        this.formaPagamentoEnum = formaPagamentoEnum;
    }
}
