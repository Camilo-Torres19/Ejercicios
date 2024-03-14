import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double horas_Trab, tarifa_Horas, salario;

        System.out.print("Ingresa el numero de horas trabajadas: ");
        horas_Trab = leer.nextDouble();

        System.out.println("Ingrese la tarifa por hora trabajada");
        tarifa_Horas = leer.nextDouble();
        leer.close();

        salario = tarifa_Horas * horas_Trab;

        System.out.println("El salario del trabajador es igual a $"+salario);
    } 
}
