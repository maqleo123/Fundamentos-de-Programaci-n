import java.util.Scanner;

public class FastFoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        System.out.println("Menu de opciones \n a) hamburguesa \n b)Hot-Dog \n c)Pizza");
        op = sc.nextLine().toLowerCase();

        switch (op) {
            case "a":
                System.out.println("Elegiste una hamburguesa");
                break;
            case "b":
                System.out.println("Elegiste un Hot-Dog");
                break;
            case "c":
                System.out.println("Elegiste una Pizza");
                break;
            default:
                System.out.println("opcion no valida");
        }
    }
}
