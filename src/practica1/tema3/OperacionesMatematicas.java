package tema3;

import java.util.Scanner;

public class OperacionesMatematicas {
    static void main() {
        Scanner s = new Scanner(System.in);
        int op ,A,B;
        System.out.println(" 1)  Suma") ;
        System.out.println(" 2)  Resta") ;
        System.out.println(" 3)  Muñltiplicasion") ;
        System.out.println(" 4)  Division") ;
        op =s.nextInt();
        System.out.println("Ingresas el Valor de A");
        A = s.nextInt();
        System.out.println("Ingresas el Valor de B");
        B = s.nextInt();
        switch (op){
            case 1:
                System.out.println("Resultado = "+ (A+B));
                break;
            case 2:
                System.out.println("Resultado = "+ (A-B));
                break;
            case 3:
                System.out.println("Resultado = "+ (A*B));
                break;
            case 4:
                if (B!=0){
                    System.out.println("Resultado = "+ (A/B));
                    break;
                }else{
                    System.out.println("No se Puede Dividir Entre 0");
                }
            default:
                System.out.println("Elegiste una Opcion no Valida");
                break;
        }
    }
}
