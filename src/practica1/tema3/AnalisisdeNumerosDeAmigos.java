package tema3;

import javax.swing.*;
import java.util.Scanner;

public class AnalisisdeNumerosDeAmigos {
    static void main() {
        Scanner s = new Scanner(System.in);
        int N1=0,N2=0,op=0,N1Suma=0,N2Suma=0,Acumulado1=0,Acumulado2=0;
        do {
            System.out.println("Ingresa el Primer Numero Amigo");
            N1=s.nextInt();
            while (N1<0){
                System.out.println("ERROR En el Primer Numero Amigo");
            }
            System.out.println("Ingresa el Segundo Numero Amigo");
            N2=s.nextInt();
            while (N1<0){
                System.out.println("ERROR En el Primer Numero Amigo");
            }
            for (int i = 1; i <N1; i++) {
                if (N1 % i == 0) {
                    N1Suma = N1Suma + i;
                    Acumulado1++;
                }
            }
                for (int i = 1; i <N2; i++) {
                if (N2 % i==0){
                    N2Suma=N2Suma+i;
                    Acumulado2++;
                }
            }
            System.out.println("          Menu             ");
            System.out.println("   1) Suma de Los Divisores         ");
            System.out.println("   2) son Amigos o no son amigos    ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Suma de Divisores N1 " + N1 +":"+ N1Suma);
                    System.out.println("Cantidad de Divisores N1 "+ Acumulado1);
                    System.out.println("Suma de Divisores N2 " + N2 +":"+ N2Suma);
                    System.out.println("Cantidad de Divisores N2 "+ Acumulado2);
                    if (N1Suma==N2 && N2Suma==N1){
                        System.out.println("Son Amigos");
                    }else
                        System.out.println("No son Amigos");
                    break;
                case 2:
                    if (N1Suma==N2 && N2Suma==N1){
                        System.out.println("Son Amigos");
                    }else
                        System.out.println("No son Amigos");
                    break;

                default:
                    System.out.println("OPCION NO VALIDA ");
            }
            System.out.println("Quieres Ingresar otro Numero Amigo ");
            System.out.println("1) SI ");
            System.out.println("2) NO ");
            op = s.nextInt();
        } while (op == 1);
        System.out.println(" Fin del Programa");
        s.close();
    }
}

