/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5
 * empleados. Por cada empleado se debe solicitar el nombre, numero de días
 * trabajados y costo del día trabajo. Calcular el valor a cancelar por la 
 * empresa para cada empleado. Presentar un reporte como el siguiente:
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nameEmpleado;
        int diastrabajados, conta=1;
        double costodia,total;
         while(conta <=5){
            System.out.println("dame nombre y dias tarbajados ");
            nameEmpleado=tcl.next();
            diastrabajados= tcl.nextInt();
            System.out.println("ingresa el costo por dia ");
            costodia=tcl.nextDouble();
            System.out.println("Nombre dias costo total);");
            System.out.println(nameEmpleado +"  "+diastrabajados+"    "+costodia+"  "+(costodia*diastrabajados));
            conta++;
        }
    }
}
/***
 * dame nombre y dias tarbajados 
 *Maria 10
 *ingresa el costo por dia 
 *2,5
 *Nombre dias costo total);
 *Maria  10    2.5  25.0
 *dame nombre y dias tarbajados 

 */
