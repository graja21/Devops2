package com.example;

public class App {

    // Méthode utilisée par le test
    public static String getGreeting() {
        return "Hello from Maven project!";
    }

    public static void main(String[] args) {
        // On affiche le message
        System.out.println(getGreeting());
    }
}
