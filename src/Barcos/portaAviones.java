package Barcos;

import java.util.Random;

public class portaAviones {

    static void ingresarPortaAviones(int[] partida, String[][] tableroOculto) {

        Random generador = new Random();
        Random generador2 = new Random();

        for (int i = 0; i < partida[0]; i++) {

            int ejeX = generador.nextInt(0, 10);    // indice j
            int ejeY = generador2.nextInt(0, 6);   // indice i

            boolean posicionCorrectaPortaAviones = tableroOculto[ejeY][ejeX].equals("-") && tableroOculto[ejeY + 1][ejeX].equals("-") && tableroOculto[ejeY + 2][ejeX].equals("-") && tableroOculto[ejeY + 3][ejeX].equals("-") && tableroOculto[ejeY + 4][ejeX].equals("-");

            if (posicionCorrectaPortaAviones) {

                tableroOculto[ejeY][ejeX] = "P";
                tableroOculto[ejeY + 1][ejeX] = "P";
                tableroOculto[ejeY + 2][ejeX] = "P";
                tableroOculto[ejeY + 3][ejeX] = "P";
                tableroOculto[ejeY + 4][ejeX] = "P";

            } else {
                i--;
            }

        }


    }


}
