import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private static final int CODIGO_AGENCIA = 123;

    public static int getCodigoAgencia() {
        return CODIGO_AGENCIA;
    }

    public static List<String> listaClientes() {
        List<String> clientes = new ArrayList<>();
        String cliente = Conta.getCliente().getNome();
        clientes.add(cliente);
        return clientes;
    }
}
