import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("*******************************");
      System.out.println("     Area de un triangulo.     ");
      System.out.println("*******************************");
      System.out.println("");
      System.out.println("Ingrese la base: ");
      int b = leer.nextInt();
      System.out.println("Ingrese la altura: ");
      int a = leer.nextInt();
      int A = (b*a)/2 ;
      System.out.println("El area del triangulo es de: " +A);
      leer.close();
    }
}