import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final double kg_anual = 8;
        double frutaxGr;
        double manzanas_comsumidas;
        int edad;

        System.out.println("Ingrese la edad ");
        edad = leer.nextInt();

        frutaxGr = (kg_anual * edad)*1000;

        manzanas_comsumidas = frutaxGr / 4;

        System.out.println("La persona ha consumido "+ frutaxGr + 
        " Gramos de fruta durante sus "+ edad + " años de edad");
        System.out.println("La persona ha consumido "+ manzanas_comsumidas + 
        " manzanas durante sus "+ edad + " años de edad");
        leer.close();

    }
}
