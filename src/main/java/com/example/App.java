package com.example;

import java.util.logging.Logger;

public class App {

    // Logger pour afficher les messages
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    // Constructeur privé (classe utilitaire)
    private App() {
        // rien
    }

    // Méthode utilisée par le test
    public static String getGreeting() {
        return "Hello from Maven project!";
    }

    public static void main(String[] args) throws Exception {
        // Afficher le message
        LOGGER.info(getGreeting());

        // Empêcher l'application de se terminer (important pour Kubernetes)
        Thread.sleep(Long.MAX_VALUE);
    }
}


