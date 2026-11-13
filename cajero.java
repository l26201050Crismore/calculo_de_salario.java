package Tema5;

import java.util.Scanner;

public class cajero {
    static void main() {
        Scanner s = new Scanner(System.in);
        String Nombre;
        double Saldo, Retiro, Saldorestante;
        System.out.println("°°°°°°°°°°°Bienvenido al Banco °°°°°°°°°°°°  ");
        System.out.println("             Ingresa tu Nombre ");
        Nombre = s.nextLine();
        System.out.println("          Ingres tu saldo disponoble ");
        Saldo = s.nextDouble();
        System.out.println("      Ingresa el monto que deseas retirar");
        Retiro = s.nextDouble();

        if (ValidarRetiro(Retiro, Saldo)) {
            Saldorestante = Saldoactual(Saldo, Retiro);
            System.out.println("°°°°°°°°°°°°°Comprovante°°°°°°°°°°°°°°°°°");
            System.out.println("Nombre = " + Nombre);
            System.out.println("Cntidad retirada $ = " + Retiro);
            System.out.println("Saldo restante $ = " + Saldorestante);
        } else {
            System.out.println("ERROR EL RETIRO NO ES VALIDO");
        }
    }

    public static boolean ValidarRetiro(double retiro, double saldo) {
        return (retiro > 0 && retiro <= saldo && retiro % 50 == 0);
    }

    public static double Saldoactual(double saldo, double retiro) {

        return (saldo - retiro);
    }

}


