package org.example.singleton;

public class fluxoSingleton {
    private static fluxoSingleton instance;
    public String value;

    private fluxoSingleton(String value) {
        this.value = value;
    }

    public static fluxoSingleton getInstance(String value) {
        if (instance == null) {
            instance = new fluxoSingleton(value);
        }
        return instance;
    }

    public String getValue(){
        return value;
    }
}
