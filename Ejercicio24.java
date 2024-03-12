import java.util.*;
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de pulgadas: ");
        double p = sc.nextDouble();
        double c = p * 2.54;
        System.out.println("La conversión a centímetros es: "+ c);
        sc.close();
    }
}
