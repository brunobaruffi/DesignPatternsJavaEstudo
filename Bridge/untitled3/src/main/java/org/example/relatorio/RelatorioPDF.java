package org.example.relatorio;

import org.example.envio.ImplementadorEnvio;

public class RelatorioPDF extends Relatorio{
    public RelatorioPDF(ImplementadorEnvio implementador) {
        super(implementador);
    }

    @Override
    public void gerar(String conteudo) {
        String arquivo = "relatorio.pdf";
        System.out.println("Gerando relatório PDF com o conteúdo: " + conteudo);
        implementador.enviar(arquivo);
    }
}
