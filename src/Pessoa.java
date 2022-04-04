import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pessoa {

    public enum TipoDocumento {
        CPF,
        CNPJ
    }

    public enum TipoPessoa {
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }

    private TipoPessoa tipoPessoa;
    private TipoDocumento tipoDocumento;

}