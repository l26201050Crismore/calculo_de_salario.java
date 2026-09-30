import java.util.Scanner;
/*
* 23 de septiembre del 2026
* Practica de Programacion
* Tecnologico de Mexico
* Echo por :Cristian Manuel Cruz Guerrero
 */
public class Crear_constante_llamada {

    static void main() {
        final String nombre= "Tecnologico Nacional de Mexico";
        Scanner s= new Scanner(System.in);
        String Nombre;
        String Apellido;
        String Edad;
        String Carrera;
        String Semestre;
        String promedio;

        System.out.println("Escribe tu Nonbre");
        Nombre = s.nextLine();

        System.out.println("Escribe tu Apellido");
        Apellido = s.nextLine();

        System.out.println("Escribe tu Edad");
        Edad = s.nextLine();

        System.out.println("Escribe tu Carrera");
        Carrera = s.nextLine();

        System.out.println("Escribe tu Semestre");
        Semestre = s.nextLine();

        System.out.println("Escribe tu Promedio");
        promedio = s.nextLine();
    }
}
