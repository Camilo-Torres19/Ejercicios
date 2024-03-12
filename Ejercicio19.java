import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el sueldo: ");
        double sueldo = sc.nextDouble();
        double des = sueldo * 0.2;
        double tg = sueldo - des;
        System.out.println("El sueldo es de: "+sueldo);
        System.out.println("El descuento es de: "+ des);
        System.out.println("El total a pagar es de: "+ tg);
        sc.close();
    }
}