package practica1;

import java.util.Scanner;

public class tienda_con_descuentos {
    static void main() {
        Scanner s = new Scanner(System.in);
        final double ClienteN = 0.00;
        final double ClienteF = 0.10;
        final double ClienteVIP = 0.20;
        final double Montomas = 0.05;
        double Descuentodosmil,DESClienteF,DESClienteVIP,DESTotalf, DESTotalVIP,DEStotalmasf, DEStotalmasVIP ;
        String Nombre;
        final int MontoCompra, TipoCliente;
        System.out.println("|||||||| Ingresa tu Nombre |||||||");
        Nombre = s.nextLine();
        System.out.println("|||||||| Ingresa el Monto Total de la Compra |||||||");
        MontoCompra = s.nextInt();
        System.out.println("|||||||| Ingresa que tipo de Cliente Tienes  |||||||");
        System.out.println("1 Cliente Normal");
        System.out.println("2 Cliente Frecuente");
        System.out.println("3 Cliente VIP");
        TipoCliente = s.nextInt();
        Descuentodosmil = MontoCompra * Montomas;
        DESClienteF = MontoCompra * ClienteF;
        DESClienteVIP = MontoCompra *ClienteVIP;
        DESTotalf = Descuentodosmil + DESClienteF;
        DESTotalVIP = Descuentodosmil+ DESClienteVIP;
        DEStotalmasf = MontoCompra-DESTotalf;
        DEStotalmasVIP = MontoCompra-DESTotalVIP;

        if (TipoCliente == 1) {

            if (MontoCompra >= 2000) {
                System.out.println(Nombre + " con Tipo de  Cliente Normal");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");
                System.out.println((MontoCompra - Descuentodosmil) + " Es tu monto con descuento de 5% por una compra Mayor o Igual a 2000 ");

            } else {
                System.out.println(Nombre + " Con Tipo de Cliente Normal");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");


            }
        } else if (TipoCliente == 2) {

            if (MontoCompra >= 2000) {
                System.out.println(Nombre + " con Tipo de  Cliente Frecuente");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");
                System.out.println((MontoCompra - Descuentodosmil) + " Es tu monto con descuento de 5% por una compra Mayor o Igual a 2000 ");
                System.out.println((MontoCompra - DESTotalf) + " Es tu Monto Final con un decuento del 15% por ser Cliente Frecuente");

            } else {
                System.out.println(Nombre + " Con Tipo de Cliente Frecuente");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");
                System.out.println((MontoCompra - DESClienteF) + " Es tu monto con descuento de 10% por ser un Cliente Frecuente");


            }

        }else if (TipoCliente == 3) {
            if (MontoCompra >= 2000) {
                System.out.println(Nombre + " con Tipo de  Cliente VIP");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");
                System.out.println((MontoCompra - Descuentodosmil) + " Es tu monto con descuento de 5% por una compra Mayor o Igual a 2000 ");
                System.out.println(MontoCompra - DESTotalVIP + " Es tu Monto Final con un decuento del 25% por ser Cliente VIP");

            } else {
                System.out.println(Nombre + " Con Tipo de Cliente VIP");
                System.out.println(MontoCompra + " Es tu Monto de Compra sin Ningun Descuento ");
                System.out.println((MontoCompra - DESClienteVIP) + " Es tu monto con descuento de 20% por ser un Cliente VIP ");

            }
        }



    }
}
