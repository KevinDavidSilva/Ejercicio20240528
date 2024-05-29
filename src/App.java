import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Productos> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el Id del producto:");
            int Id = scanner.nextInt();
            System.out.println("Ingresar el Nombre del producto");
            String nombre = scanner.nextLine();
            System.out.println("Ingresa la marca del producto");
            String marca= scanner.nextLine();
            System.out.println("Ingrese el precio del producto");
            double precio = scanner.nextDouble();
        }
    }
}
