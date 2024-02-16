import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Calcular el area de un circulo.");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("Ingrese el radio del circulo: ");
        int r = leer.nextInt();
        double a = (3.14 * (r * r));
        System.out.println("El area del circulo es de: "+ a);
        leer.close();
    }
}
