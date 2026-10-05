package practica1;


import java.util.Scanner;

public class cajero_automatico {
    static void main() {
        Scanner s = new Scanner(System.in);
        int saldo;
        int Retiro;
        int restante;
        System.out.println("||||||ingresa tu saldo disponible ||||||");
        saldo = s.nextInt();
        System.out.println("|||||| ingresa tu monto a retira ||||||");
        Retiro = s.nextInt();
        restante = saldo - Retiro;
        if (Retiro < 5000) { ////inicio de transferencia
            System.out.println( "||||||" +restante + " Es tu Monto  Restante ||||||");
        } else if (restante > 5000) {/// si no se cumple
            System.out.println("|||||| Tu Retiro no es Posible Concretarse ||||||");

        }  if (restante > 500) {//////
            System.out.println(" |||||| Tu transaccion fue Exitosa |||||| ");
        } else if (restante < 500) {//// true or false
            System.out.println(" |||||| Tienes menos de 500 |||||| ");

        }

    }

}
