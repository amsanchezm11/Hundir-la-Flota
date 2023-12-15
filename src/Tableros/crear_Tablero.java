package Tableros;

public class crear_Tablero {

    public static String[][] crearTablero(String [][] tableroOculto) {

        //String [][] tableroOculto = new String[10][10];

        for (int i = 0; i < tableroOculto.length; i++) {

            for (int j = 0; j < tableroOculto.length; j++) {

                tableroOculto[i][j] = String.valueOf('-');
            }

        }

        return tableroOculto;
    }



    public static void main(String[] args) {

    }
}
