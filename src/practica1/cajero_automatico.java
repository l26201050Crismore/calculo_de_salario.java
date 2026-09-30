package practica1;


import java.util.Scanner;

public class cajero_automatico {
    static void main() {
        Scanner s = new Scanner(System.in);
        int saldo;
        int Retiro = 0;
        final int restante;
        System.out.println("ingresa tu saldo disponible");
        saldo = s.nextInt();
        System.out.println(" ingresa tu monto a retira");
        Retiro = s. nextInt();
        if ( Retiro < 5000) { ////inicio de transferencia
            System.out.println( saldo - Retiro + " es tu monto  restante " );
            restante = saldo- Retiro;
        }else if ( restante < 500) {//////
            System.out.println( "tienes menos de " + restante );
        }else if (Retiro > 5000){/// si no se cumple
            System.out.println("Tu retiro no es posible concretarse");
        } else if ( restante > 500) {//// true or false
                System.out.println("tu transaccion se pudo realizar");
        }


    }



}
