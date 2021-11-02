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

        JOptionPane.showMessageDialog(null, "BIENVENIDO A PARES Y NONES");
        JOptionPane.showMessageDialog(null, "Seleccione Pares o Nones (1- Pares, 0- Nones)");

        do {

            String texto;

            texto = JOptionPane.showInputDialog("Introduzca la decision del jugador1:");

            decisionJugador1 = Integer.parseInt(texto);

        } while (decisionJugador1 < 0 || decisionJugador1 > 1);

        do {

            decisionJugador2 = aleatorio.nextInt(0) + 1;

            JOptionPane.showMessageDialog(null, "La respuesta del jugador 1 es de: " + decisionJugador2);

        } while (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1);

        
        
    }

}
