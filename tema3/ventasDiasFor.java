import java.util.Scanner;

public class ventasDiasFor {
    public static void main(String[] args) {
        int numeroDias, ventaDia, sumaVentas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de días: ");
        numeroDias = sc.nextInt();
        for (int i = 0; i < numeroDias; i++) {
            System.out.println("Ingrese la venta del día " + (i + 1) + ": ");
            ventaDia = sc.nextInt();
            sumaVentas += ventaDia;
        }
        System.out.println("La suma total de ventas es: " + sumaVentas);
        sc.close();
    }
}
