/***
 *Generar e imprimir la siguiente serie:

 *sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)

 */
public class Ejercico07 {
    public static void main(String[] args) {
                int i = 1;
        int limite = 10;
        double sumatoria = 0.0;
        String cadenaAcumulada = "sumatoria = ";

        while (i <= limite) {
            double termino = 1.0 / i;

            if (i % 2 == 0) {
                sumatoria += termino;
                cadenaAcumulada += "+(1/" + i + ")";
            } else {
                sumatoria -= termino;
                cadenaAcumulada += "-(1/" + i + ")";
            }

            i++;
        }

        System.out.println(cadenaAcumulada);

        }
        

}
    
/***
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */

