package tema3;

import java.util.Scanner;

public class Cobro_de_estacionamiento {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int Carro = 20;
        final int Camioneta = 30;
        final int Moto = 10;
        int Horas = 0;
        int Monto=0;
        int Monto_universal, Respuesta;
        int TipodeAUtomovil, op, Monto1,Monto2,Monto3;
        while (Horas >=0) {
            System.out.println("||||||| ingresa tu tupo de veiculo |||||||");
            System.out.println("||||||| 1 Auto |||||||");
            System.out.println("||||||| 2 Camion |||||||");
            System.out.println("||||||| 3 Moto |||||||");
            System.out.println("|||| 4) Total del Dia |||");
            op = s.nextInt();
            System.out.println("||||||| Ingresa tus Horas de estadia |||||||");
            Horas = s.nextInt();
            Monto1 = Carro * Horas;
            Monto2 = Camioneta * Horas;
            Monto3 = Moto *Horas;
            Monto_universal = Monto1+Monto2+Monto3 ;

            switch (op) {
                case 1:
                    System.out.println("Tipo de veiculo = Carro ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Monto1 + " Pesos Es tu Presio a Pagar Por tu Eatadia ");

                    break;
                case 2:
                    System.out.println("Tipo de veiculo = Camioneta ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println( Monto2 + " Pesos Es tu Presio a Pagar Por tu Eatadia ");

                    break;
                case 3:
                    System.out.println("Tipo de veiculo = Moto ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Monto3+ " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    break;
                case 4:
                    System.out.println("total recaudado" + Monto_universal);
                default:
                    System.out.println("Opcion NO VALIDA");
                    break;
            }
            System.out.println("Deseas ingresar otro tiempo de estracionamiento");
            System.out.println(" 1) SI ");
            System.out.println(" 2) NO ");
            Respuesta = s.nextInt();

            }


    }

}






