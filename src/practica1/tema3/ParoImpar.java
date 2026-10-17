package tema3;
/*
+Instituto bTecnologico de Pachuca
+Fundamentos de la programacion
+Cruz Guerrero Cristian Manuel
*2016-10-14
*
* */

import java.util.Scanner;



public class ParoImpar {
    static void main() {
        Scanner s = new Scanner(System.in);
        int Respuesta;
        do {
         int n, Contador = 1;
         System.out.println("Ingrese un Numero");
         n = s.nextInt();



            while (Contador <= n) {

                if (n % 2 == 0) {
                    System.out.println("El numero " + Contador + " es par ");
                } else {
                    System.out.println("El Numero " + Contador + " es Impar ");
                }
                Contador++;


            }
            System.out.println("Deseas Ingresar otro Numero 1)si 2)no");
            Respuesta=s.nextInt();
        }while (Respuesta == 1);

    }

}
