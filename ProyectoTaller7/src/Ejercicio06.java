/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta 
 * haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un 
 * descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que
 * sea otro tipo de cliente, no hay descuento. Generar un proceso que permita 
 * ingresar 7 ventas: por cada venta preguntar los siguiente datos:

Nombre del cliente
 *Costo de la computadora (solo se vende una computadora por transacción)
 *Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra
 * computadora con precio $100

 */
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        String nombreCliente;
        float costoComputadora,descuento,costoFinal = 0;
        int tipoCliente,conta=1;
        Scanner tcl = new Scanner(System.in);
        while (conta<=7) {
            
            System.out.print("Nombre del cliente: ");
            nombreCliente = tcl.next();

            System.out.print("Costo de la computadora: ");
            costoComputadora = tcl.nextFloat();
           
            System.out.print("Tipo de cliente:(1/2) ");
            tipoCliente = tcl.nextInt();
            if(tipoCliente == 1) {
                descuento = 0.10f;
                costoFinal = costoComputadora - (costoComputadora * descuento);
                System.out.println("Cliente tipo"+tipoCliente +    
                        "el costo final del computadora es "+costoFinal);
            } else if(tipoCliente == 2) {
                descuento = 0.20f;
                costoFinal = costoComputadora - (costoComputadora * descuento);
                System.out.println("Cliente tipo"+tipoCliente +
                        "el costo final del computadoe es "+costoFinal);
            } else {
                descuento = 0f;
                System.out.println("El costo de la computadora es "+costoComputadora);
            }
            
            conta++;
        }
        
    }
        
}
/***
 * Nombre del cliente: Maria
 *Costo de la computadora: 4000
 *Tipo de cliente:(1/2) 2
 *Cliente tipo2el costo final del computadoe es 3200.0
 */
