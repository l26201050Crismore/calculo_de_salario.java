package Tema5;

import java.util.Scanner;
import java.util.Random;
public class curp {
    static void main() {
        Scanner s = new Scanner(System.in);
        String Nombre,Sexo,ApMaterno,ApPaterno,FechaNacimiento,LugarNacimiento,CURP,GenerarCURP;
        System.out.println("||||||| Formulario para sacar la CURP ||||||||");

        System.out.println("               Ingresa tu Nombre               ");
        Nombre=s.nextLine();
        System.out.println("         Ingrsa tu Apellido Paterno           ");
        ApMaterno=s.nextLine();
        System.out.println("         Ingrsa tu Apellido Materno           ");
        ApPaterno=s.nextLine();
        System.out.println("   Ingrsa tu Fecha de nacimiento da/mes/año   ");
        FechaNacimiento=s.nextLine();
        System.out.println("              Ingrsa tu sexo H/M              ");
        Sexo=s.nextLine();
        System.out.println("         Ingrsa tu Entidad Federativa         ");
        LugarNacimiento=s.nextLine();
        GenerarCURP= generarCURP(Nombre, ApPaterno, ApMaterno, FechaNacimiento, Sexo,LugarNacimiento);
        System.out.println("||||||||||| CURP = " + GenerarCURP +"|||||||||");
    }

    public static String obtenerPrimeraLetra(String palabra) {
        return palabra.substring(0, 1);
    }

    public static String obtenerPrimeraVocal(String palabra) {

        for (int i = 1; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' ||
                    letra == 'o' || letra == 'u') {
                return String.valueOf(letra);
            }
        }

        return "x";
    }

    public static String obtenerPrimeraConsonante(String palabra) {

        for (int i = 1; i < palabra.length(); i++) {

            char letra = palabra.charAt(i);

            if (letra >= 'a' && letra <= 'z' &&
                    letra != 'a' && letra != 'e' && letra != 'i' &&
                    letra != 'o' && letra != 'u') {
                return String.valueOf(letra);
            }
        }

        return "x";
    }

    public static String obtenerFecha(String fecha) {

        String anio = fecha.substring(8, 10);
        String mes = fecha.substring(3, 5);
        String dia = fecha.substring(0, 2);

        return anio + mes + dia;
    }

    public static String obtenerClaveEstado(String estado) {

        switch (estado) {

            case "Aguascalientes": return "AS";
            case "Baja California": return "BC";
            case "Baja California Sur": return "BS";
            case "Campeche": return "CC";
            case "Coahuila": return "CL";
            case "Colima": return "CM";
            case "Chiapas": return "CS";
            case "Chihuahua": return "CH";
            case "Ciudad de Mexico": return "DF";
            case "Durango": return "DG";
            case "Guanajuato": return "GT";
            case "Guerrero": return "GR";
            case "Hidalgo": return "HG";
            case "Jalisco": return "JC";
            case "Mexico": return "MC";
            case "Michoacan": return "MN";
            case "Morelos": return "MS";
            case "Nayarit": return "NT";
            case "Nuevo Leon": return "NL";
            case "Oaxaca": return "OC";
            case "Puebla": return "PL";
            case "Queretaro": return "QT";
            case "Quintana Roo": return "QR";
            case "San Luis Potosi": return "SP";
            case "Sinaloa": return "SL";
            case "Sonora": return "SR";
            case "Tabasco": return "TC";
            case "Tamaulipas": return "TS";
            case "Tlaxcala": return "TL";
            case "Veracruz": return "VZ";
            case "Yucatan": return "YN";
            case "Zacatecas": return "ZS";

            default: return "NE";
        }
    }

    public static String generarCURP(String Nombre, String ApPaterno,
                                     String ApMaterno, String FechaNacimiento, String Sexo,
                                     String LugarNacimiento) {

        String primerNombre = Nombre.split(" ")[0];

        String CURP = obtenerPrimeraLetra(ApPaterno);
        CURP += obtenerPrimeraVocal(ApPaterno);
        CURP += obtenerPrimeraLetra(ApMaterno);
        CURP += obtenerPrimeraLetra(primerNombre);

        CURP += obtenerFecha(FechaNacimiento);
        CURP += Sexo;

        CURP += obtenerClaveEstado(LugarNacimiento);

        CURP += obtenerPrimeraConsonante(ApPaterno);
        CURP += obtenerPrimeraConsonante(ApMaterno);
        CURP += obtenerPrimeraConsonante(primerNombre);

        Random r = new Random();

        CURP += (char) (r.nextInt(26) + 65);
        CURP += (char) (r.nextInt(10) + 48);


        return CURP;
    }
}
