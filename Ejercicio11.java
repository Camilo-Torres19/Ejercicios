import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      System.out.println("*******************************");
      System.out.println("     Area de un rectangulo.     ");
      System.out.println("*******************************");
      System.out.println("");
      System.out.println("Ingrese la base: ");
      int b = leer.nextInt();
      System.out.println("Ingrese la altura: ");
      int a = leer.nextInt();
      int A = (b*a) ;
      System.out.println("El area del triangulo es de: " +A);
      leer.close();
    }
}