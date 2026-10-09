import java.util.Scanner;

public class diasDeLaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("ingresa el numero del dia:");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
