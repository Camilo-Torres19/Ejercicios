import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division, resto;

        System.out.println("Ingrese el numero 1: ");
        num1 = leer.nextDouble();

        System.out.println("Ingresa el numero 2: ");
        num2 = leer.nextDouble();
        leer.close();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;

        System.out.println("La suma entre "+ num1 + " y "+ num2 +" es "+ suma);
        System.out.println("La resta entre "+ num1 + " y "+ num2 +" es "+ resta);
        System.out.println("La multiplicacion entre "+ num1 + " y "+ num2 +" es "+ multiplicacion);
        System.out.println("La division entre "+ num1 + " y "+ num2 +" es "+ division);
        System.out.println("El resto de la division entre "+ num1 + " y "+ num2 +" es "+ resto);
    }
}
