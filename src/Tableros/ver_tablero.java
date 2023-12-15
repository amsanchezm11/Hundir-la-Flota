package Tableros;

public class ver_tablero {

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
   public static void verTablero(String[][] tableroOculto) {


        System.out.println(ANSI_YELLOW + "   0  1  2  3  4  5  6  7  8  9" + ANSI_RESET);
        for (int i = 0; i < tableroOculto.length; i++) {
            System.out.print(ANSI_YELLOW + (char) (i + 65) + ANSI_RESET);
            System.out.print(" ");

            for (int j = 0; j < tableroOculto.length; j++) {

                System.out.print(" " + tableroOculto[i][j] + " ");

            } // for j

            System.out.println();
        } //for i


    }





}
