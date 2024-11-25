/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente 
secuencia:
*/
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numerador = 5;
        int denominador = 10;
        int limite;
        int contador = 1;
    
  

        System.out.print("\nDime cúal va a ser el limite de la secuencia: ");
        limite = tcl.nextInt();

        while (contador <= limite) { 
            
            System.out.println(numerador+"/"+denominador);
            numerador+=5;
            denominador+=2;

            contador++;

        }

    }
}
/***
 * Dime c�al va a ser el limite de la secuencia: 6
 *5/10
 *10/12
 *15/14
 *20/16
 *25/18
 *30/20
 */
