import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        if(edad < 18){
            System.out.println("-Usted es menor de edad");
        }else{
            System.out.println("Usted es mayor de edad");
        }
        sc.close();
    }
}
