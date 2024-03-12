import java.util.Scanner;
public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int datoEntero;
        double datoReal;

        System.out.println("Ingresa dato Entero");
        datoEntero = leer.nextInt();

        System.out.println("Ingresa dato real");
        datoReal = leer.nextDouble();

        System.out.println("\nDato Entero: \n"+datoEntero);
        System.out.println("Dato Real: \n"+datoReal);
        leer.close();

    }
}
