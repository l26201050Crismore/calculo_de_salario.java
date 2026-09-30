import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class jubilacion {///Algoritmo

static void main() {
    Scanner s = new Scanner(System.in);
    final int Edad_Jubilacion = 65;
    final int Mayoria_de_Edad = 18;
    String Nombre;
    int Edad = 0;
    System.out.println("Escribe tu Nombre");
    Nombre = s.nextLine();
    System.out.println("Escribe tu Edad");
    Edad = s.nextInt();
    if (Edad >= Edad_Jubilacion) { /// SI EDAD ES <= 65.... true o false
        System.out.println(Nombre + "tiene " + Edad + "Años y eta listo para Jubilarse");
    } else if (Edad >= 18) ;{ /// INICIO else if
        System.out.println(Nombre + "Es mayor de edad");
    } /// fin else if
    { // si no
        System.out.println(Nombre + "tiene " + Edad +"Años y aun no se puede Jubilarse");
        System.out.println(" Le faltan " +(Edad_Jubilacion-Edad) + " Años para Jubilarse");
    }//fin si
}

}///Fin del algoritmo
