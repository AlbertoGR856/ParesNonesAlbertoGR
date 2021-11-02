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

        //Clases Scanner y Random
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        //Variables introducidas por teclado
        int decisionJugador1;
        int dedosJugador1;

        //Variables generadas de forma aleatoria usando la clase Random
        int decisionJugador2;
        int dedosJugador2;

        //Variable que almacena la suma de los dedos de los jugadores
        int sumaDedosJugadores;

        //Variable String utilizada para repetir la ejecución del programa
        String respuesta;

        //Bucle do-while para repetir la ejecucion del programa segun la respuesta dada por el usuario
        do {

            System.out.println("BIENVENIDO A PARES Y NONES");

            //SELECCIÓN PARES O NONES
            System.out.println("Seleccione Pares o Nones (1- Pares, 0- Nones)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                System.out.println("Introduzca la decision del jugador1: ");

                decisionJugador1 = teclado.nextInt();

            } while (decisionJugador1 < 0 || decisionJugador1 > 1);

            System.out.println("Se generara la decision del jugador2(maquina)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                //Se genera un numero aleatorio entre el 0 y el 1
                decisionJugador2 = aleatorio.nextInt(2);

                //Se incluye en la condicion del while que la respues del jugador2 sea igual a la del jugador1. Ya que ambos no pueden elegir lo mismo, por lo tanto
                //si es falso finalizara el bucle
            } while (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1);

            //SELECCIÓN DEDOS DE LOS JUGADORES
            System.out.println("Seleccione los dedos para ambos jugadores (Minimo 0 y maximo 10)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                System.out.println("Introduzca los dedos del jugador1: ");

                dedosJugador1 = teclado.nextInt();

            } while (dedosJugador1 < 0 || dedosJugador1 > 10);

            System.out.println("Se generara los dedos del jugador2(maquina)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                //Se genera un numero aleatorio entre el 1 y el 10
                dedosJugador2 = aleatorio.nextInt(11);

            } while (dedosJugador2 < 0 || dedosJugador2 > 10);

            //Se suman los dedos de los jugadores
            sumaDedosJugadores = dedosJugador1 + dedosJugador2;

            //RESULTADO
            System.out.println("La suma de los dedos de ambos jugadores es de: " + sumaDedosJugadores);

            //Estructura if-else para saber si el numero es par o impar
            if (sumaDedosJugadores % 2 == 0) {

                System.out.println("El numero es par");

                System.out.println("El ganador es....");

                //Estructura if-else para saber quien ha ganado sabiendo que ha elegido (1-Par)
                if (decisionJugador1 == 1) {

                    System.out.println("Jugador1");

                } else {

                    System.out.println("Jugador2(maquina)");

                }

            } else {

                System.out.println("El numero es nones");

                System.out.println("El ganador es....");

                //Estrcutura if-else para saber quien ha ganado sabiendo que ha elegido (0-Nones) 
                if (decisionJugador1 == 0) {

                    System.out.println("Jugador1");

                } else {

                    System.out.println("Jugador2(maquina)");

                }

            }

            //Al finalizar la estructura if-else se pide por consola si el usuario quiere realizar otra iteraccion
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
