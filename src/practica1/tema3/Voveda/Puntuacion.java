package Tema5.Voveda;

public class Puntuacion {
        private boolean[] resultados = new boolean[5];

        public void registrarAcierto(int desafio) {

            resultados[desafio - 1] = true;

        }

        public int calcularPuntuacion() {

            int puntos = 0;

            for (int i = 0; i < resultados.length; i++) {

                if (resultados[i]) {

                    puntos++;

                }

            }

            return puntos;

        }

        public boolean[] obtenerResultados() {

            return resultados;

        }

        public boolean todosResueltos() {

            for (int i = 0; i < resultados.length; i++) {

                if (!resultados[i]) {

                    return false;

                }

            }

            return true;

        }

        public void mostrarResultados() {

            System.out.println("\n==================================");
            System.out.println("          RESULTADOS FINALES");
            System.out.println("==================================");

            for (int i = 0; i < resultados.length; i++) {

                System.out.println("Desafío " + (i + 1) + ": " +
                        (resultados[i] ? "Resuelto" : "Pendiente"));

            }

            System.out.println("----------------------------------");
            System.out.println("Puntuación: " + calcularPuntuacion() + " / 5");

            if (calcularPuntuacion() == 5) {

                System.out.println("¡Felicidades! Has superado todos los desafíos.");

            } else {

                System.out.println("Todavía tienes desafíos pendientes.");

            }

            System.out.println("==================================");

        }

    }

