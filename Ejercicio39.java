import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int año_nac, año_actual, diasVividos, edad ;
        String nombre;
        double diaDormidos;

        System.out.print("Ingresa el año actual: ");
        año_actual = leer.nextInt();
        System.out.print("Ingresa el año de nacimiento: ");
        año_nac = leer.nextInt();
        System.out.print("Ingrese el nombre: ");
        nombre = leer.next();

        edad = año_actual - año_nac;
        diasVividos = edad * 365;
        diaDormidos = diasVividos * 0.34;
        System.out.println("________________________________________________________________________________");
        System.out.println(nombre + " ha dormido a lo largo de su vida aproximadamente "+ diaDormidos +" dias");
        leer.close();
    }
}
