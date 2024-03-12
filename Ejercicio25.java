import java.util.*;
public class Ejercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los grados centigrados: ");
        double c = sc.nextDouble();
        double f = ((c* 9)/5) + 32;
        System.out.println("La cantidad de grados fahrenheit: "+ f);
        sc.close();
    }
}
