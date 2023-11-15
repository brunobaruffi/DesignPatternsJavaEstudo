package org.example.controller;

import org.example.singleton.dadosSingleton;
import org.example.singleton.fluxoSingleton;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/singleton")
public class singletonController {

    @GetMapping(value = "busca")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String buscaSingleton()
    {
        return dadosSingleton.getInstance().getCodigo() +
                " " +
                dadosSingleton.getInstance().getNumero();
    }

    @GetMapping(value = "fluxo")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String fluxoSingleton()
    {
        return fluxoSingleton.getInstance("10").getValue() +
                " " +
                fluxoSingleton.getInstance("50").getValue();
    }

}
