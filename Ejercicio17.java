import java.util.*;
public class Ejercicio17 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        if(n1 > n2){
            System.out.println("El "+n1+ " es mayor.");
        }else{
            System.out.println("El "+n2+" es mayor.");
        }
        sc.close();
    }
}
