/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paresnones;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author albertogarzon
 */
public class ParteB {

    public static void main(String[] args) {

        Random aleatorio = new Random();

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

        JOptionPane.showMessageDialog(null, "Se generara la decision del jugador2(maquina)");
        do {

            decisionJugador2 = aleatorio.nextInt(1) + 1;

        } while (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1);

        do {

            String texto3;

            texto3 = JOptionPane.showInputDialog("Introduzca los dedos del jugador1:");

            dedosJugador1 = Integer.parseInt(texto3);

        } while (dedosJugador1 < 0 || dedosJugador1 > 10);

        JOptionPane.showMessageDialog(null, "Se generara los dedos del jugador2(maquina)");
        do {

            dedosJugador2 = aleatorio.nextInt(10) + 1;

        } while (dedosJugador2 < 0 || dedosJugador2 > 10);
        
        sumaDedosJugadores = dedosJugador1 + dedosJugador2;

    }

}
