import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        int d1 = leer.nextInt();
        System.out.println("Ingrese el dividendo: ");
        int div = leer.nextInt();
        int r = (d1 % div);
        System.out.println("El resto de esta division es de "+r);
        leer.close();
    }
}
