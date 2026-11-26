package Tema5.Voveda;
import java.util.Scanner;

public class menu {
        Scanner sc = new Scanner(System.in);

        public int mostrarMenu() {

            System.out.println("\n==================================");
            System.out.println("       EL DESAFÍO DE LA BÓVEDA");
            System.out.println("==================================");

            System.out.println("1. Secuencia numérica");
            System.out.println("2. El número oculto");
            System.out.println("3. Problema de edades");
            System.out.println("4. El tablero lógico");
            System.out.println("5. Problema de las monedas");
            System.out.println("6. Mostrar resultados");
            System.out.println("7. Generar clave de acceso");
            System.out.println("8. Salir");

            System.out.print("\nSelecciona una opción: ");

            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                return 0;
            }

        }

}
