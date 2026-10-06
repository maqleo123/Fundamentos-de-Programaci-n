package practica_06_10_2026;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double MINIMO_APROBATORIO = 70;
        final double MINIMO_UNIDAD = 60;

        double calificacion1;
        double calificacion2;
        double calificacion3;
        double promedio;

        System.out.print("Ingresa la calificacion de la unidad 1: ");
        calificacion1 = entrada.nextDouble();

        System.out.print("Ingresa la calificacion de la unidad 2: ");
        calificacion2 = entrada.nextDouble();

        System.out.print("Ingresa la calificacion de la unidad 3: ");
        calificacion3 = entrada.nextDouble();

        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("\nCalificacion unidad 1: " + calificacion1);
        System.out.println("Calificacion unidad 2: " + calificacion2);
        System.out.println("Calificacion unidad 3: " + calificacion3);
        System.out.println("Promedio: " + promedio);

        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Resultado: Aprobado");
        } else {
            System.out.println("Resultado: Reprobado");
        }

        if (calificacion1 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 1");
        }

        if (calificacion2 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 2");
        }

        if (calificacion3 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 3");
        }

        entrada.close();
    }
}