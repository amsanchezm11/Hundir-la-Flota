package Barcos;

import java.util.Random;

public class buques {

    static void ingresarBuque(int[] partida, String[][] tableroOculto) {

        Random generador = new Random();
        Random generador2 = new Random();

        // PONER BUQUES
        for (int i = 0; i < partida[2]; i++) {


            int ejeX = generador.nextInt(0, 8);    // indice j
            int ejeY = generador2.nextInt(0, 10);   // indice i

            boolean posicionCorrectaBuque = tableroOculto[ejeY][ejeX].equals("-") && tableroOculto[ejeY][ejeX + 1].equals("-") && tableroOculto[ejeY][ejeX + 2].equals("-");

            if (posicionCorrectaBuque) {

                tableroOculto[ejeY][ejeX] = "B";
                tableroOculto[ejeY][ejeX + 1] = "B";
                tableroOculto[ejeY][ejeX + 2] = "B";
            } else {
                i--;

            }

        }




    }



}
