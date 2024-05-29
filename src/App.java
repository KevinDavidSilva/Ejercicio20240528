import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Productos> productos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el ID del producto:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();
            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            Productos producto = new Productos(id, nombre, marca, precio);
            productos.add(producto);

            System.out.println("¿Desea agregar otro producto? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        // Ordenar los productos por ID
        Collections.sort(productos, Comparator.comparingInt(Productos::getId));

        // Mostrar los productos registrados
        System.out.println("Productos registrados:");
        Iterator<Productos> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
