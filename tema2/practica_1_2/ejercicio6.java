import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HORAS = 40;
        double salario, horast, salariot;
        String nombre;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el salario por hora: ");
        salario = sc.nextDouble();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        horast = sc.nextDouble();
        if (horast > HORAS) {
            salariot = (horast - HORAS) * (salario * 2) + (HORAS * salario);
            System.out.println("=====================================");
            System.out.println("Empleado: " + nombre);
            System.out.println("Horas normales :" + HORAS);
            System.out.println("Horas extras :" + (horast - HORAS));
            System.out.println("Salario total: " + salariot);
        } else {
            salariot = horast * salario;
            System.out.println("=====================================");
            System.out.println("Empleado: " + nombre);
            System.out.println("Horas normales :" + horast);
            System.out.println("Horas extras :0");
            System.out.println("Salario total: $" + salariot);
        }

    }
}
