/***Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar 
el siguiente reporte
* */
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEstudiante,etapa;
        double promedio,contador=1;
        while(contador<=4){
            System.out.println("Dame nombre ");
            nombreEstudiante=tcl.next();
            System.out.println("Dame tu promedio");
            promedio= tcl.nextDouble();
            System.out.println("");
             if(promedio >=7) {
                 etapa = "Aprobo";
            } else {
                etapa = "Reprobo";
            }
             System.out.println("Nombre Promedio Etapa" );
             System.out.println(nombreEstudiante+ ","+   promedio  +","+ etapa);
             contador++;
        }
        
    }

    
}
/***
 * Dame nombre 
 *Juan
 *Dame tu promedio
 *5

 *Nombre Promedio Etapa
 *Juan,5.0,Reprobo
 */