package tema3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numEnteroDesdeel1 {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int positivo = 0;
        int N, op;
        int SumaDeDivisionCuatro = 0, SumaDeDivisionTres = 0, SumaDeDivisionEntreAmbos = 0, Division4 = 0, Divison3 = 0, DivisionAmbos = 0, Pares = 0, Impares = 0, Multipos5 = 0;
        do {
            do {
                System.out.println("Ingresa un numero positivo");
                N = s.nextInt();
            } while (N <= positivo);
            for (int i = 1; i <= N; i++) {
                if (i % 4 == 0) {
                    Division4 = Division4 + i;
                    SumaDeDivisionCuatro++;
                }
                if (i % 3 == 0) {
                    Divison3 = Divison3 + i;
                    SumaDeDivisionTres++;
                }
                if (i % 3 == 0 && i % 4 == 0) {
                    DivisionAmbos = DivisionAmbos + i;
                    SumaDeDivisionEntreAmbos++;
                }

                if (i % 2 == 0) {
                    Pares++;
                } else {
                    Impares++;
                }

                if (i % 5 == 0) {
                    Multipos5++;
                }
            }
            System.out.println("               Respuestas                            ");
            System.out.println("Los Numeros Divisibles Entre 4 = " + SumaDeDivisionCuatro);
            System.out.println("Suma Numeros Divisibles Entre 4 = " + Division4);
            System.out.println("Los Numeros Múltiplos de 3 = " + SumaDeDivisionTres);
            System.out.println("Suma Numeros Divisibles Entre 3 = " + Divison3);
            System.out.println("Los Numeros Divisibles Entre ambos = " + SumaDeDivisionEntreAmbos);

            System.out.println("          Menu");
            System.out.println("   1) Números Pares        ");
            System.out.println("   2) Numeros Impares      ");
            System.out.println("   3) Multiplos de 5       ");
            op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Numeros Pares " + Pares);
                    break;
                case 2:
                    System.out.println("Numeros Pares " + Impares);
                    break;
                case 3:
                    System.out.println("Multiplos entre 5" + Multipos5);
                    break;
                default:
                    System.out.println("OPCION NO VALIDA ");
            }
            System.out.println("Quieres Ingresar un Numero Positivo ");
            System.out.println("1) SI ");
            System.out.println("2) NO ");
            op = s.nextInt();
        } while (op == 1);
        System.out.println(" Fin del Programa ");
        s.close();
    }
}
