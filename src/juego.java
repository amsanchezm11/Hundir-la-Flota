import Estadisticas.estadisticas;
import static Utilidades.jugar.partida;
import static Utilidades.nombre.nombreJugador;
import static Utilidades.ver_instrucciones.instrucciones;
import static Teclado.numero.*;
import static Mensajes.mensajeBienvenida.bienvenidaJugador;

public class juego {
    public static void main(String[] args) {

        // DECLARACIÓN DE VARIABLES

        String [][] tableroOculto = new String[10][10];
        String [][] tableroJugador = new String[10][10];

        boolean respuestaMenu = false;
        boolean respuestaMenuPartida = false;
        int opcionMenuJugador = 0;
        int respuestaSubMenu = 0;

        // [0]---> MENSAJE DE BIENVENIDA

        bienvenidaJugador();

        // [1]---> ELECCIÓN NOMBRE JUGADOR

        nombreJugador();

        // [2]---> MENU PRINCIPAL

        do {

            System.out.println("\n\n");
            System.out.println("\n------[MENU PRINCIPAL]------\n");
            System.out.println("[1] -> INSTRUCCIONES DE JUEGO");
            System.out.println("[2] -> JUGAR PARTIDA");
            System.out.println("[3] -> ESTADÍTICAS");
            System.out.println("[4] -> SALIR");

            switch (validarMenu(opcionMenuJugador)) {

                case 1 -> {
                    System.out.println("\n\n");
                    instrucciones();
                }

                case 2 -> {
                    System.out.println("\n\n");
                    System.out.println("Has seleccionado --> [JUGAR PARTIDA]\n");
                    do {
                        System.out.println("[SELECIONA EL MODO DE DICICULTAD]\n");
                        System.out.println("[1] MODO GRUMETE(MUY FACIL⛵)");
                        System.out.println("[2] MODO TENIENTE(FÁCIL🛥️)");
                        System.out.println("[3] MODO COMANDANTE(MEDIO🚢)");
                        System.out.println("[4] MODO CAPITÁN(DIFÍCIL⛴️)");
                        System.out.println("[5] ATRÁS");
                        
                        switch (validarSubMenu(respuestaSubMenu)){
                            case 1 -> {
                                System.out.println("[PARTIDA MUY FÁCIL]");
                                partida(0,tableroOculto,tableroJugador);
                            }
                            case 2 -> {
                                System.out.println("[PARTIDA FÁCIL]");
                                partida(1,tableroOculto,tableroJugador);
                            }
                            case 3 -> {
                                System.out.println("[PARTIDA MEDIO]");
                                partida(2,tableroOculto,tableroJugador);
                                 }
                            case 4 -> {
                                System.out.println("[PARTIDA DIFÍCIL]");
                                partida(3,tableroOculto,tableroJugador);
                                }
                            case 5 -> {
                                System.out.println("🔙 VOLVIENDO...");
                                respuestaMenuPartida = true;
                            }
                            default -> System.out.println("ERROR - OPCIÓN NO VÁLIDA. INTÉNTALO DE NUEVO");

                        }

                    }while(!respuestaMenuPartida);
                }

                case 3 -> estadisticas.estadisticasJugador();

                case 4 -> {
                    System.out.println("GRACIAS POR JUGAR ¡HASTA LA VISTA GRUMETE!");
                    respuestaMenu = true;
                }

                default ->
                        System.out.println("HAS INGRESADO MAL UN VALOR, INTENTALO DE NUEVO.");
            }

        } while (!respuestaMenu);

    }
}
