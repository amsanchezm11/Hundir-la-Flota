package Utilidades;

import Mensajes.mensajeGanar;
import Mensajes.mensajePerder;
import java.util.Scanner;
public class disparo {
   public static int partidasTotalesGanadas;
   public static int partidasTotalesJugadas;
   public static int partidaMfacilGanada;
    public static int partidaMfacilJugada;
    public static int partidaFacilGanada;
    public static int partidaFacilJugada;
    public static int partidaMedioGanada;
    public static int partidaMedioJugada;
    public static int partidaDificilGanada;
    public static int partidaDificilJugada;

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void disparoJugador(int modoPartida, String[][] tableroOculto, String[][] tableroJugador) {

        Scanner teclado = new Scanner(System.in);

        int[] rondas = {50, 50, 30, 10};
        int rondasJugador = 0;
        int aciertos = 0;
        int disparoEjeY = 0;
        boolean correctoEjeY,correctoEjeX = false;

// [0]---> SEGUN EL MODO DE PARTIDA SE ASIGNARÁN LAS RONDAS Y LOS ACIERTOS NECESARIOS PARA GANAR
        if (modoPartida == 0) {
            rondasJugador = rondas[0];
            aciertos = 10;
        } else if (modoPartida == 1) {
            rondasJugador = rondas[1];
            aciertos = 23;
        } else if (modoPartida == 2) {
            rondasJugador = rondas[2];
            aciertos = 14;
        } else if (modoPartida == 3) {
            rondasJugador = rondas[3];
            aciertos = 4;
        }

// [1]---> BUCLE PARA REALIZAR TODOS LOS DISPAROS
        for (int i = 1; i <= rondasJugador; i++) {

            int disparos = (rondasJugador+1) -i;
            String disparoEjeX = "";

            System.out.println("\n[Elige las coordenadas de tu disparo]" + ANSI_GREEN + "    [RONDA: " + (rondasJugador - disparos) + "]" + ANSI_RESET + ANSI_BLUE + "   [DISPAROS RESTANTES: " + disparos + "]" + ANSI_RESET);

            System.out.println(ANSI_YELLOW + "\n        [TABLERO JUGADOR]\n" + ANSI_RESET);
            Tableros.ver_tablero.verTablero(tableroJugador);

// [2]---> OPCION DE ELEGIR LA LETRA DE LA COORDENADA "X" CON TRY-CATCH

            do {
                System.out.print("\nELIGE UNA LETRA[A-J] --> ");
                try {

                    disparoEjeX = teclado.nextLine().toUpperCase();
                    if (disparoEjeX.matches("^[A-J]$")) {   // USO DE MATCHES() PARA QUE SOLO INTRODUZCA VALORES DE A-J
                        correctoEjeX = true;
                    }else {
                        System.out.println(ANSI_RED + "\nHAS INTRODUCIDO MAL LA LETRA. VUELVE A INTENTARLO." + ANSI_RESET);
                        correctoEjeX = false;
                    }
                }catch (Exception e){

                    teclado.nextLine();
                    System.out.println(ANSI_RED + "HAS INTRODUCIDO MAL LA LETRA. VUELVE A INTENTARLO." + ANSI_RESET);
                    correctoEjeX = false;

                }
            }while (!correctoEjeX);

// [3]---> OPCION DE ELEGIR EL NUMERO DE LA COORDENADA "Y" CON TRY-CATCH
            do {
                System.out.print("\nELIGE UN NÚMERO[0-9] --> ");
                try {
                    disparoEjeY = teclado.nextInt();
                    if (disparoEjeY >=0 && disparoEjeY < 10){
                        correctoEjeY = true;
                    }else {
                        teclado.nextLine();
                        System.out.println(ANSI_RED + "HAS INTRODUCIDO MAL UN VALOR. VUELVE A INTENTARLO." + ANSI_RESET);
                        correctoEjeY = false;
                    }
                }catch (Exception e){

                    teclado.nextLine();
                    System.out.println(ANSI_RED + "HAS INTRODUCIDO MAL UN VALOR. VUELVE A INTENTARLO." + ANSI_RESET);
                    correctoEjeY = false;
                }
            }while (!correctoEjeY);

            int disparoEjeX2 = -1;  // NOMBRAMOS UNA SEGUNDA VARIABLE TIPO INT PARA TOMAR EL VALOR DE LA LETRA

            boolean letraCorrecta = disparoEjeX.equals("A") || disparoEjeX.equals("B") || disparoEjeX.equals("C") || disparoEjeX.equals("D") || disparoEjeX.equals("E") || disparoEjeX.equals("F") || disparoEjeX.equals("G") || disparoEjeX.equals("H") || disparoEjeX.equals("I") || disparoEjeX.equals("J");

// [4]---> CAMBIAMOS EL VALOR DE LA LETRA POR UN NUMERO PARA LOS DISPAROS

            if (letraCorrecta) {
                switch (disparoEjeX) {
                    case "A" -> disparoEjeX2 = 0;
                    case "B" -> disparoEjeX2 = 1;
                    case "C" -> disparoEjeX2 = 2;
                    case "D" -> disparoEjeX2 = 3;
                    case "E" -> disparoEjeX2 = 4;
                    case "F" -> disparoEjeX2 = 5;
                    case "G" -> disparoEjeX2 = 6;
                    case "H" -> disparoEjeX2 = 7;
                    case "I" -> disparoEjeX2 = 8;
                    case "J" -> disparoEjeX2 = 9;
                }
            } else {
                System.out.println(ANSI_RED + "\n[🛑🛑ERROR🛑🛑] - LETRA INCORRECTA, VUELVA A INTENTARLO.\n" + ANSI_RESET);
                i--;
            }

            System.out.print("\nDISPARANDO EN COORDENADAS... " + disparoEjeX + "-" + disparoEjeY + "☄️\n");

//[5] ---> COMPROBAMOS EN EL TABLERO OCULTO SI EL JUGADOR HA ACERTADO EL DISPARO

            switch (tableroOculto[disparoEjeX2][disparoEjeY]) {
                case "-" -> {
                    System.out.println(ANSI_BLUE + "🌊🌊🌊    ¡AGUA!   🌊🌊🌊" + ANSI_RESET);
                    tableroJugador[disparoEjeX2][disparoEjeY] = ANSI_BLUE+"A"+ANSI_RESET;
                    tableroOculto[disparoEjeX2][disparoEjeY] = "A";    // PARA QUE CUANDO EL JUGADOR REPITA UN DISPARO LE DE ERROR

                }
                case "A" -> {
                    System.out.println("YA HAS DISPARADO EN ESA COORDENADA.\n INTENTALO DE NUEVO.");
                    i--;
                }

                case "X" -> {
                    System.out.println("YA HAS DISPARADO EN ESA COORDENADA.\n VUELVE A DISPARAR.");
                    i--;
                }
                default -> {
                    System.out.println(ANSI_RED + "💥💥💥    ¡TOCADO!    💥💥💥" + ANSI_RESET);
                    tableroJugador[disparoEjeX2][disparoEjeY] = ANSI_RED+"X"+ANSI_RESET;
                    tableroOculto[disparoEjeX2][disparoEjeY] = "X";    // PARA QUE CUANDO EL JUGADOR REPITA UN DISPARO LE DE ERROR
                    aciertos--;
                }
            }

            teclado.nextLine(); // PARA LIMPIAR EL BUFFER EN LA RONDA SIGUIENTE


            if (modoPartida == 0 && aciertos == 0) {
                rondasJugador = 0;  // PARA PARAR SALIR DEL BUCLE FOR
                mensajeGanar.ganar(modoPartida);
                // TOTALES
                partidasTotalesGanadas++;
                partidasTotalesJugadas++;
                // PARTIDA MODO MUY FACIL
                partidaMfacilGanada++;
                partidaMfacilJugada++;


            } else if (modoPartida==1 && aciertos == 0) {
                rondasJugador = 0;
                mensajeGanar.ganar(modoPartida);
                partidasTotalesGanadas++;
                partidasTotalesJugadas++;
                // PARTIDA MODO FACIL
                partidaFacilGanada++;
                partidaFacilJugada++;

            } else if (modoPartida==2 && aciertos == 0) {
                rondasJugador = 0;
                mensajeGanar.ganar(modoPartida);
                partidasTotalesGanadas++;
                partidasTotalesJugadas++;
                // PARTIDA MODO MEDIO
                partidaMedioGanada++;
                partidaMedioJugada++;

            } else if (modoPartida==3 && aciertos == 0) {
                rondasJugador = 0;
                mensajeGanar.ganar(modoPartida);
                partidasTotalesGanadas++;
                partidasTotalesJugadas++;
                // PARTIDA MODO DIFICIL
                partidaDificilGanada++;
                partidaDificilJugada++;

            }
                // MENSAJE CUANDO EL JUGADOR PIERDE(ES ALEATORIO)

                if (modoPartida==0 && i==50){
                    mensajePerder.perder();
                    partidaMfacilJugada++;
                    partidasTotalesJugadas++;
                } else if (modoPartida==1 && i==50) {
                    mensajePerder.perder();
                    partidaFacilJugada++;
                    partidasTotalesJugadas++;
                } else if (modoPartida==2 && i==30) {
                    mensajePerder.perder();
                    partidaMedioJugada++;
                    partidasTotalesJugadas++;
                }else if (modoPartida==3 && i==10){
                    mensajePerder.perder();
                    partidaDificilJugada++;
                    partidasTotalesJugadas++;
                }


        }

    }


}









