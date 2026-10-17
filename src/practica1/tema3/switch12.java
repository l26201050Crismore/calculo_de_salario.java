package tema3;

import java.util.Scanner;

public class switch12 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int opcion =5;
        System.out.println("Elige un Numero del Uno al Siete");
        opcion =s.nextInt();
        switch (opcion){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;

            default:// i nicio caso defaul
                System.out.println("Elegiste una Opcion no Valida");
                break; /// fin del case defaul
        }
    }
}
