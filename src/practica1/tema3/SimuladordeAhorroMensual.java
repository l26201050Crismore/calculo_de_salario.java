package tema3;

import java.util.Scanner;

public class SimuladordeAhorroMensual {
    static void main() {
        Scanner s = new Scanner(System.in);
        int Dinero, op = 0, Meta,MetaMen;
        double Interes = 0.01,DineroInicial=0,Mes=0,Meses=0,InteresMes=0,DineroAcumuladoAlFinalDelMes=0;
        do {
            System.out.println("Ingresa tu Cantidad de Dinero ");
            DineroInicial = s.nextDouble();

            while (DineroInicial < 0) {
                System.out.println("Error Ingresa otra  Cantidad de Dinero ");
            }
            System.out.println("Ingresa tu Meta a Ahorrar");
            Meta=s.nextInt();
            while (DineroInicial<0){
                System.out.println("Error Ingresa otra Meta de Dinero ");
            }
            System.out.println("Ingresa tu Meta de Ahorrar Mensual");
            MetaMen=s.nextInt();
            while (DineroInicial<0){
                System.out.println("Error Ingresa otra Meta de Dinero Mensual");
            }

            System.out.println("  Simulacion de Ahorros  ");
            System.out.println("   1) 6 Mese      ");
            System.out.println("   2) 12 Mese     ");
            System.out.println("   3) 24 Mese     ");
            op = s.nextInt();
            DineroAcumuladoAlFinalDelMes=DineroInicial;
            switch (op) {
                case 1:
                    for (int Mes6 = 1; Mes < 6; Mes++) {
                        InteresMes = DineroAcumuladoAlFinalDelMes * Interes;
                        DineroAcumuladoAlFinalDelMes = DineroAcumuladoAlFinalDelMes + InteresMes + MetaMen;
                    }
                    System.out.println("Meses 6 = " + DineroAcumuladoAlFinalDelMes);
                    if (DineroAcumuladoAlFinalDelMes>= Meta)
                        System.out.println("Alcansate tu Meta");
                    break;
                case 2:
                    for (int Mes6= 1;Mes <12; Mes++) {
                        InteresMes=DineroAcumuladoAlFinalDelMes*Interes;
                        DineroAcumuladoAlFinalDelMes=DineroAcumuladoAlFinalDelMes+InteresMes+MetaMen;
                    }
                    System.out.println("Meses 12 = "+DineroAcumuladoAlFinalDelMes);
                    if (DineroAcumuladoAlFinalDelMes>= Meta)
                        System.out.println("Alcansate tu Meta");
                    break;

                case 3:
                    for (int Mes24= 1;Mes <24; Mes++) {
                        InteresMes=DineroAcumuladoAlFinalDelMes*Interes;
                        DineroAcumuladoAlFinalDelMes=DineroAcumuladoAlFinalDelMes+InteresMes+MetaMen;
                    }
                    System.out.println("Meses 24 = "+DineroAcumuladoAlFinalDelMes);
                    if (DineroAcumuladoAlFinalDelMes>= Meta)
                        System.out.println("Alcansate tu Meta");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA ");
            }

            System.out.println("Quieres Ingresar otra Cantidad de Dinero ");
            System.out.println("1) SI ");
            System.out.println("2) NO ");
            op = s.nextInt();
        } while (op == 1);
        System.out.println(" Fin del Programa");
    }

}
