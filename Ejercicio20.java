import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        double n3 = sc.nextDouble();
        System.out.println("Ingrese la cuarta nota: ");
        double n4 = sc.nextDouble();
        System.out.println("Ingrese la quinta nota: ");
        double n5 = sc.nextDouble();
        double su = n1+n2+n3+n4+n5;
        double pro = su /5;
        double dob = su * 2;
        System.out.println("La suma de las notas es: "+su);
        System.out.println("El promedio de las notas es: "+pro);
        System.out.println("El doble de las notas es: "+dob);
        sc.close();
    }
}
