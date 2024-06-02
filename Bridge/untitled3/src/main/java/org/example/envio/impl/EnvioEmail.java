package org.example.envio.impl;

import org.example.envio.ImplementadorEnvio;

public class EnvioEmail implements ImplementadorEnvio {

    @Override
    public void enviar(String arquivo) {
        System.out.println("Enviando " + arquivo + " por email.");
    }
}
