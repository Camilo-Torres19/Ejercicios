import java.util.*;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de su examen matemático:");
        double nota = sc.nextDouble();
        if(nota > 2.9){
            System.out.println("¡Has ganado tu examen matemático!");
        }else{
            System.out.println("¡Has perdido tu examen matemático!");
        }
        sc.close();
    }
}