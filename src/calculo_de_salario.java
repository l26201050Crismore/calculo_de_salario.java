import java.util.Scanner;

public class calculo_de_salario {
    static void main() {
        Scanner s = new Scanner(System.in);
        final int SEMANA= 40;
        final int EXTRA2 = 2;
        int PAGOxHORA;
        double Semana,ESTRA2,SALARIO;
        String Nombre;
        int Horas;
        int HorasExt;
        System.out.println("Ingresa tu nombre");
        Nombre = s .nextLine();
        System.out.println("Horas trabajadas");
        Horas = s.nextInt();
        System.out.println("Pago por Hora");
        PAGOxHORA = s.nextInt();
        if (Horas <= SEMANA){
            Semana= Horas* PAGOxHORA;
            HorasExt= 0;
            ESTRA2 =0;
            SALARIO= Semana;

        } else  {
            HorasExt=Horas-SEMANA;
            Semana=SEMANA* PAGOxHORA;
            ESTRA2= HorasExt* PAGOxHORA * EXTRA2;
            SALARIO=Semana+ESTRA2;



        }
        System.out.println(Nombre );
        System.out.println("Horas trabajadas " + Horas);
        System.out.println("pago semanal "+ Semana);
        System.out.println("Horas Extras " + HorasExt);
        System.out.println("Pago por Horas Extras " + ESTRA2 );
        System.out.println("Salario Total " + SALARIO);
    }
    }