package Utilidades;

import java.util.Scanner;

public class nombre {

    public static void nombreJugador (){

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nINGRESA TU NOMBRE GRUMETE: ");

        String nombreJugador = teclado.nextLine();


        System.out.println("\n¡BIENVENIDO GRUMETE " + nombreJugador + "!");


    }



}
