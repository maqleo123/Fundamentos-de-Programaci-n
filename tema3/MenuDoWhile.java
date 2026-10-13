public class MenuDoWhile {
    public static void main(String[] args) {
        int opc = 0, n1 = 0, n2 = 0;
        do {
            System.out.println("======= Seleccione una opción =======");
            System.out.println(" 1)suma \n 2)resta \n 3)multiplicación \n 4)división \n 5)salir");
            System.out.println("======================================");
            opc = new java.util.Scanner(System.in).nextInt();
            System.out.println("======================================");
            if (opc != 5) {
                System.out.println("ingresa n1: ");
                n1 = new java.util.Scanner(System.in).nextInt();
                System.out.println("ingresa n2: ");
                n2 = new java.util.Scanner(System.in).nextInt();
                System.out.println("======================================");
            }

            switch (opc) {
                case 1:
                    System.out.println("Has seleccionado la opción de suma");
                    System.out.println("El resultado es: " + (n1 + n2));
                    System.out.println("======================================");

                    break;
                case 2:
                    System.out.println("Has seleccionado la opción de resta");
                    System.out.println("El resultado es: " + (n1 - n2));
                    System.out.println("======================================");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opción de multiplicación");
                    System.out.println("El resultado es: " + (n1 * n2));
                    System.out.println("======================================");
                    break;
                case 4:
                    System.out.println("Has seleccionado la opción de división");
                    if (n2 != 0) {
                        System.out.println("El resultado es: " + (n1 / n2));
                        System.out.println("======================================");
                    } else {
                        System.out.println("No se puede dividir entre 0");
                        System.out.println("======================================");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa........");
                    System.out.println("======================================");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opc != 5);
    }
}
