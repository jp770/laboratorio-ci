package com.ejemplo;

import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Laboratorio Jenkins Maven SonarQube");
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre;
    }
}
