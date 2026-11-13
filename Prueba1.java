package Tema5;
import java.util.Scanner;
public class Prueba1 {

        static Scanner sc = new Scanner(System.in);

        static final int MAX_RESTAURANTES = 20;
        static final int MAX_ASOCIACIONES = 20;
        static final int MAX_ALIMENTOS = 50;


        static String[] restaurantes = new String[MAX_RESTAURANTES];
        static String[] responsablesRest = new String[MAX_RESTAURANTES];
        static int totalRestaurantes = 0;


        static String[] asociaciones = new String[MAX_ASOCIACIONES];
        static String[] responsablesAC = new String[MAX_ASOCIACIONES];
        static int totalAsociaciones = 0;


        static String[] alimentos = new String[MAX_ALIMENTOS];
        static int[] restauranteOrigen = new int[MAX_ALIMENTOS];
        static double[] existencias = new double[MAX_ALIMENTOS];
        static int totalAlimentos = 0;


        static double[][] solicitudes = new double[MAX_ASOCIACIONES][MAX_ALIMENTOS];
        static double[][] distribuciones = new double[MAX_ASOCIACIONES][MAX_ALIMENTOS];

        public static void main(String[] args) {

            int opcion;

            do {
                System.out.print("Selecciona una opcion: ");
                System.out.println("\n===== RED SOLIDARIA =====");
                System.out.println("1. Registrar restaurante");
                System.out.println("2. Registrar asociacion civil");
                System.out.println("3. Registrar alimentos");
                System.out.println("4. Consultar restaurantes");
                System.out.println("5. Consultar asociaciones");
                System.out.println("6. Consultar alimentos");
                System.out.println("7. Registrar solicitud");
                System.out.println("8. Distribuir alimentos");
                System.out.println("9. Consultar distribuciones");
                System.out.println("10. Estadisticas generales");
                System.out.println("11. Salir");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        registrarRestaurante();
                        break;

                    case 2:
                        registrarAsociacion();
                        break;

                    case 3:
                        registrarAlimento();
                        break;

                    case 4:
                        consultarRestaurantes();
                        break;

                    case 5:
                        consultarAsociaciones();
                        break;

                    case 6:
                        consultarAlimentos();
                        break;

                    case 7:
                        registrarSolicitud();
                        break;

                    case 8:
                        distribuirAlimentos();
                        break;

                    case 9:
                        consultarDistribuciones();
                        break;

                    case 10:
                        mostrarEstadisticas();
                        break;

                    case 11:
                        System.out.println("Gracias por utilizar RED SOLIDARIA.");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                }

            } while (opcion != 11);

            sc.close();
        }

        static void registrarRestaurante() {

            if (totalRestaurantes < MAX_RESTAURANTES) {

                System.out.println("\n--- REGISTRAR RESTAURANTE ---");

                System.out.print("Nombre del restaurante: ");
                restaurantes[totalRestaurantes] = sc.nextLine();

                System.out.print("Nombre del responsable: ");
                responsablesRest[totalRestaurantes] = sc.nextLine();

                totalRestaurantes++;

                System.out.println("Restaurante registrado.");
            } else {
                System.out.println("Ya no se pueden registrar mas restaurantes.");
            }
        }

        static void registrarAsociacion() {

            if (totalAsociaciones < MAX_ASOCIACIONES) {

                System.out.println("\n--- REGISTRAR ASOCIACION ---");

                System.out.print("Nombre de la asociacion: ");
                asociaciones[totalAsociaciones] = sc.nextLine();

                System.out.print("Nombre del responsable: ");
                responsablesAC[totalAsociaciones] = sc.nextLine();

                totalAsociaciones++;

                System.out.println("Asociacion registrada.");
            } else {
                System.out.println("Ya no se pueden registrar mas asociaciones.");
            }
        }

        static void registrarAlimento() {

            if (totalRestaurantes == 0) {
                System.out.println("Primero registra un restaurante.");
                return;
            }

            if (totalAlimentos < MAX_ALIMENTOS) {

                consultarRestaurantes();

                System.out.print("Selecciona el ID del restaurante: ");
                int id = sc.nextInt();
                sc.nextLine();

                if (id >= 1 && id <= totalRestaurantes) {

                    System.out.print("Nombre del alimento: ");
                    alimentos[totalAlimentos] = sc.nextLine();

                    restauranteOrigen[totalAlimentos] = id - 1;

                    System.out.print("Cantidad disponible: ");
                    existencias[totalAlimentos] = sc.nextDouble();
                    sc.nextLine();

                    totalAlimentos++;

                    System.out.println("Alimento registrado.");
                } else {
                    System.out.println("ID de restaurante incorrecto.");
                }

            } else {
                System.out.println("Ya no se pueden registrar mas alimentos.");
            }
        }

        static void consultarRestaurantes() {

            System.out.println("\n--- RESTAURANTES ---");

            if (totalRestaurantes == 0) {
                System.out.println("No hay restaurantes registrados.");
            } else {

                for (int i = 0; i < totalRestaurantes; i++) {

                    System.out.println("ID: " + (i + 1));
                    System.out.println("Nombre: " + restaurantes[i]);
                    System.out.println("Responsable: " + responsablesRest[i]);
                }
            }
        }

        static void consultarAsociaciones() {

            System.out.println("\n--- ASOCIACIONES ---");

            if (totalAsociaciones == 0) {
                System.out.println("No hay asociaciones registradas.");
            } else {

                for (int i = 0; i < totalAsociaciones; i++) {

                    System.out.println("ID: " + (i + 1));
                    System.out.println("Asociacion: " + asociaciones[i]);
                    System.out.println("Responsable: " + responsablesAC[i]);
                }
            }
        }

        static void consultarAlimentos() {

            System.out.println("\n--- ALIMENTOS DISPONIBLES ---");

            if (totalAlimentos == 0) {
                System.out.println("No hay alimentos registrados.");
            } else {

                for (int i = 0; i < totalAlimentos; i++) {

                    System.out.println("ID: " + (i + 1));
                    System.out.println("Alimento: " + alimentos[i]);

                    System.out.println("Restaurante: " +
                            restaurantes[restauranteOrigen[i]]);

                    System.out.println("Existencias: " + existencias[i]);
                }
            }
        }

        static void registrarSolicitud() {

            if (totalAsociaciones == 0 || totalAlimentos == 0) {

                System.out.println("Primero registra asociaciones y alimentos.");

            } else {

                consultarAsociaciones();
                consultarAlimentos();

                System.out.print("ID de la asociacion: ");
                int idAC = sc.nextInt() - 1;

                System.out.print("ID del alimento: ");
                int idAlimento = sc.nextInt() - 1;

                if (idAC >= 0 && idAC < totalAsociaciones &&
                        idAlimento >= 0 && idAlimento < totalAlimentos) {

                    System.out.print("Cantidad que necesita: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();

                    if (cantidad > 0) {

                        solicitudes[idAC][idAlimento] =
                                solicitudes[idAC][idAlimento] + cantidad;

                        System.out.println("Solicitud registrada.");

                    } else {
                        System.out.println("Cantidad incorrecta.");
                    }

                } else {
                    System.out.println("ID incorrecto.");
                }
            }
        }

        static void distribuirAlimentos() {

            if (totalAsociaciones == 0 || totalAlimentos == 0) {

                System.out.println("No hay datos suficientes.");

            } else {

                consultarAsociaciones();
                consultarAlimentos();

                System.out.print("ID de la asociacion: ");
                int idAC = sc.nextInt() - 1;

                System.out.print("ID del alimento: ");
                int idAlimento = sc.nextInt() - 1;

                if (idAC >= 0 && idAC < totalAsociaciones &&
                        idAlimento >= 0 && idAlimento < totalAlimentos) {

                    double pendiente = solicitudes[idAC][idAlimento] -
                            distribuciones[idAC][idAlimento];

                    System.out.println("Cantidad pendiente: " + pendiente);
                    System.out.println("Existencias: " + existencias[idAlimento]);

                    if (pendiente > 0 && existencias[idAlimento] > 0) {

                        System.out.print("Cantidad que se va a entregar: ");
                        double cantidad = sc.nextDouble();
                        sc.nextLine();

                        if (cantidad > 0 && cantidad <= pendiente &&
                                cantidad <= existencias[idAlimento]) {

                            distribuciones[idAC][idAlimento] =
                                    distribuciones[idAC][idAlimento] + cantidad;

                            existencias[idAlimento] =
                                    existencias[idAlimento] - cantidad;

                            System.out.println("Distribucion realizada.");
                            System.out.println("Alimento: " + alimentos[idAlimento]);
                            System.out.println("Asociacion: " + asociaciones[idAC]);
                            System.out.println("Cantidad entregada: " + cantidad);
                            System.out.println("Existencia restante: " +
                                    existencias[idAlimento]);

                        } else {
                            System.out.println("Cantidad no disponible o mayor a la solicitada.");
                        }

                    } else {
                        System.out.println("No hay solicitudes pendientes o alimentos disponibles.");
                    }

                } else {
                    System.out.println("ID incorrecto.");
                }
            }
        }

        static void consultarDistribuciones() {

            System.out.println("\n--- DISTRIBUCIONES REALIZADAS ---");

            int hay = 0;

            for (int i = 0; i < totalAsociaciones; i++) {

                for (int j = 0; j < totalAlimentos; j++) {

                    if (distribuciones[i][j] > 0) {

                        System.out.println(asociaciones[i] + " recibio " +
                                distribuciones[i][j] + " de " + alimentos[j]);

                        hay = 1;
                    }
                }
            }

            if (hay == 0) {
                System.out.println("Todavia no hay distribuciones.");
            }
        }

        static void mostrarEstadisticas() {

            double totalDonado = 0;
            int alimentosDonados = 0;
            int asociacionesBeneficiadas = 0;

            System.out.println("\n--- ESTADISTICAS GENERALES ---");

            for (int i = 0; i < totalAsociaciones; i++) {

                int beneficiada = 0;

                for (int j = 0; j < totalAlimentos; j++) {

                    totalDonado = totalDonado + distribuciones[i][j];

                    if (distribuciones[i][j] > 0) {

                        alimentosDonados++;
                        beneficiada = 1;
                    }
                }

                if (beneficiada == 1) {
                    asociacionesBeneficiadas++;
                }
            }

            System.out.println("Restaurantes registrados: " + totalRestaurantes);
            System.out.println("Asociaciones registradas: " + totalAsociaciones);
            System.out.println("Tipos de alimentos registrados: " + totalAlimentos);
            System.out.println("Registros de alimentos donados: " + alimentosDonados);
            System.out.println("Asociaciones beneficiadas: " + asociacionesBeneficiadas);
            System.out.println("Total de unidades donadas: " + totalDonado);
        }
    }

