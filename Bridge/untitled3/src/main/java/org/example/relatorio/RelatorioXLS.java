package org.example.relatorio;

import org.example.envio.ImplementadorEnvio;

public class RelatorioXLS extends Relatorio{
    public RelatorioXLS(ImplementadorEnvio implementador) {
        super(implementador);
    }

    @Override
    public void gerar(String conteudo) {
        String arquivo = "relatorio.xls";
        System.out.println("Gerando relatório xls com o conteúdo: " + conteudo);
        implementador.enviar(arquivo);
    }
}
