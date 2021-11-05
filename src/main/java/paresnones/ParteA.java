/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paresnones;

import javax.swing.JOptionPane;

/**
 *
 * @author albertogarzon
 */
/*
URL del repositorio remoto
https://github.com/AlbertoGR856/ParesNonesAlbertoGR.git
 */
public class ParteA {

    public static void main(String[] args) {

        //Constantes
        final int NUMERO_DEDOS_MINIMO = 0;
        final int NUMERO_DEDOS_MAXIMO = 10;

        //Variables introducidas por JOptionPane
        int decisionJugador1 = 0;
        int decisionJugador2 = 0;
        int dedosJugador1 = 0;
        int dedosJugador2 = 0;

        //Variable booleana utilizada para repetir la ejecución del programa
        boolean repetir = true;

        boolean seguir = true;

        //Variable que almacena la suma de los dedos de los jugadores
        int sumaDedosJugadores;

        //Bucle do-while para repetir la ejecucion del programa segun la respuesta dada por el usuario
        do {

            JOptionPane.showMessageDialog(null, "BIENVENIDO A PARES Y NONES");

            //SELECCIÓN PARES O NONES
            JOptionPane.showMessageDialog(null, "Seleccione Pares o Nones (1- Pares, 0- Nones)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                String texto;

                //Bucle con try-catch NumberFormatException
                do {

                    texto = JOptionPane.showInputDialog("Introduzca la decision del jugador1:");

                    try {

                        decisionJugador1 = Integer.parseInt(texto);

                        seguir = false;

                    } catch (NumberFormatException nfe) {

                        JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Vuelva a introducir el numero");
                    }

                } while (seguir);

                if (decisionJugador1 < 0 || decisionJugador1 > 1) {
                    JOptionPane.showMessageDialog(null, "Introduzca un rango valido, (1- Pares, 0- Nones)");
                }

            } while (decisionJugador1 < 0 || decisionJugador1 > 1);

            //Cambio la variable booleana seguir a true para que no se repita el proximo bucle dentro del try-catch
            seguir = true;

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                String texto2;

                //Bucle con try-catch NumberFormatException
                do {

                    texto2 = JOptionPane.showInputDialog("Introduzca la decision del jugador2:");

                    try {

                        decisionJugador2 = Integer.parseInt(texto2);

                        seguir = false;

                    } catch (NumberFormatException nfe) {

                        JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Vuelva a introducir el numero");

                    }

                } while (seguir);

                if (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1) {
                    JOptionPane.showMessageDialog(null, "Introduzca una opción distinta al del jugador1");
                }

                //Se incluye en la condicion del while que la respues del jugador2 sea igual a la del jugador1. Ya que ambos no pueden elegir lo mismo, por lo tanto
                //si es falso finalizara el bucle
            } while (decisionJugador2 < 0 || decisionJugador2 > 1 || decisionJugador2 == decisionJugador1);

            //Actualizao la variable booleana para que no se repita el bucle
            seguir = true;

            //SELECCIÓN DEDOS DE LOS JUGADORES
            JOptionPane.showMessageDialog(null, "Seleccione los dedos para ambos jugadores (Minimo 0 y maximo 10)");

            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                String texto3;

                //Bucle con try-catch
                do {
                    texto3 = JOptionPane.showInputDialog("Introduzca los dedos del jugador1:");

                    try {

                        dedosJugador1 = Integer.parseInt(texto3);
                        
                         seguir = false;

                    } catch (NumberFormatException nfe) {

                        JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Vuelva a introducir el numero");

                    }

                } while (seguir);

                if (dedosJugador1 < NUMERO_DEDOS_MINIMO || dedosJugador1 > NUMERO_DEDOS_MAXIMO) {

                    JOptionPane.showMessageDialog(null, "Introduza un rango valido, de 0 a 10");
                }

            } while (dedosJugador1 < NUMERO_DEDOS_MINIMO || dedosJugador1 > NUMERO_DEDOS_MAXIMO);

            //Actualizacion 
            seguir = true;
            
            //Bucle do-while para repetir la entrada de datos si no esta en el rango establecido
            do {

                String texto4;

                //Bucle con try-catch
                do{
                        
                texto4 = JOptionPane.showInputDialog("Introduzca los dedos del jugador2:");

                try{
                    
                
                dedosJugador2 = Integer.parseInt(texto4);
                
                 seguir = false;

                }catch(NumberFormatException nfe){
                    
                      JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Vuelva a introducir el numero");
                }
                
                }while(seguir);
                
                if (dedosJugador2 < NUMERO_DEDOS_MINIMO || dedosJugador2 > NUMERO_DEDOS_MAXIMO) {

                    JOptionPane.showMessageDialog(null, "Introduza un rango valido, de 0 a 10");
                }

            } while (dedosJugador2 < NUMERO_DEDOS_MINIMO || dedosJugador2 > NUMERO_DEDOS_MAXIMO);

            //Se suman los dedos de los jugadores
            sumaDedosJugadores = dedosJugador1 + dedosJugador2;

            //RESULTADO
            JOptionPane.showMessageDialog(null, "La suma de los dedos de ambos jugadores es de: " + sumaDedosJugadores);

            //Estructura if-else para saber si el numero es par o impar
            if (sumaDedosJugadores % 2 == 0) {

                JOptionPane.showMessageDialog(null, "El numero es par");

                JOptionPane.showMessageDialog(null, "El ganador es....");

                //Estructura if-else para saber quien ha ganado sabiendo que ha elegido (1-Par) 
                if (decisionJugador1 == 1) {

                    JOptionPane.showMessageDialog(null, "Jugador1");

                } else {

                    JOptionPane.showMessageDialog(null, "Jugador2");

                }

            } else {

                JOptionPane.showMessageDialog(null, "El numero es nones");

                JOptionPane.showMessageDialog(null, "El ganador es....");

                //Estrcutura if-else para saber quien ha ganado sabiendo que ha elegido (0-Nones) 
                if (decisionJugador1 == 0) {

                    JOptionPane.showMessageDialog(null, "Jugador1");

                } else {

                    JOptionPane.showMessageDialog(null, "Jugador2");

                }

            }

            //PREGUNTAR PARA SALIR
            //Se pregunta al usuario si quiere salir del programa, con la ventana JOptionPane.YES_NO_OPTION
            int op = JOptionPane.showConfirmDialog(null,
                    "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

            //Estructura if-else donde el usuario decidira si salir o no del programa
            if (op == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        null, "Saliendo del programa....");
                // Condición de parada del programa
                repetir = false;

            } else {

                JOptionPane.showMessageDialog(
                        null, "Vuelva a jugar a Pares y Nones:");
            }

            //Si se cumple la condicion del while el bucle se repetira, iniciando una nueva ejecución
        } while (repetir);

    }

}
