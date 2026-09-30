import java.util.Scanner;

public class Compra_de_Productos {
    static void main() {
        Scanner s = new Scanner(System.in);
        int Producto;
        int   presio_producto ;
        final int DESCUENTO= 1000;
        final double Descuento10= 0.10;
        final double Envio = 80 ;
        final int EnvioDes= 1500;
        double presio, subtotal,total, descuento;
        int Cantidad;
        double totaldescuento,envio,totalfinal;
        System.out.println("Ingresa el costo de tu producto");
        presio_producto= s.nextInt();
        System.out.println("Ingresa la Cantidad del Producto");
        Cantidad= s.nextInt();
       if(presio_producto* Cantidad > 1500 ){
           System.out.println("tu subtotal es "+ presio_producto* Cantidad);
           System.out.println("tu descuento es " + presio_producto*Cantidad *Descuento10);
           System.out.println("tu total con descuento es de " +(presio_producto* Cantidad-(presio_producto * Cantidad * Descuento10)));
           System.out.println("tu envio es  GRATIS " );
           System.out.println("Total Final"+ (presio_producto* Cantidad-presio_producto * Cantidad * Descuento10 ));
       }else if ( presio_producto * Cantidad < 1000 ){
            System.out.println("tu subtotal es "+ presio_producto* Cantidad);
            System.out.println("tu descuento es " + presio_producto*Cantidad *Descuento10);
            System.out.println("tu total con descuento es de " +(presio_producto* Cantidad-(presio_producto * Cantidad * Descuento10)));
            System.out.println("tu envio es de "+ Envio);
            System.out.println("Total Final"+ (presio_producto* Cantidad-presio_producto * Cantidad * Descuento10+ Envio));
       }

    }
}
