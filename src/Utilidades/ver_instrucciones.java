package Utilidades;

public class ver_instrucciones {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void instrucciones(){
        System.out.println(ANSI_YELLOW + "---- [CÓMO JUGAR A HUNDIR LA FLOTA] ----\n" + ANSI_RESET);

        System.out.println(ANSI_YELLOW + "[1] - OBJETIVO PRINCIPAL DEL JUEGO\n"+ ANSI_RESET + "\n- El juego consiste en hundir la flota del contrincante(CPU).\n" + "- Para ello, el jugador deberá encontrar y hundir la flota del contrincante con los disparos antes de que se le acaben los intentos.\n");

        System.out.println(ANSI_YELLOW + "[2] - TABLERO DE JUEGO\n"+ ANSI_RESET + "\nLa partida se juega en un tablero 10X10" +
                "\n[0-9] COLUMNAS" + "\n[A-J] FILAS\n");

        System.out.println(ANSI_YELLOW + "[3] - TIPOS DE BARCOS: \n"+ ANSI_RESET + "\n- LANCHA -> Ocupa una casilla del tablero" +
                "\n- BUQUE -> Ocupa 3 casillas HORIZONTALES consecutivas del tablero." + "\n- ACORAZADO -> Ocupa 4 casillas HORIZONTALES consecutivas del tablero" +
                "\n- PORTAAVIONES -> Ocupa 5 casillas VERTICALES consecutivas del tablero.\n");

        System.out.println(ANSI_YELLOW + "[4] - MODOS DE DIFICULTAD:\n"+ ANSI_RESET + "\n- MUY FÁCIL-> El ordenador colocará 10 lanchas (no hay otro tipo de barcos)\n" +
                "en el tablero y el jugador tendrá 50 intentos para hundirlos todos.\n" + "\n- FÁCIL-> El ordenador colocará 10 barcos (5 lanchas, 3 buques, 1 acorazado\n" +
                "y 1 portaaviones) en el tablero y el jugador tendrá 50 intentos para\n" + "hundirlos todos.\n" + "\n- MEDIO-> El ordenador colocará 5 barcos (2 lanchas, 1 buque, 1 acorazado\n" +
                "y 1 portaaviones) en el tablero y el jugador tendrá 30 intentos para\n" + "hundirlos todos.\n" + "\n- DÍFICIL-> El ordenador colocará 2 barcos (1 lancha y 1 buque) en el tablero\n" +
                "y el jugador tendrá 10 intentos para hundirlos todos.\n");

        System.out.println(ANSI_YELLOW + "[5] DISPARO:\n"+ ANSI_RESET + "\n- Al jugador se le preguntará en qué coordenadas desea disparar\n" + "- [0-9] PARA COLUMNA\n" + "- [A-J] PARA FILA");

    }

}
