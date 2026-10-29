package tema3;

import javax.swing.*;
import java.util.Scanner;

public class ConpeticiondeDistancia {
    static void main() {
        Scanner s = new Scanner(System.in);
        int op, Bajo=0,Medio=0,Alto=0,MejorParticipante=0;
        double Participantes=0,Mayordistancia=-1,PromedioGeneral=0,Distancia=0,TotalGeneral=0,TotalParticipante;
        do {
            System.out.println("Ingresa la Cantidad de Integrantea ");
            Participantes=s.nextInt();
            while (Participantes<0){
                System.out.println("ERROR en la Cantidad de Integrantes");
            }
            for (int i = 1; i <=Participantes ; i++) {
                System.out.println("Participantes" + i);
                TotalParticipante=0;
                for (int Ronda = 1; Ronda <= 5; Ronda++) {
                    System.out.println("Ingresa la distancia de la ronda " + Ronda + " EN Km");
                    Distancia = s.nextDouble();
                    while (Distancia < 0) {
                        System.out.println("ERROR la Distancia no Puede ser Negativa");
                    }
                    TotalParticipante = TotalParticipante + Distancia;
                    TotalGeneral = TotalGeneral + Distancia;
                    if (Distancia < 2) {
                        System.out.println("Rendimiento Bajo");
                        Bajo++;
                    } else if (Distancia <= 4) {
                        System.out.println("Rendimiento Medio");
                        Medio++;
                    } else if (Distancia > 4) {
                        System.out.println("Rendimiento Alto");
                        Alto++;
                    }
                }
                if (TotalParticipante > Mayordistancia) {
                    Mayordistancia = TotalParticipante;
                    MejorParticipante = i;
                }
            }
                    PromedioGeneral = TotalGeneral / Participantes;

                    System.out.println("  Menu de Resultados ");
                    System.out.println("1) Distancia total");
                    System.out.println("2) Promedio por participante");
                    System.out.println("3) Rondas por categoria");
                    System.out.println("4) Participante con mayor distancia");
                    System.out.println("5) Todas las estadisticas");
                    op = s.nextInt();
                    switch (op){
                        case 1:
                            System.out.println("Distancia Total " + TotalGeneral);
                            break;
                        case 2:
                            System.out.println("Promedio por participante "+(TotalGeneral / Participantes)+"Km");
                            break;
                        case 3:
                            System.out.println("Rondas ");
                            System.out.println("Ronda de Bajo Rendimiento "+ Bajo);
                            System.out.println("Ronda de Medio Rendimiento "+ Medio);
                            System.out.println("Ronda de Alto Rendimiento "+ Alto);
                            break;
                        case 4:
                            System.out.println("Participante con mayor distancia" + MejorParticipante);
                            System.out.println("Mayor Distancia " + Mayordistancia);
                            break;
                        case 5:
                            System.out.println("Distancia Total " + TotalGeneral);
                            System.out.println("Promedio por participante "+PromedioGeneral+"Km");

                            System.out.println("           Rondas               ");
                            System.out.println("Ronda de Bajo Rendimiento "+ Bajo);
                            System.out.println("Ronda de Medio Rendimiento "+ Medio);
                            System.out.println("Ronda de Alto Rendimiento "+ Alto);

                            System.out.println("Participantes con mayor distancia " + MejorParticipante);
                            System.out.println("Mayor Distancia " + Mayordistancia);


                            break;
                        default:
                            System.out.println("OPCION NO VALIDA ");
            }
            System.out.println("Quieres Ingresar Otros Corredores");
            System.out.println("1) SI ");
            System.out.println("2) NO ");
            op = s.nextInt();
        } while (op == 1);
        System.out.println(" Fin del Programa ");
        s.close();
    }
}
