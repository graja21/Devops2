package com.example;

import java.util.logging.Logger;

public class App {

    // Logger pour remplacer System.out.println
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    // Constructeur privé pour empêcher l'instanciation (classe utilitaire)
    private App() {
        // rien
    }

    // Méthode utilisée par le test
    public static String getGreeting() {
        return "Hello from Maven project!";
    }

    public static void main(String[] args) {
        // On affiche le message via le logger
        LOGGER.info(getGreeting());
    }
}

