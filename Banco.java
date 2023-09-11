import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Banco {

    public record Cliente(String documento,
                          String nombreCompleto){}

    public static void main(String[] args) {
        Deque<Cliente> clientes= new ArrayDeque<>();
        clientes.add(new Cliente("3454889","Juan Pérez"));
        clientes.add(new Cliente("3454889","María García"));
        clientes.removeFirst();
        clientes.add(new Cliente("3487387","Carlos Pérez Garcia"));
        clientes.removeFirst();
        clientes.removeFirst();
        clientes.add(new Cliente("8478347","Ana Martínez"));
        clientes.add(new Cliente("5457557","Luisa Hernández"));
        clientes.add(new Cliente("9248934","Javier López"));
        clientes.add(new Cliente("3489483","Laura Ramírez"));
        clientes.removeFirst();
        clientes.removeFirst();
        clientes.add(new Cliente("3498398","Martín Torres"));
        clientes.removeFirst();
        clientes.add(new Cliente("9090909","Sofia Vargas"));
        clientes.removeFirst();
        clientes.removeFirst();
        clientes.removeFirst();
        clientes.add(new Cliente("9389384","Daniel Sánchez"));

        System.out.println("");
        System.out.println("Personas pendientes por atender:");
        System.out.println("");
        System.out.println(clientes.getFirst().nombreCompleto+ " identificado con el documento "+ clientes.getFirst().documento);



    }
}
