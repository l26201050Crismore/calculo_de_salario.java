package tema3;

import java.util.Scanner;

public class Fasfood {
    static void main() {
        Scanner s = new Scanner(System.in);
        String op ;
        System.out.println("Seleciona Alogo del Menu ");
        System.out.println("A) Hambuergesa");
        System.out.println("B) Hot-dog");
        System.out.println("C) Pizza");
        op = s.nextLine();



        switch (op){
            case "A":
                System.out.println("Elegiste Hamburgesa");
                break;
            case "B":
                System.out.println("Elegiste Hod-dog");
                break;
            case "C":
                System.out.println("Elegiste Pizza");
                break;
            default:
                System.out.println("Elegiste una Opcion no Valida");
            break;
        }
    }
}
