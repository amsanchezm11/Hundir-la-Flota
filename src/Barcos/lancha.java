package Barcos;

import java.util.Random;

public class lancha {

    static void ingresarLancha(int [] partida, String[][] tableroOculto){

        Random generador = new Random();
        Random generador2 = new Random();

        // PONER LANCHAS
        for (int i = 0; i < partida[3]; i++) {

            int ejeX = generador.nextInt(0, 10);    // indice j
            int ejeY = generador2.nextInt(0, 10);   // indice i


            if (tableroOculto[ejeY][ejeX].equals(String.valueOf('-'))) {
                tableroOculto[ejeY][ejeX] = String.valueOf('L');

            }else{
                i--;
            }
        }


    }

}
