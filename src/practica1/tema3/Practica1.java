package tema3;

import java.util.Scanner;

public class Practica1 {
    static void main() {
        Scanner s = new Scanner(System.in);
        int edad = 0, CostoConsulta,op,CostoNiño,CostoAdolecente,CostoAdulto,CostoAdultoMyor, paciente=0;
        final double DescuentoadultoMayor= 0.15;
        double CostoUniNiño,CostoUniAdule,CostoUniAdul, CostoUniMayor, Mayor, pagototal;
        int Niño=0,Adulto=0,Adolesente=0,AdultoMayor=0 , pago1=0,pago2=0,pago3=0,pago4=0;
        int TotalNiño, TotalAdule,TotalAdulto, TotalMayor;
        while (edad >= 0 ){
            System.out.println("|||||| Centro Medico |||||");
            System.out.println("|||| Ingresa Tu Edad |||||");
            System.out.println("   1) Menor de 12 años    ");
            System.out.println("   2) 12 a 17 años        ");
            System.out.println("   3) 18 a 59 años        ");
            System.out.println("   4) 60 años o mas       ");
            System.out.println("   5) Resumen del Dia     ");
            op= s.nextInt();
            pagototal= pago1 +pago2 +pago3 +pago4;
            switch (op){
                case 1:
                    System.out.println( "Tu Edad es Menor de 12 años ");
                    System.out.println(" Por lo Tanto tu Consulta es de Niño ");
                    System.out.println(" Ingresa el Costo de tu Consulta ");
                    CostoNiño= s.nextInt();
                    pago1 = CostoNiño;
                    Niño ++ ;
                    break;

                case 2:
                    System.out.println( "Tu Edad es de 12 a 17 años ");
                    System.out.println(" Por lo Tanto tu Consulta es de Adolesente ");
                    System.out.println(" Ingresa el Costo de tu Consulta ");
                    CostoAdolecente= s.nextInt();
                    pago2 = CostoAdolecente;;
                    Adolesente ++;
                    break;
                case 3:
                    System.out.println( "Tu Edad es de 18 a 59 años ");
                    System.out.println(" Por lo Tanto tu Consulta es de Adulto");
                    System.out.println(" Ingresa el Costo de tu Consulta ");
                    CostoAdulto= s.nextInt();
                    pago3 = CostoAdulto; ;
                    Adulto ++;
                    break;
                case 4:
                    System.out.println( "Tu Edad es de 60 años o mas ");
                    System.out.println(" Por lo Tanto tu Consulta es de Adulto Mayor ");
                    System.out.println(" Ingresa el Costo de tu Consulta ");
                    CostoAdultoMyor= s.nextInt();
                    Mayor = CostoAdultoMyor * DescuentoadultoMayor;
                    System.out.println("Pago "+ CostoAdultoMyor);
                    System.out.println("descuento del 15% "+ Mayor);
                    System.out.println("Total a Pagar con Descuento " + ( CostoAdultoMyor - Mayor ));
                    pago4 = CostoAdultoMyor;
                    AdultoMayor ++;
                    break;
                case 5:
                    System.out.println("Total de Consultas de Niños "+ Niño);
                    System.out.println("Total de Consultas de Adolecente"+ Adolesente);
                    System.out.println("Total de Consultas de  Adulto "+ Adulto);
                    System.out.println("Total de Consultas de Adultos Mayores " + AdultoMayor);
                    System.out.println("Total de dinero de Consultas"+ pagototal );
                    break;



                default:
                    System.out.println("Opcion NO VALIDA");
                    break;


            }
            System.out.println("Deseas ingresar la Consulta de otra Pciente");
            System.out.println(" 1) SI ");
            System.out.println(" 2) NO ");
            op = s.nextInt();

        }
    }
}
