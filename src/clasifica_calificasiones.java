import java.util.Scanner;

public class clasifica_calificasiones {
    static void main() {
        Scanner s = new Scanner(System.in);
        int calificasion;
        System.out.println(" Ingresa uan calificasion de 0 100");
        calificasion = s.nextInt();
        if (calificasion >= 90) { /// SI EDAD ES >= 90.... true o false
            System.out.println(calificasion + "tu calificasion es exelente");
        } else if (calificasion > 80) {
            System.out.println(calificasion + "tu calificasion muy bien ");

        }else if (calificasion > 70) {
            System.out.println(calificasion + " tu calificasion es bien");

        }else if (calificasion > 60) {
            System.out.println(calificasion + "tu calificasion es suficiente ");

        }else if (calificasion< 59){
            System.out.println(calificasion+ " tu calificasion es reprobatoria ");
        }

    }

}
