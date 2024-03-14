import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingresa el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingresa el segundoo numero");
        num2 = leer.nextInt();
       

        int numeroMayor = calcular_NumeroMayor(num1, num2);

        if (num1 != num2) {
            System.out.println("El numero mayor entre los enteros "+ num1 + " y "+ num2 + " es :  "+numeroMayor);
        } else {
            System.out.println("Los numeros son iguales");
        }
         leer.close();
    }

    public static int calcular_NumeroMayor(int n1, int n2){
        int numeroMayor;

        if (n1>n2) {
            numeroMayor = n1;
        } else if (n2>n1) {
            numeroMayor = n2;
        } else {
            numeroMayor=0;
        }
        return numeroMayor;
    }
}
