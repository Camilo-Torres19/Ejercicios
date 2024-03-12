import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nuemro a validar :");
        int n = leer.nextInt();
        if (n < 0) {
            System.out.println("El numero ingresado es Negativo");
            System.out.println(n);
        }else{
            System.out.println("El numero ingresado es Positivo");
            System.out.println(n);
        }
        leer.close();
    }
}
