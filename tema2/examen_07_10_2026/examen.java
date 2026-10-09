package tema2.examen_07_10_2026;

import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("ingresa el peso de tu equipaje: ");
        double peso = sc.nextDouble();

        if (peso <= 15) {
            System.out.println("===============================");
            System.out.println("Hola " + nombre);
            System.out.println("Su equipaje esta dentro del rango permitido");
            System.out.println("No se aplicaran cargos adicionales");
            System.out.println("Que tenga un buen viaje :)");
            System.out.println("===============================");

        } else if (peso > 15 && peso <= 20) {
            System.out.println("===============================");
            System.out.println("Hola " + nombre);
            System.out.println("Su equipaje es de tipo ligero");
            System.out.println("Se aplicara un cargo de $150");
            System.out.println("Que tenga un buen viaje :)");
            System.out.println("===============================");
        } else if (peso > 20 && peso <= 30) {
            System.out.println("===============================");
            System.out.println("Hola " + nombre);
            System.out.println("Su equipaje es de tipo Medio");
            System.out.println("Se aplicara un cargo de $300");
            System.out.println("Que tenga un buen viaje :)");
            System.out.println("===============================");
        } else if (peso > 30) {
            System.out.println("===============================");
            System.out.println("Hola " + nombre);
            System.out.println("Su equipaje es de tipo pesado");
            System.out.println("Su equipaje supera el rango permitido");
            System.out.println("Se aplicara un cargo de $500");
            System.out.println("Que tenga un buen viaje :)");
            System.out.println("===============================");

        }

    }

}
