package Tema5;

import java.util.Scanner;

public class Metodos {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            int op;

            do {
                System.out.println("Selecciona una opción");
                System.out.println("1) Cuadrado");
                System.out.println("2) Triángulo");
                System.out.println("3) Círculo");
                System.out.println("4) Rectángulo");
                System.out.println("5) Salir");

                op = scanner.nextInt();

                switch (op) {

                    case 1:
                        System.out.println("Área = " + cuadrado());
                        break;

                    case 2:
                        System.out.println("Área = " + triangulo());
                        break;

                    case 3:
                        System.out.println("Área = " + circulo());
                        break;

                    case 4:
                        System.out.println("Área = " + rectangulo());
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (op != 5);
        }

        public static double cuadrado() {
            double l = 0;

            System.out.println("Ingresa el valor de un lado");
            l = scanner.nextDouble();

            return (l * l);
        }

        public static double triangulo() {
            double base = 0;
            double altura = 0;

            System.out.println("Ingresa la base");
            base = scanner.nextDouble();

            System.out.println("Ingresa la altura");
            altura = scanner.nextDouble();

            return (base * altura / 2);
        }

        public static double circulo() {
            double radio = 0;

            System.out.println("Ingresa el radio");
            radio = scanner.nextDouble();

            return (Math.PI * radio * radio);
        }

        public static double rectangulo() {
            double base = 0;
            double altura = 0;

            System.out.println("Ingresa la base");
            base = scanner.nextDouble();

            System.out.println("Ingresa la altura");
            altura = scanner.nextDouble();

            return (base * altura);
        }


}

