package org.example.singleton;

public class dadosSingleton {
    private static dadosSingleton instance;
    private final String codigo;
    private final String numero;

    private dadosSingleton(String codigo, String numero) {
       this.codigo = codigo;
       this.numero = numero;
    }

    public static dadosSingleton getInstance() {
        if (instance == null) {
            instance = new dadosSingleton("99","159753");
        }
        return instance;
    }

    public String getNumero(){
        return numero;
    }
    public String getCodigo(){
        return codigo;
    }
}
