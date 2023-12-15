package Mensajes;

public class mensajeGanar {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    // MENSAJE PERSONALIZADO DE PARTIDA GANADA SEGUN EL MODO QUE ELIJA EL JUGADOR

    public static void ganar(int modoPartida){

        if (modoPartida==0){
            System.out.println(ANSI_GREEN + "¡¡¡ ENHORABUENA GRUMETE HAS GANADO EN MODO MUY FÁCIL !!!" + ANSI_RESET);
        } else if (modoPartida==1) {
            System.out.println(ANSI_GREEN + "¡¡¡ ENHORABUENA GRUMETE HAS GANADO EN MODO FÁCIL !!!" + ANSI_RESET);
        } else if (modoPartida==2) {
            System.out.println(ANSI_GREEN + "¡¡¡ ENHORABUENA GRUMETE HAS GANADO EN MODO MEDIO !!!" + ANSI_RESET);
        }else {
            System.out.println(ANSI_GREEN + "¡¡¡ ENHORABUENA GRUMETE HAS GANADO EN MODO DIFÍCIL !!!" + ANSI_RESET);
        }

    }

}
