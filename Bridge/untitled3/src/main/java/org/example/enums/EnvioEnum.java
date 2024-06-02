package org.example.enums;

import org.example.envio.ImplementadorEnvio;
import org.example.envio.impl.EnvioEmail;
import org.example.envio.impl.EnvioFTP;

public enum EnvioEnum {
    EMAIL {
        @Override
        public ImplementadorEnvio obterImplementador(){
            return new EnvioEmail();
        }
    },
    FTP{
        @Override
        public ImplementadorEnvio obterImplementador(){
            return new EnvioFTP();
        }
    };

    public abstract ImplementadorEnvio obterImplementador();
}
