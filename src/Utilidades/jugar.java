package Utilidades;
import Tableros.*;
public class jugar {

    public static void partida (int modoPartida, String [][] tableroOculto, String [][] tableroJugador){

// [0]---> CREAMOS EL TABLERO DONDE SE INGRESAN LOS BARCOS
        crear_Tablero.crearTablero(tableroOculto);

// [1]---> CREAMOS EL TABLERO DEL JUGADOR
        crear_Tablero.crearTablero(tableroJugador);

// [2]---> SE INTRODUCEN LOS BARCOS EN EL TABLERO OCULTO
        Barcos.ingresar_Barcos.ingresarBarco(modoPartida, tableroOculto);

        //Tableros.ver_tablero.verTablero(tableroOculto); //PARA PODER VER LOS BARCOS
// [3]---> EL JUGADOR DISPARA
        disparo.disparoJugador(modoPartida,tableroOculto,tableroJugador);

    }

}

