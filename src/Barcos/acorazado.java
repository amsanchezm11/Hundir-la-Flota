package Barcos;

import java.util.Random;

public class acorazado {

    static void ingresarAcorazado(int[] partida, String[][] tableroOculto) {

        Random generador = new Random();
        Random generador2 = new Random();

        // PONER ACORAZADO
        for (int i = 0; i < partida[1]; i++) {

            int ejeX = generador.nextInt(0, 7);    // indice j
            int ejeY = generador2.nextInt(0, 10);   // indice i

            boolean posicionCorrectaAcorazado = tableroOculto[ejeY][ejeX].equals("-") && tableroOculto[ejeY][ejeX + 1].equals("-") && tableroOculto[ejeY][ejeX + 2].equals("-") && tableroOculto[ejeY][ejeX + 3].equals("-");

            if (posicionCorrectaAcorazado) {

                tableroOculto[ejeY][ejeX] = "Z";
                tableroOculto[ejeY][ejeX + 1] = "Z";
                tableroOculto[ejeY][ejeX + 2] = "Z";
                tableroOculto[ejeY][ejeX + 3] = "Z";

            } else {
                i--;

            }

        }

    }


}
