public class Cliente extends Pessoa {

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    private void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void adicionaEndereco(Endereco endereco) throws Exception{
        if(endereco == null) {
            new NullPointerException("Endereço não pode ser nulo");
        }
        this.setEndereco(endereco);
    }

}
