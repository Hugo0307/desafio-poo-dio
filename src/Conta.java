public abstract class Conta implements IConta{

    private static int SEQUENCIAl_NUMERO = 1;

    public enum TipoConta {
        CONTA_CORRENTE,
        CONTA_POUPANCA
    }

    private int agencia;
    private int numero;
    private double saldo;
    private static Cliente cliente;
    private TipoConta tipoConta;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numero = SEQUENCIAl_NUMERO++;
        this.agencia = Agencia.getCodigoAgencia();
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public static Cliente getCliente() {
        return cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
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
        this.sacar(valor);
        contaDestino.depositar(valor);
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
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("========== Fim do Extrato ==========");
        System.out.println();
    }

}
