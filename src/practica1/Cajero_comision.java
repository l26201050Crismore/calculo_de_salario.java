package practica1;

import java.util.Scanner;

public class Cajero_comision {
    static void main() {
        Scanner s = new Scanner(System.in);
        int saldo;
        int Retiro;
        int restante, Cantretiro;
        final int Comision= 10;
        final int Limite_Retiro= 5000;

        System.out.println("||||||ingresa tu saldo disponible ||||||");
        saldo = s.nextInt();
        System.out.println("|||||| ingresa tu monto a retira ||||||");
        Retiro = s.nextInt();
        restante = saldo - Retiro;
        if (Retiro>0) {
            if (Retiro < Limite_Retiro) {
                if (Retiro + Comision < saldo) {
                    System.out.println( Retiro  + " Es tu Retiro ||||||");
                    System.out.println(Comision+ " Es tu Comision Bancaria ||||||");
                    System.out.println( Retiro + Comision  + " Es tu Retiro con Comision ||||||");
                    System.out.println(restante-Comision + " Este es tu Restante ||||||");
                } else if (Retiro + Comision > saldo) {
                    System.out.println("|||||| Tu transaccion no se puede realizar ||||||");
                    System.out.println("|||||| Tu Saldo es Insuficiente ||||||");
                }
            } else if (Retiro > Limite_Retiro) {
                System.out.println("|||||| Tu transaccion no se puede realizar ||||||");
                System.out.println("|||||| Tu Retiro Exede la Cantidad Maxima por Dia ||||||");
            }


        } else if (Retiro<0){
            System.out.println(" Tu transaccion no se puede realizar ");

        }
    }
}
