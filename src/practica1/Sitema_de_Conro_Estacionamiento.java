package practica1;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Sitema_de_Conro_Estacionamiento {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int Carro= 20;
        final int Camioneta = 30;
        final int Moto = 10;
        final double Descuento10 = 0.10;
        final double Descuenro20 = 0.20;
        final int Horas ;
        double TipodeAUtomovil,  DescuCarro,  DescuMoto ,  DescuCamioneta;
        System.out.println( "||||||| Ingresa tus Horas de estadia |||||||" );
        Horas= s.nextInt();
        System.out.println("||||||| ingresa tu tupo de veiculo |||||||");
        System.out.println("||||||| 1 Auto |||||||");
        System.out.println("||||||| 2 Camion |||||||");
        System.out.println("||||||| 1 Moto |||||||");
        TipodeAUtomovil= s.nextInt();
        DescuCarro =Carro*Horas;
        DescuMoto = Moto*Horas;
        DescuCamioneta = Camioneta * Horas;
        if (Horas > 0) {
            if (TipodeAUtomovil == 1) {
                if (Horas >= 10) {
                    System.out.println(Carro + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Carro * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    System.out.println( DescuCarro * Descuenro20+ " Pesos  Es tu descuento del 20% por 10O o mas  h");
                    System.out.println( DescuCarro-(DescuCarro * Descuenro20 ) + " Pesos Es tu Precio a  Pago con Descuento del 20% ");
                } else if (Horas>= 5) {
                    System.out.println(Carro + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Carro * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    System.out.println( DescuCarro * Descuento10+ " Pesos  Es tu descuento del 10% por 5 o mas  h");
                    System.out.println( DescuCarro-(DescuCarro * Descuento10 ) + " Pesos Es tu Precio a  Pago con Descuento del 10% ");
                }else {
                    System.out.println(Carro + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Carro * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                }
            }else if (TipodeAUtomovil == 2) {
                if (Horas >= 10) {
                    System.out.println(Camioneta + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Camioneta * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    System.out.println(DescuCamioneta * Descuenro20 + " Pesos  Es tu descuento del 20% por 10 o mas  h");
                    System.out.println(DescuCamioneta - (DescuCamioneta * Descuenro20) + " Pesos Es tu Precio a  Pago con Descuento del 20% ");
                } else if (Horas >= 5) {
                    System.out.println(Camioneta + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Camioneta * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    System.out.println(DescuCamioneta * Descuento10 + " Pesos  Es tu descuento del 10% por  5 o mas h");
                    System.out.println(DescuCamioneta - (DescuCamioneta * Descuento10) + " Pesos Es tu Precio a  Pago con Descuento del 10% ");
                } else {
                    System.out.println(Camioneta + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Camioneta * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                }
            }else if (TipodeAUtomovil == 3){
                if (Horas >= 10) {
                    System.out.println(Moto + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Moto * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                    System.out.println( DescuMoto * Descuenro20+ " Pesos  Es tu descuento del 20% por  10 o mas  h");
                    System.out.println( DescuMoto-(DescuMoto * Descuenro20 ) + " Pesos Es tu Precio a  Pago con Descuento del 20% ");
                } else if (Horas>= 5) {
                System.out.println(Moto + " Pesos Es el Costo por H ");
                System.out.println(Horas + " Son las Horas de Estadia");
                System.out.println(Moto * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");
                System.out.println( DescuMoto * Descuento10+ " Pesos  Es tu descuento del 10% por 5 o mas  h");
                System.out.println( DescuMoto-(DescuMoto * Descuento10 ) + " Pesos Es tu Precio a  Pago con Descuento del 10% ");
                }else {
                    System.out.println(Moto + " Pesos Es el Costo por H ");
                    System.out.println(Horas + " Son las Horas de Estadia");
                    System.out.println(Moto * Horas + " Pesos Es tu Presio a Pagar Por tu Eatadia ");

                }

            }
        }
    }
}
