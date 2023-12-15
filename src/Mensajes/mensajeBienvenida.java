package Mensajes;

public class mensajeBienvenida {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void bienvenidaJugador(){

        System.out.println("\n                        [⚓ BIENVENIDO A ⚓]                          \n");

        System.out.println(ANSI_BLUE+ "  _    _                 _ _        _         ______ _       _        ");
        System.out.println(" | |  | |               | (_)      | |       |  ____| |     | |       ");
        System.out.println(" | |__| |_   _ _ __   __| |_ _ __  | | __ _  | |__  | | ___ | |_ __ _ ");
        System.out.println(" |  __  | | | | '_ \\ / _` | | '__| | |/ _` | |  __| | |/ _ \\| __/ _` |");
        System.out.println(" | |  | | |_| | | | | (_| | | |    | | (_| | | |    | | (_) | || (_| |");
        System.out.println(" |_|  |_|\\__,_|_| |_|\\__,_|_|_|    |_|\\__,_| |_|    |_|\\___/ \\__\\__,_|"+ANSI_RESET);



    }

}
