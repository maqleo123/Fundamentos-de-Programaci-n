import java.util.Scanner;

public class AreasDeFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("Area de Figuras Geométricas \n1. Cuadrado \n2. Rectangulo \n3. Triangulo \n4. Circulo");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("AREA DE UN CVUADRADO");
                System.out.println("ingresa la longitud de uno de sus lados: ");
                double l = scanner.nextDouble();
                area = Math.pow(l, 2);
                System.out.println("el area de el cuadrado es: " + area);
                break;
            case 2:
                System.out.println("AREA DE UN RECTANGULO");
                System.out.println("ingresa la longitude de su base: ");
                double b = scanner.nextDouble();
                System.out.println("ingresa la longitud de su altura: ");
                double h = scanner.nextDouble();
                area = b * h;
                System.out.println("el area de el rectangulo es: " + area);
                break;

            case 3:
                System.out.println("AREA DE UN TRIANGULO");
                System.out.println("ingresa la longitude de su base: ");
                double b1 = scanner.nextDouble();
                System.out.println("ingresa la longitud de su altura: ");
                double h2 = scanner.nextDouble();
                area = (b1 * h2) / 2;
                System.out.println("el area de el triangulo es: " + area);
                break;
            case 4:
                System.out.println("AREA DE UN Circulo");
                System.out.println("ingresa el radio de el circulo: ");
                double r = scanner.nextDouble();
                area = Math.PI * Math.pow(r, 2.0);
                System.out.println("el area de el cuadrado es: " + area);
                break;
            default:
                System.out.println("Error: Opcion no valida");

        }
    }

}
