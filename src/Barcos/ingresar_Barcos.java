package Barcos;

import Tableros.crear_Tablero;

public class ingresar_Barcos {


   public static void ingresarBarco(int modoPartida, String[][] tableroOculto) {

        int[] partida = new int[0];

        crear_Tablero.crearTablero(tableroOculto); // Tablero para rellenar con barcos

        int[] muyFacil = {0, 0, 0, 10};
        int[] facil = {1, 1, 3, 5};
        int[] medio = {1, 1, 1, 2};
        int[] dificil = {0, 0, 1, 1};

        if (modoPartida == 0) {
            partida = muyFacil;
        } else if (modoPartida == 1) {
            partida = facil;
        } else if (modoPartida == 2) {
            partida = medio;
        } else if (modoPartida == 3) {
            partida = dificil;
        }

        Barcos.portaAviones.ingresarPortaAviones(partida, tableroOculto);
        Barcos.acorazado.ingresarAcorazado(partida, tableroOculto);
        Barcos.buques.ingresarBuque(partida, tableroOculto);
        Barcos.lancha.ingresarLancha(partida, tableroOculto);

    }


}
