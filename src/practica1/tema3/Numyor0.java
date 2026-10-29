package tema3;

import java.util.Scanner;

public class Numyor0 {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int minimo=1;
        int N;
        int SumaPares = 0, SumaImpares = 0, ContadorPares = 0, ContadorImpares = 0;
        do {
            System.out.println("Ingresa un numero positivo");
            N = s.nextInt();
        }while (N <minimo);
            for (int i = 1; i <= N; i++) {
                if (N % 2 == 0) {
                    SumaPares = SumaPares + i;
                    ContadorPares++;
                } else {
                    SumaImpares = SumaImpares + i;
                    ContadorImpares++;
                }
            }

            System.out.println("Suma de pares: " + SumaPares);
            System.out.println("Cantidad de pares: " + ContadorPares);
            System.out.println("Suma de impares: " + SumaImpares);
            System.out.println("Cantidad de impares: " + ContadorImpares);


        System.out.println("                  Menu                       ");



    }
}