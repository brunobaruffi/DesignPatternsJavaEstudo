package org.example.controller;

import org.example.enums.EnvioEnum;
import org.example.relatorio.RelatorioPDF;
import org.example.relatorio.RelatorioXLS;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bridge")
public class BridgeController {

    @GetMapping(value = "relatorio/{relatorio}/{envio}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String strategy(@PathVariable String relatorio, @PathVariable String envio){

        switch (relatorio){
            case "XLS":
                RelatorioXLS relatorioXLSFTP = new RelatorioXLS(EnvioEnum.valueOf(envio).obterImplementador());
                relatorioXLSFTP.gerar("Conteúdo do relatório XLS - Enviado via " + envio);
                return "Conteúdo do relatório XLS - Enviado via " + envio;
            case "PDF":
                RelatorioPDF relatorioPDFEmail = new RelatorioPDF(EnvioEnum.valueOf(envio).obterImplementador());
                relatorioPDFEmail.gerar("Conteúdo do relatório PDF - Enviado via " + envio);
                return "Conteúdo do relatório PDF - Enviado via " + envio;
        }
        return "FALHA";
    }
}
