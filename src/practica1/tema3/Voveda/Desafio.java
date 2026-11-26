package Tema5.Voveda;

public class Desafio {
    public void PresentarDesafio(int opcion){


            switch (opcion) {

                case 1:

                    System.out.println("\nDESAFÍO 1: SECUENCIA NUMÉRICA");
                    System.out.println("Encuentra el siguiente número:");
                    System.out.println("2, 6, 12, 20, 30, 42, ___");

                    break;

                case 2:

                    System.out.println("\nDESAFÍO 2: EL NÚMERO OCULTO");
                    System.out.println("Encuentra un número entero que cumpla:");
                    System.out.println("- Mayor que 20 y menor que 100.");
                    System.out.println("- Divisible entre 4.");
                    System.out.println("- Al dividirlo entre 5 deja residuo 2.");
                    System.out.println("- La suma de sus dígitos es 9.");
                    System.out.println("Escribe NO EXISTE si consideras que no hay solución.");

                    break;

                case 3:

                    System.out.println("\nDESAFÍO 3: PROBLEMA DE EDADES");
                    System.out.println("Un padre tiene el triple de la edad de su hijo.");
                    System.out.println("Dentro de 12 años tendrá el doble.");
                    System.out.println("¿Cuáles son sus edades actuales?");

                    break;

                case 4:

                    System.out.println("\nDESAFÍO 4: EL TABLERO LÓGICO");
                    System.out.println("Encuentra un número de tres cifras:");
                    System.out.println("- Centenas: el doble de las unidades.");
                    System.out.println("- Decenas: 3 unidades mayor que las unidades.");
                    System.out.println("- La suma de las cifras es 15.");

                    break;

                case 5:

                    System.out.println("\nDESAFÍO 5: PROBLEMA DE LAS MONEDAS");
                    System.out.println("Una persona tiene 20 monedas.");
                    System.out.println("Algunas son de $5 y otras de $10.");
                    System.out.println("En total tiene $140.");
                    System.out.println("¿Cuántas monedas tiene de cada denominación?");

                    break;

            }

        }
    }

