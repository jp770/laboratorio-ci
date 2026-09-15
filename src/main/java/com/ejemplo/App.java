package com.ejemplo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Laboratorio Jenkins Maven SonarQube");

        AtomicInteger valor1 = new AtomicInteger(10);
        AtomicInteger valor2 = new AtomicInteger(10);

        if (valor1.equals(valor2)) {
            LOGGER.info("Los valores son iguales");
        }
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre;
    }
}
