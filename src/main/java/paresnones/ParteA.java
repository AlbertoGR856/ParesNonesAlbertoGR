/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paresnones;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author albertogarzon
 */
public class ParteA {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int decisionJugador1;
        int decisionJugador2;
        int dedosJugador1;
        int dedosJugador2;

        int sumaDedosJugadores;

        JOptionPane.showMessageDialog(null, "BIENVENIDO A PARES Y NONES");
        JOptionPane.showMessageDialog(null, "Seleccione Pares o Nones (1- Pares, 0- Nones)");

        do {

            String texto;

            texto = JOptionPane.showInputDialog("Introduzca la decision del jugador1:");

            decisionJugador1 = Integer.parseInt(texto);

        } while (decisionJugador1 < 0 || decisionJugador1 > 1);

        do {

            String texto2;

            texto2 = JOptionPane.showInputDialog("Introduzca la decision del jugador2:");

            decisionJugador2 = Integer.parseInt(texto2);

        } while (decisionJugador2 < 0 || decisionJugador2 > 1);

        JOptionPane.showMessageDialog(null, "Seleccione los dedos para ambos jugadores (Minimo 1 y maximo 10)");

        do {

            String texto3;

            texto3 = JOptionPane.showInputDialog("Introduzca los dedos del jugador1:");

            dedosJugador1 = Integer.parseInt(texto3);

        } while (dedosJugador1 < 1 || dedosJugador1 > 10);

        do {

            String texto4;

            texto4 = JOptionPane.showInputDialog("Introduzca los dedos del jugador1:");

            dedosJugador2 = Integer.parseInt(texto4);

        } while (dedosJugador2 < 1 || dedosJugador2 > 10);

        sumaDedosJugadores = dedosJugador1 + dedosJugador2;

        JOptionPane.showMessageDialog(null, "La suma de los dedos de ambos jugadores es de: " + sumaDedosJugadores);

        JOptionPane.showMessageDialog(null, "El ganador es....");
        
        

        if (sumaDedosJugadores % 2 == 0) {

            JOptionPane.showMessageDialog(null, "El numero es par");

            if (decisionJugador1 == 1) {

                JOptionPane.showMessageDialog(null, "El Jugador1 gana");

            } else if (decisionJugador2 == 1) {

                JOptionPane.showMessageDialog(null, "El Jugador2 gana");

            }

        } else {

             JOptionPane.showMessageDialog(null, "El numero es nones");
            
            if (decisionJugador1 == 0) {

                JOptionPane.showMessageDialog(null, "El Jugador1 gana");

            } else if (decisionJugador2 == 0) {

                JOptionPane.showMessageDialog(null, "El Jugador2 gana");

            }

        }

    }

}
