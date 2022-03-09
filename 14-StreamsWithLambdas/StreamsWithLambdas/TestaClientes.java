import java.util.List;
import java.util.ArrayList;

public class TestaClientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente(1, "Gabriel", Cliente.Status.Estudante));
        clientes.add(new Cliente(2, "Marcel", Cliente.Status.Estudante));
        clientes.add(new Cliente(3, "Arlindo", Cliente.Status.Desempregado));
        clientes.add(new Cliente(4, "Gabriel Lara", Cliente.Status.Empregado));
        clientes.add(new Cliente(5, "Bruno", Cliente.Status.Desempregado));

        System.out.println("Todos os clientes:");
        clientes.forEach( c -> System.out.println("Cliente: "+c.getNome()+", Status: "+c.getStatus()) );
        System.out.println();

        clientes.stream().filter(c -> c.getStatus().equals(Cliente.Status.Desempregado))
        .forEach(Cliente::aposentaCliente);
        System.out.println();

        System.out.println("Todos os clientes após checagem de aposentadoria:");
        clientes.forEach( c -> System.out.println("Cliente: "+c.getNome()+", Status: "+c.getStatus()) );
    }
}
