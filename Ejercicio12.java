import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese su primer numero: ");
       int n1 = leer.nextInt();
       System.out.println("Ingrese su segundo numero: ");
       int n2 = leer.nextInt();
       System.out.println("Ingrese su tercer numero: ");
       int n3 = leer.nextInt();
       float p = (n1+n2+n3)/3;
       System.out.println("El promedio de los tres numeros es: "+p);
       System.out.println("La suma de los 3 numeros es de : "+(n1+n2+n3));
       System.out.println("Doble del primer numero :"+(n1*2));
       System.out.println("Triple del segundo numero :"+(n2*3));
       System.out.println("Cuadrado del tercer numero :"+(n3*n3*n3));
       leer.close();
    }
}