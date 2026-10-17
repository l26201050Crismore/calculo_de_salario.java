package practica1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class gasolineria {
    static void main() {
        Scanner s = new Scanner(System.in);
        final double Descuento = 0.05;
        double TotaldeLitros = 0,TotaldeDescuento =0,TotaldeImporte = 0;
        int Recargar ,op, Sindecuento=0, Condescuento=0;
        double litros = 0, precio, Total, import2 = 0;
        double Litros, Totales = 0, inporte = 0, cobro = 0;
        while (litros >= 0) {
            System.out.println("Litros Cargados= ");
            litros = s.nextDouble();
            System.out.println("Presio por litros = ");
            precio = s.nextDouble();

            inporte = litros * precio;
            import2 = inporte * Descuento;
            TotaldeLitros += litros;
            TotaldeImporte += inporte;

            if (litros >= 40) {
                TotaldeDescuento += import2;
                System.out.println(" litros Cargados " + litros);
                System.out.println(" Presio por litro " + precio);
                System.out.println(" pagar " + inporte);
                System.out.println(" Descuento " + import2);
                System.out.println(" Total a pagar con descuento del 5 %  " + (inporte - import2));
                Condescuento++;
            } else {
                System.out.println(" litros Cargados " + litros);
                System.out.println(" Presio por litro " + precio);
                System.out.println(" pagar " + inporte);
                Sindecuento++;

            }

            System.out.println("total de Litros vendidos " + TotaldeLitros);
            System.out.println("Total de Importe sin descuento " + TotaldeImporte);
            System.out.println("Total de descuento del importe " + TotaldeDescuento);
            System.out.println("Total de importe con decuento " + (TotaldeImporte - TotaldeDescuento));
            System.out.println("Total de importes sin descuento "+ Sindecuento);
            System.out.println("Total de importes con descuento "+ Condescuento);
            System.out.println("Deseas ingresar mas recargas ");
            System.out.println(" 1) SI ");
            System.out.println(" 2) NO ");
            op = s.nextInt();


        }

    }
}
