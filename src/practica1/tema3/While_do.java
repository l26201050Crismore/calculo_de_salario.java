package tema3;

import java.util.Scanner;

public class While_do {
    static void main() {
        Scanner s = new Scanner(System.in);
        int Contador=6;
        do {//// Inicio de do--While

            System.out.println("Contdor= "+ Contador);
            Contador=Contador+1;
        }while(Contador<=5);// Fin del Do While
        System.out.println("Continua el Programa");
    }
}
