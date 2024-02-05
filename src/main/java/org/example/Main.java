package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] opciones = {"piedra", "papel", "tijera"};


        String eleccionCpu;
        eleccionCpu= opciones[random.nextInt(opciones.length)];

        String eleccionJugador;
        System.out.println("Elige una opción (piedra, papel, tijera): ");
        eleccionJugador= scanner.nextLine().toLowerCase();


        System.out.println("Jugador eligió: " + eleccionJugador);
        System.out.println("Computadora eligió: " + eleccionCpu);


        String resultado;


        if (eleccionJugador.equals(eleccionCpu)) {
            resultado = "¡Empate! Ambos eligieron lo mismo. Juega otra vez.";
        } else if ((eleccionJugador.equals("piedra") && eleccionCpu.equals("tijera")) ||
                (eleccionJugador.equals("tijera") && eleccionCpu.equals("papel")) ||
                (eleccionJugador.equals("papel") && eleccionCpu.equals("piedra"))) {
            resultado = "¡Ganaste! " + eleccionJugador + " vence a " + eleccionCpu + ".";
        } else {
            resultado = "¡Perdiste! " + eleccionCpu + " vence a " + eleccionJugador + ".";
        }


        System.out.println(resultado);
    }
}