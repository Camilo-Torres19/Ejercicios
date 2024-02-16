import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la base del triángulo: ");
        float base = leer.nextFloat();
        System.out.println("Ingrese la altura del triángulo: ");
        float altura = leer.nextFloat();
        float area =(base*altura)/2;
        System.out.println("el area del triángulo es : "+area);
        leer.close();
    }
}
