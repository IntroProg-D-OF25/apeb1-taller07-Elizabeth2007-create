/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada 
 * jugador se debe solicitar:
 *Nombre el jugador
 *Posición en el campo de juego
 *Edad
 *Estatura
 *El ciclo de ingreso de información deberá terminar cuando el usuario lo
* decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * 
 */
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        String nombreJugador;
        String posicionJugador;
        String edadJugador;
        String estaturaJugador;
        String cadenaAcumulada = "";
        boolean opcion = true;
        int numEscogido;
        int i = 1;

        Scanner tcl = new Scanner(System.in);

        while (opcion) {
            
            System.out.println("Ingrese los datos del jugador: ");
            System.out.println("\nNombre del jugador: ");
            nombreJugador = tcl.nextLine();
            System.out.println("\nPosición del jugador en el campo de juego: ");
            posicionJugador = "-" + tcl.nextLine() + "-";
            System.out.println("\nEdad del jugador: ");
            edadJugador = "edad " + tcl.nextLine();
            System.out.println("\nEstatura del jugador: ");
            estaturaJugador = "estatura " + tcl.nextLine();

            cadenaAcumulada += i + ". " + nombreJugador + " " + posicionJugador
                    + ", " + edadJugador + ", " + estaturaJugador;
            cadenaAcumulada += "\n";

            System.out.println("\nEn caso de que ya no desee ingresar más"
                    + " jugadores precione (1), caso contrario presione (2): ");
            numEscogido = tcl.nextInt();
            tcl.nextLine();
            i++;

            if(numEscogido == 1) {
                opcion = false;
            } else {
                opcion = true;
            }

        }

        System.out.println("Listado de Jugadores");
        System.out.println(cadenaAcumulada);


    }
}
/***
 * Ingrese los datos del jugador: 

 *Nombre del jugador: 
 *Juan

 *Posici�n del jugador en el campo de juego: 
 *Medio campo

 *Edad del jugador: 
 *18

 *Estatura del jugador: 
 *1,7

 *En caso de que ya no desee ingresar m�s jugadores precione (1), caso contrario presione (2): 
 *1
 *Listado de Jugadores
 *1. Juan -Medio campo-, edad 18, estatura 1,7
 */