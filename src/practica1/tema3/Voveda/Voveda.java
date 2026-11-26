package Tema5.Voveda;

public class Voveda {

        public String generarClave(boolean[] resultados) {

            String clave = "";

            for (int i = 0; i < resultados.length; i++) {

                if (resultados[i]) {

                    clave = clave + "1";

                } else {

                    clave = clave + "0";

                }

            }

            return clave;

        }

        public boolean verificarClave(String claveCorrecta, String intento) {

            return claveCorrecta.equals(intento);

        }

    }

