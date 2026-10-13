import java.util.Scanner;

public class sumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0, x, contador = 0;
        int bandera = 0;
        do {
            System.out.println("Ingrese el numero para sumar");
            x = sc.nextInt();
            acumulador = acumulador + x;
            contador++;
            System.out.println("Desea continuar sumando? \n(1 para continuar\n(0 para salir");
            bandera = sc.nextInt();
        } while (bandera == 1);
        System.out.println("La suma es: " + acumulador);
        System.out.println("se sumaron " + contador + " numeros");
    }
}
