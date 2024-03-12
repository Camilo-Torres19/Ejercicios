import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("*******************************");
      System.out.println("  IVA de cualquier cantidad.   ");
      System.out.println("*******************************");
      System.out.println("");
      System.out.println("Ingrese la cantidad a calcular: ");
      int c = leer.nextInt();
      double i = c*0.19;
      System.out.println("El IVA de la cantidad ingresada es de: " +i);
      leer.close();
    }
}