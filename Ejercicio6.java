import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println(" Calcular la Media Aritmetica. ");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("Digite su primer dato: ");
        int a = leer.nextInt();
        System.out.println("Digite su segundo dato: ");
        int b = leer.nextInt();
        System.out.println("Digite su tercer dato: ");
        int c = leer.nextInt();
        int x =(a + b + c)/3;
        System.out.println("La media artimetica de los tres daots ingresado es : "+ x);
        leer.close();
    
    }
}
