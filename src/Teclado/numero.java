package Teclado;

import java.util.Scanner;

public class numero {

    //[0] ---> FUNCION/ TRY CATCH PARA VALIDAR LA OPCION DEL MENU PRINCIPAL
    public static int validarMenu(int opcionMenuJugador){

        Scanner teclado = new Scanner(System.in);

        boolean correctoMenu;

        do {

            System.out.println("\n¿QUÉ QUIERES HACER?");
            System.out.print("[ELECIÓN] -> ");
            try {
                opcionMenuJugador = teclado.nextInt();
                correctoMenu = true;
            }catch (Exception e){

                teclado.nextLine();
                System.out.println("HAS INTRODUCIDO MAL UN VALOR. VUELVE A INTENTARLO.");
                correctoMenu = false;
            }
        }while (!correctoMenu);

        return opcionMenuJugador;

    }

    //[1] ---> FUNCION/ TRY CATCH PARA VALIDAR LA OPCION DEL SUBMENU
public static int validarSubMenu (int opcionSubMenu){

    Scanner teclado = new Scanner(System.in);

    boolean correctoSubMenu;

    do {

        System.out.println("\n¿QUÉ MODO VAS A ELEGIR?");
        System.out.print("[ELECIÓN] -> ");
        try {
            opcionSubMenu = teclado.nextInt();
            correctoSubMenu = true;
        }catch (Exception e){

            teclado.nextLine();
            System.out.println("HAS INTRODUCIDO MAL UN VALOR. VUELVE A INTENTARLO.");
            correctoSubMenu = false;
        }
    }while (!correctoSubMenu);


        return opcionSubMenu;
}

}
