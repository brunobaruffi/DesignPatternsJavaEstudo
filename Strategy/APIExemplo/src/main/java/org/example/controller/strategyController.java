package org.example.controller;

import org.example.context.Compra;
import org.example.dto.PagamentoDTO;
import org.example.service.EstrategiaPagamento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/strategy")
public class strategyController {
    @PostMapping(value = "pagar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String strategy(@RequestBody PagamentoDTO pedidoPagamento){
        Compra compra = new Compra(pedidoPagamento.getValor());

        EstrategiaPagamento estrategiaPagamento = pedidoPagamento.getFormaPagamento().criarEstrategia();
        return compra.processarCompra(estrategiaPagamento);
    }
}
