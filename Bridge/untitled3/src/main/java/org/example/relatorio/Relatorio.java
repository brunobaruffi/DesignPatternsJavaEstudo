package org.example.relatorio;

import org.example.envio.ImplementadorEnvio;

abstract class Relatorio {
    protected ImplementadorEnvio implementador;

    protected Relatorio(ImplementadorEnvio implementador) {
        this.implementador = implementador;
    }

    public abstract void gerar(String conteudo);
}
