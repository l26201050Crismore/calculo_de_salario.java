package practica1;

import java.util.Scanner;

public class sistema_de_calificasion {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int Minimo_aprovatorio = 70;
        final int Minimo_unidad = 60;
        double a, b, c, d;//// d = a+b+c/3
        System.out.println("||||||| Ingresa tu Calificasion del Parcial A |||||||");
        a = s.nextDouble();
        System.out.println("||||||| Ingresa tu Calificasion del Parcial B |||||||");
        b = s.nextDouble();
        System.out.println("||||||| Ingresa tu Calificasion del Parcial C |||||||");
        c = s.nextDouble();
        d = (a + b + c) / 3;

        if (a < Minimo_unidad) {
            System.out.println("|||||| Tienes que recupera el Parcial A " + a + " |||||||||");
        } else if (b < Minimo_unidad) {
            System.out.println("|||||| Tienes que recupera el Parcial B " + b + " |||||||||");
        } else if (c < Minimo_unidad) {
            System.out.println("|||||| Tienes que recupera el Parcial C 5" + c + " |||||||||");
        }

        if (d > Minimo_aprovatorio) {
            System.out.println("|||||| Tu calificasion del Parcial A es  " + a + "||||||");
            System.out.println("|||||| Tu calificasion del Parcial b es " + b + "||||||");
            System.out.println("|||||| Tu calificasion del Parcial C es " + c + "||||||");
            System.out.println("|||||| " + d + " Tu Calificasion Fina ||||||| ");

        } else if (d < Minimo_aprovatorio){
            System.out.println(" reprobado");


        }
    }

}
