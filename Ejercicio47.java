import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double porcentaje_Descontado, precio_Compra, precio_Pagado, cant_Comprada;

        System.out.print("Inserte la cantidad de la compra: ");
        cant_Comprada = sc.nextDouble();
        System.out.print("Digite el precio de la compra: ");
        precio_Compra = sc.nextDouble();
        System.out.print("Digite el Precio Pagado por la compra: ");
        precio_Pagado = sc.nextDouble();
        sc.close();

        porcentaje_Descontado = ((precio_Compra-precio_Pagado)/precio_Compra)*100; 
    
        double precioCompraxUnidad = precio_Compra / cant_Comprada;
        double precioPagadoxUnidad = precio_Pagado / cant_Comprada;
        System.out.println("El precio de compra por unidad es: "+ precioCompraxUnidad);
        System.out.println("EL precio pagado por unidad es: "+ precioPagadoxUnidad);
        System.out.println("EL porcentaje descontado es de: "+ porcentaje_Descontado+"%");
    }
}
