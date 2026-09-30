import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double ENVIO = 80.0;
        double precio, monto;
        int cantidad;
        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();
        System.out.print("Ingrese la cantidad de productos: ");
        cantidad = sc.nextInt();
        double total = precio * cantidad;

        if (total >= 1000) {
            monto = total - (total * .10);
            System.out.println("================================");
            System.out.println("Subtotal: $" + total);
            System.out.println("Descuento: $" + (total * .10));
            System.out.println("Total con descuento: $" + monto);
            if (monto >= 1500) {
                System.out.println("Envio: $0");
                System.out.println("Total final: $" + monto);
            } else {
                System.out.println("Envio: $80");
                System.out.println("Total final: $" + (monto + ENVIO));
            }
        } else {
            System.out.println("================================");
            System.out.println("Subtotal: $" + total);
            System.out.println("Descuento: $0");
            System.out.println("Total con descuento: $" + total);
            System.out.println("Envio: $80");
            System.out.println("Total final: $" + (total + ENVIO));

        }

    }
}