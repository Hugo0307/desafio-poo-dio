import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente extends Pessoa {

    private String nome;
    private String documento;
    private Endereco endereco;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", tipoPessoa=" + super.getTipoPessoa() +
                ", tipoDocumento=" + super.getTipoDocumento() +
                "},\n" +
                "endereco=" + endereco;
    }

    public void adicionaEndereco(Endereco endereco){
        this.setEndereco(endereco);
    }
}
