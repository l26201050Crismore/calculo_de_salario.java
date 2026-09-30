import java.util.Scanner;

public class aprobaste {///
    static void main() {
        Scanner s = new Scanner(System.in);
        String Nombre;
        double promedio;
        System.out.println("ingresa tu nombre");
        Nombre = s.nextLine();
        System.out.println("Ingresa tu calificasion final");
        promedio = s.nextDouble();
        if (promedio >= 70) {///  si promedio es <= 70 true o false
            System.out.println(Nombre + " has aprobado la ,materia");
        } else { /// si no
            System.out.println(Nombre + " has reprobado la materia");
            System.out.println();
        } // fin si
    }
} ////fin algoritmo
