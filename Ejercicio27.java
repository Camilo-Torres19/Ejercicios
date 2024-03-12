import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, genero;

        System.out.println("Ingresa tu genero (Hombre/Mujer):");
        genero = leer.nextLine();
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        

        if (genero.equalsIgnoreCase("hombre")){
            System.out.println("Bienvenido "+ nombre);
        } else if (genero.equalsIgnoreCase("mujer")) {
            System.out.println("Bienvenida "+ nombre);
        } else {
            System.out.println("Hola Indeciso");
        }
        leer.close();

    }
}
