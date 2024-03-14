import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String []abc){
        Scanner sc = new Scanner(System.in);
        int num_Ingresado; 

        do {
            System.out.println("Ingresa un numero del 1 al 10");
            num_Ingresado = sc.nextInt(); 
        } while (num_Ingresado <= 0 || num_Ingresado > 10);
        sc.close();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num_Ingresado+ " X "+ i + " = "+ (num_Ingresado*i));
        }
    }
}
