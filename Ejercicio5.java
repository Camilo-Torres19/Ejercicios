import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Calcular el area de un Rombo.");
        System.out.println("*******************************");
        System.out.println("");
        System.out.println("Ingrese el diametro mayor: ");
        int D = leer.nextInt();
        System.out.println("Ingrese el diametro menor: ");
        int d = leer.nextInt();
        int a =(D * d)/2;
        System.out.println("El area del rombo es de: "+ a);
        leer.close();
    }
}
