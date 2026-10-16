import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int auto = 0, moto = 0, camioneta = 0, opc = 0, autos = 0;
        double monto = 0, horas, montou = 0;

        do {
            System.out.println("===== Menu Estacionamiento =====");
            System.out.println(
                    "1)Automovil.....$20\n2)camioneta.....$30\n3)Motocicleta.....$10\n4)Resumen del dia\n5)salir");
            System.out.println("===========================");
            System.out.println("Ingrese una opcion");

            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("===========================");
                    System.out.println("Ingrese las horas que estara:");
                    horas = sc.nextDouble();

                    System.out.println("===========================");
                    System.out.println("Tipo de vehiculo: Automovil");
                    System.out.println("horas: " + horas);
                    monto = horas * 20;
                    System.out.println("Monto total: $" + monto);
                    System.out.println("===========================");
                    auto = auto + 1;
                    autos = autos + 1;
                    montou = montou + monto;
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("Ingrese las horas que estara:");
                    horas = sc.nextDouble();

                    System.out.println("===========================");
                    System.out.println("Tipo de vehiculo: Camioneta");
                    System.out.println("horas: " + horas);
                    monto = horas * 30;
                    System.out.println("Monto total: $" + monto);
                    System.out.println("===========================");
                    camioneta = camioneta + 1;
                    autos = autos + 1;
                    montou = montou + monto;
                    break;
                case 3:
                    System.out.println("===========================");
                    System.out.println("Ingrese las horas que estara:");
                    horas = sc.nextDouble();

                    System.out.println("===========================");
                    System.out.println("Tipo de vehiculo: Motocicleta");
                    System.out.println("horas: " + horas);
                    monto = horas * 10;
                    System.out.println("Monto total: $" + monto);
                    System.out.println("===========================");
                    moto = moto + 1;
                    autos = autos + 1;
                    montou = montou + monto;
                    break;
                case 4:
                    System.out.println("===========================");
                    System.out.println("Resumen del Dia");
                    System.out.println("vehiculos atendidos: " + autos);
                    System.out.println("Automoviles: " + auto);
                    System.out.println("Camionetas: " + camioneta);
                    System.out.println("Motocicletas: " + moto);
                    System.out.println("Total recaudado: $" + montou);
                    break;
                case 5:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida intene de nuevo...");
                    break;
            }
        } while (opc != 5);
    }

}
