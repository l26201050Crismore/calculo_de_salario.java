package Tema5.Voveda;
import java.util.Scanner;

public class Validador {
        public boolean validarRespuesta(int opcion, Scanner sc) {

            int respuesta;

            switch (opcion) {

                case 1:

                    System.out.print("Ingresa el siguiente número: ");

                    respuesta = leerEntero(sc);

                    return respuesta == 56;

                case 2:

                    System.out.print("Ingresa tu respuesta: ");

                    String numero = sc.nextLine().trim();

                    return numero.equalsIgnoreCase("72");

                case 3:

                    System.out.print("Edad actual del padre: ");

                    int padre = leerEntero(sc);

                    System.out.print("Edad actual del hijo: ");

                    int hijo = leerEntero(sc);

                    return padre == 36 && hijo == 12;

                case 4:

                    System.out.print("Ingresa el número de tres cifras: ");

                    respuesta = leerEntero(sc);

                    int centenas = respuesta / 100;
                    int decenas = (respuesta / 10) % 10;
                    int unidades = respuesta % 10;

                    return respuesta >= 100 &&
                            respuesta <= 999 &&
                            centenas == unidades * 2 &&
                            decenas == unidades + 3 &&
                            centenas + decenas + unidades == 15;

                case 5:

                    System.out.print("Cantidad de monedas de $5: ");

                    int monedas5 = leerEntero(sc);

                    System.out.print("Cantidad de monedas de $10: ");

                    int monedas10 = leerEntero(sc);

                    return monedas5 >= 0 &&
                            monedas10 >= 0 &&
                            monedas5 + monedas10 == 20 &&
                            monedas5 * 5 + monedas10 * 10 == 140;

                default:

                    return false;

            }

        }

        public int leerEntero(Scanner sc) {

            while (true) {

                try {

                    return Integer.parseInt(sc.nextLine());

                } catch (NumberFormatException e) {

                    System.out.print("Ingresa un número entero válido: ");

                }

            }

        }

    }

