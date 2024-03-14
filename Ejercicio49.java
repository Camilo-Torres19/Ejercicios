import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadenaDeTexto;
        char primeraLetra;

        System.out.println("Ingrese una cadena de texto");
        cadenaDeTexto = leer.nextLine();
        leer.close();

        primeraLetra = devolverPrimeraLetra(cadenaDeTexto);

        System.out.println("La primera letra del texto ingresado '"+cadenaDeTexto + "' es '"+primeraLetra+"'");
    }

    public static char devolverPrimeraLetra(String cadenaTexto){
        char primeraLetra;
        primeraLetra = cadenaTexto.charAt(0);

        return primeraLetra;
    }
}
