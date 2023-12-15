package Mensajes;

import java.util.Random;

public class mensajePerder {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    // MENSAJE ALEATORIO EN CASO DE PARTIDA PERDIDA

    public static void perder() {

        Random generador = new Random();

        int mensajeAleatorio = generador.nextInt(0, 4);


        if (mensajeAleatorio == 0) {
            System.out.println(ANSI_RED + "\n¡HAS PERDIDO LA PARTIDA!" + "\n!TE HAS QUEDADO SIN DISPAROS!" + "\n¡NECESITAS ENTRENAR MÁS GRUMETE!\n" + ANSI_RESET);
        } else if (mensajeAleatorio == 1) {
            System.out.println(ANSI_RED + "\n¡HAS PERDIDO LA PARTIDA!" + "\n!TE HAS QUEDADO SIN DISPAROS!" + "\n¿Y TE HACES LLAMAR CAPITÁN?\n"+ ANSI_RESET);
        } else if (mensajeAleatorio == 2) {
            System.out.println(ANSI_RED + "\n¡HAS PERDIDO LA PARTIDA!" + "\n!TE HAS QUEDADO SIN DISPAROS!" + "\n¡PRUEBA A APUNTAR MEJOR EN LA SIGUENTE PARTIDA!\n"+ ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "\n¡HAS PERDIDO LA PARTIDA!" + "\n!TE HAS QUEDADO SIN DISPAROS!" + "\n¡EL OBJETIVO ERA DARLE A LOS BARCOS!\n"+ ANSI_RESET);
        }

    }


}
