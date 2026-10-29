package tema3;

import java.util.Scanner;

public class OPMate {
    static void main() {
        Scanner s = new Scanner(System.in);
        int OP=0,N=0,Suma=0;
        do {
            System.out.println("                 Operaciones Matematicas ");
            System.out.println("   1) calcular el cuadrado de un número   ");
            System.out.println("   2) calcular el cubo de un número     ");
            System.out.println("   3) determinar si un número es par o impar    ");
            System.out.println("   4) calcular la suma de los números desde 1 hasta un número ingresado");
            System.out.println("   5) salir del programa                            ");
            OP=s.nextInt();
            switch (OP){
                case 1:
                    System.out.println(" Ingresa un número ");
                    N=s.nextInt();
                    if (N>0){
                        System.out.println("EL Cuadrado de Tu Numero = "+(N*N));
                    }else if (N<0)
                        System.out.println("ERROR Tu Numero no es Positivo ");
                    break;
                case 2:
                    System.out.println(" Ingresa un número ");
                    N=s.nextInt();
                    if (N>0){
                        System.out.println("EL Cubo de Tu Numero = "+(N*N*N));
                    }else if (N<0)
                        System.out.println("ERROR Tu Numero no es Positivo ");
                    break;
                case 3:
                    System.out.println(" Ingresa un número ");
                    N=s.nextInt();
                    if (N>0) {
                        if (N % 2 == 0) {
                            System.out.println("Tu Numero es Par = " + N) ;
                        } else
                            System.out.println("Tu Numero es Impar  "+N);
                    }else
                        System.out.println("ERROR Tu Numero no es Positivo ");
                    break;
                case 4:
                    System.out.println(" Ingresa un número ");
                    N=s.nextInt();
                    if (N>0) {
                        for (int i = 1; i <= N; i++) {
                            Suma = Suma + i;
                        }
                        System.out.println("La Suma es = "+Suma);
                    }else if (N<0){
                        System.out.println("ERROR Tu Numero no es Positivo ");
                    }
                    break;
                case 5:
                    System.out.println(" Fin del Programa ");


            }
        }while (OP!=5);

    }
}
