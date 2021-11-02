/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paresnones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author albertogarzon
 */
public class ParteB {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int decisionJugador1;
        int decisionJugador2;
        int dedosJugador1;
        int dedosJugador2;

        int sumaDedosJugadores;

        String respuesta;

        do {

            System.out.println("BIENVENIDO A PARES Y NONES");
            System.out.println("Seleccione Pares o Nones (1- Pares, 0- Nones)");

            do {

                System.out.println("Introduzca la decision del jugador1: ");

                decisionJugador1 = teclado.nextInt();

            } while (decisionJugador1 < 0 || decisionJugador1 > 1);

            System.out.println("Se generara la decision del jugador2(maquina)");

            do {

                decisionJugador2 = aleatorio.nextInt(1 - 0 + 1) + 0;

            } while (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1);

            do {

                System.out.println("Introduzca los dedos del jugador1: ");

                dedosJugador1 = teclado.nextInt();

            } while (dedosJugador1 < 0 || dedosJugador1 > 10);

            System.out.println("Se generara los dedos del jugador2(maquina)");
            do {

                dedosJugador2 = aleatorio.nextInt(10) + 1;

            } while (dedosJugador2 < 0 || dedosJugador2 > 10);

            sumaDedosJugadores = dedosJugador1 + dedosJugador2;

            System.out.println("La suma de los dedos de ambos jugadores es de: " + sumaDedosJugadores);

            if (sumaDedosJugadores % 2 == 0) {

                System.out.println("El numero es par");

                System.out.println("El ganador es....");

                if (decisionJugador1 == 1) {

                    System.out.println("Jugador1");

                } else {

                    System.out.println("Jugador2(maquina)");

                }

            } else {

                System.out.println("El numero es nones");

                System.out.println("El ganador es....");

                if (decisionJugador1 == 0) {

                    System.out.println("Jugador1");

                } else {

                    System.out.println("Jugador2(maquina)");

                }

            }

            //Al finalizar la estructura switch se pide por consola si el usuario quiere realizar otra iteraccion
            System.out.println("¿Quieres volver a jugar?");
            System.out.println("S o cualquier tecla - Si");
            System.out.println("N - No");

            //Al introducir un numero por teclado, se necesitara limpiar el buffer del teclado si queremos introducir un caracter o String
            teclado.nextLine();

            respuesta = teclado.nextLine();

            //Si se cumple la condicion del while, el bucle se repetira, iniciando una nueva ejecución
        } while (!respuesta.equalsIgnoreCase("N"));

        System.out.println("Finalizando programa...");

    }

}
