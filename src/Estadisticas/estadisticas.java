package Estadisticas;

//[1]---> IMPORTAMOS LAS VARIABLES GLOBALES DE LAS ESTADISTICAS TOTALES DE LA PARTIDA
import static Utilidades.disparo.partidasTotalesJugadas;
import static Utilidades.disparo.partidasTotalesGanadas;
//[1]---> IMPORTAMOS LAS VARIABLES GLOBALES DE LAS ESTADISTICAS DE PARTIDA MUY FACIL
import static Utilidades.disparo.partidaMfacilGanada;
import static Utilidades.disparo.partidaMfacilJugada;
//[2]---> IMPORTAMOS LAS VARIABLES GLOBALES DE LAS ESTADISTICAS DE PARTIDA FACIL
import static Utilidades.disparo.partidaFacilGanada;
import static Utilidades.disparo.partidaFacilJugada;
//[3]---> IMPORTAMOS LAS VARIABLES GLOBALES DE LAS ESTADISTICAS DE PARTIDA MEDIO
import static Utilidades.disparo.partidaMedioGanada;
import static Utilidades.disparo.partidaMedioJugada;
//[4]---> IMPORTAMOS LAS VARIABLES GLOBALES DE LAS ESTADISTICAS DE PARTIDA DIFICIL
import static Utilidades.disparo.partidaDificilGanada;
import static Utilidades.disparo.partidaDificilJugada;



public class estadisticas {
    public static final String ANSI_YELLOW = "\u001B[33m"; // COLOR PARA ESTADISTICAS MUY FACIL
    public static final String ANSI_GREEN = "\u001B[32m";  // COLOR PARA ESTADISTICAS FACIL
    public static final String ANSI_PURPLE = "\u001B[35m"; // COLOR PARA ESTADISTICAS MEDIO
    public static final String ANSI_RED = "\u001B[31m"; // COLOR PARA ESTADISTICAS DIFICIL
    public static final String ANSI_RESET = "\u001B[0m";
    public static void estadisticasJugador(){

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                                                                                 *");
        System.out.println("*                                          [ESTADÍSTICAS]                                         *");
        System.out.println("*                                                                                                 *");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\nPARTIDAS TOTALES JUGADAS: " + partidasTotalesJugadas +"\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\nPARTIDAS TOTALES GANADAS: " + partidasTotalesGanadas +"\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\nPARTIDAS GANADAS:"+ANSI_YELLOW+"      [MODO MUY FÁCIL] " +ANSI_RESET+ANSI_GREEN+"      [MODO FÁCIL] " +ANSI_RESET + ANSI_PURPLE + "      [MODO MEDIO] " +ANSI_RESET+ANSI_RED+ "      [MODO DIFÍCIL] " + ANSI_RESET);
        System.out.println("                              "+ ANSI_YELLOW +partidaMfacilGanada+ ANSI_RESET + "                    "+ ANSI_GREEN + partidaFacilGanada + ANSI_RESET + "                  "+ ANSI_PURPLE + partidaMedioGanada + ANSI_RESET + "                   "+ ANSI_RED + partidaDificilGanada + ANSI_RESET);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("\nPARTIDAS JUGADAS:"+ANSI_YELLOW+"      [MODO MUY FÁCIL] " +ANSI_RESET+ANSI_GREEN+"      [MODO FÁCIL] " +ANSI_RESET + ANSI_PURPLE+ "      [MODO MEDIO] " +ANSI_RESET+ANSI_RED+ "      [MODO DIFÍCIL] " + ANSI_RESET);
        System.out.println("                              "+ ANSI_YELLOW +partidaMfacilJugada+ ANSI_RESET + "                    "+ ANSI_GREEN + partidaFacilJugada+ ANSI_RESET + "                  "+ ANSI_PURPLE + partidaMedioJugada + ANSI_RESET + "                   "+ ANSI_RED + partidaDificilJugada + ANSI_RESET);
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");


    }


}
