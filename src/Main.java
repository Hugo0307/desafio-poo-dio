public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Hugo");
        cliente1.setTipoPessoa(Pessoa.TipoPessoa.PESSOA_FISICA);
        cliente1.setTipoDocumento(Pessoa.TipoDocumento.CPF);
        cliente1.setDocumento("123.456.789-00");

        Conta cc = new ContaCorrente(cliente1);
        cc.setTipoConta(Conta.TipoConta.CONTA_CORRENTE);
        cc.depositar(250);

        cc.extrato();
        System.out.println(Agencia.listaClientes());

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Henrique LTDA");
        cliente2.setTipoPessoa(Pessoa.TipoPessoa.PESSOA_JURIDICA);
        cliente2.setTipoDocumento(Pessoa.TipoDocumento.CNPJ);
        cliente2.setDocumento("987.654.32/0001-33");

        Conta poupanca = new ContaPoupanca(cliente2);
        poupanca.setTipoConta(Conta.TipoConta.CONTA_POUPANCA);
        cc.transferir(100, poupanca);

        poupanca.extrato();

        System.out.println(Agencia.listaClientes());
    }
}
