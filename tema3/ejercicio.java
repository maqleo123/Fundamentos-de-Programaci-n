import java.util.Scanner;
import java.text.DecimalFormat;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int clientes, calificacion, satisfechos = 0, insatisfechos = 0, calificacionMaxima = 0, bandera = 0;
        double suma = 0;

        do {
            System.out.println("Ingrese la cantidad de clientes que participarán en la encuesta: ");
            clientes = sc.nextInt();
            while (clientes <= 0) {
                System.out.println("Ingrese un número entero mayor que cero");
                clientes = sc.nextInt();
            }

            for (int i = 1; i <= clientes; i++) {
                System.out.println("Ingrese la calificación del cliente " + i + ": ");
                calificacion = sc.nextInt();
                while (calificacion < 1 || calificacion > 10) {
                    System.out.println(
                            "Calificacion no valida fuera de rango (1-10) intente de nuevo para el cliente " + i);
                    calificacion = sc.nextInt();
                }
                suma += calificacion;
                if (calificacion >= 7) {
                    satisfechos++;
                } else {
                    insatisfechos++;
                }
                if (calificacion > calificacionMaxima) {
                    calificacionMaxima = calificacion;
                }
            }

            double promedio = suma / clientes;
            String evaluacion;
            if (promedio >= 8) {
                evaluacion = "Excelente servicio";
            } else if (promedio >= 6) {
                evaluacion = "Servicio aceptable";
            } else {
                evaluacion = "Se requiere mejorar el servicio";
            }
            System.out.println("========= Reporte de la encuesta =========");
            System.out.println("clientes encuestados: " + clientes);
            System.out.println("suma de las calificaciones: " + suma);
            System.out.println("promedio general: " + df.format(promedio));
            System.out.println("clientes satisfechos: " + satisfechos);
            System.out.println("clientes insatisfechos: " + insatisfechos);
            System.out.println("calificacion mas alta: " + calificacionMaxima);
            System.out.println("evaluacion general del servicio: " + evaluacion);
            System.out.println("===========================================");

            System.out.println("\n\n\ndesea realizar otra encuesta? (1=si, 0=no)");
            bandera = sc.nextInt();
        } while (bandera == 1);

        sc.close();
    }
}
