package Tema5.Voveda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        menu menu = new menu();
        Desafio Desafio = new Desafio();
        Validador validador = new Validador();
        Puntuacion puntuacion = new Puntuacion();
        Voveda boveda = new Voveda();

        int opcion;

        do {

            opcion = menu.mostrarMenu();

            if (opcion >= 1 && opcion <= 5) {

                boolean correcto = false;

                while (!correcto) {

                    Desafio.PresentarDesafio(opcion);

                    correcto = validador.validarRespuesta(opcion, sc);

                    if (correcto) {

                        puntuacion.registrarAcierto(opcion);

                        System.out.println("\n¡Respuesta correcta!");

                    } else {

                        System.out.println("\nRespuesta incorrecta.");
                        System.out.println("Intenta nuevamente.\n");
                    }
                }

            } else if (opcion == 6) {

                puntuacion.mostrarResultados();

            } else if (opcion == 7) {

                if (puntuacion.todosResueltos()) {

                    String clave = boveda.generarClave(
                            puntuacion.obtenerResultados()
                    );

                    System.out.println("\nClave generada: " + clave);

                    System.out.print("Ingresa la clave para abrir la bóveda: ");

                    String intento = sc.nextLine();

                    if (boveda.verificarClave(clave, intento)) {

                        System.out.println("\n¡BÓVEDA ABIERTA!");

                    } else {

                        System.out.println("\nClave incorrecta. Acceso denegado.");

                    }

                } else {

                    System.out.println("\nDebes resolver los cinco desafíos primero.");

                }

            } else if (opcion == 8) {

                System.out.println("\nGracias por jugar. ¡Hasta pronto!");

            } else {

                System.out.println("\nOpción no válida.");

            }

        } while (opcion != 8);

        sc.close();

    }
}