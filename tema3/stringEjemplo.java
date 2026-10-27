public class stringEjemplo {
    public static void main(String[] args) {

        String texto = "Hola mundo";
        System.out.println("length() -> " + texto.length());
        System.out.println("toUpperCase() -> " + texto.toUpperCase());
        System.out.println("toLowerCase() -> " + texto.toLowerCase());
        System.out.println("contains('Mundo') -> " + texto.contains("Mundo"));
        System.out.println("equals('Hola mundo') -> " + texto.equals("Hola mundo"));
        System.out.println("equalsIgnoreCase('hola mundo') -> " + texto.equalsIgnoreCase("hola mundo"));
        System.out.println("substring(0,4) -> " + texto.substring(0, 4));
        System.out.println("charAt(0) -> " + texto.charAt(0));
        System.out.println("replace() -> " + texto.replace("mundo", "java"));
        String nombre = "        leo               ";
        System.out.println("trim() -> " + nombre.trim());
        String palabra = "hola";
        System.out.println("isEmpty() -> " + palabra.isEmpty());

    }
}