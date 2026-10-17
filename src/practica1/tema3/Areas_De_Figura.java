package tema3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Areas_De_Figura {
    static void main() {
        Scanner s = new Scanner(System.in);
        double Base, Altura, Lado, Radio,A;
        int op,B,R;
        System.out.println("|||||||| Bienvenido a ||||||||");
        System.out.println("|||||||| Calculadora de Areas Geometricas ||||||||");
        System.out.println("|||||||| Selecciona Tu Figura Geometrica ||||||||");
        System.out.println("|||||||| 1) Cuadrado ||||||||");
        System.out.println("||||||| 2) Rectangulo |||||||");
        System.out.println("|||||||| 3) Triangulo ||||||||");
        System.out.println("||||||||| 4) Circulo |||||||||");
        op= s.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingresa la Longitud de tu Lado");
                A = s.nextInt();
                System.out.println("Tu Area ea " + (A * A));
                break;
            case 2:
                System.out.println("Ingresa la Base");
                A = s.nextInt();
                System.out.println("Ingresa la Altura ");
                B = s.nextInt();
                System.out.println("Tu Area ea " + (A * B));
                break;
            case 3:
                System.out.println("Ingresa la Base");
                A = s.nextInt();
                System.out.println("Ingresa la Altura ");
                B = s.nextInt();
                System.out.println("Tu Area ea " + (A * B) / 2);
                break;
            case 4:
                System.out.println("Ingresa Tu Radio" );
                R = s.nextInt();
                A = Math.PI * R * R;
                System.out.println("Tu Area ea "+ A);
                break;
            default:
                System.out.println("Opcion NO VALIDA");
                break;



        }
    }
}
