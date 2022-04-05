import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta implements IConta{

    private static int SEQUENCIAl_NUMERO = 1;

    public enum TipoConta {
        CONTA_CORRENTE,
        CONTA_POUPANCA
    }

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    @Setter
    private TipoConta tipoConta;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = SEQUENCIAl_NUMERO++;
        this.agencia = Agencia.getCodigoAgencia();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", tipoConta=" + tipoConta +
                "},\n" +
                "cliente=" + cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor > this.saldo) {
            System.out.println("====== TRANSFERÊNCIA INVÁLIDA ======");
            System.out.println(String.format("Saldo insuficiente: %.2f", this.saldo));
            System.out.println();
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void extrato() {
        System.out.println(String.format("=============== %s - COD. %d ================", Banco.getNome(), Banco.getCodigo()));
        System.out.println(("========== Extrato " + this.getTipoConta()).replace("_"," ").concat(" =========="));
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Tipo pessoa: " + this.getCliente().getTipoPessoa());
        System.out.println("Titular: " + this.getCliente().getNome());
        System.out.println(this.getCliente().getTipoDocumento() + ": " + this.getCliente().getDocumento());
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
        System.out.println("========== Fim do Extrato ==========");
        System.out.println();
    }

    public String dadosGerais() {
        System.out.println("========== CONSULTA DADOS GERAIS ==========");
        return "dadosGerais{" +
                this.toString() +
                "}\n\n";
    }

}
