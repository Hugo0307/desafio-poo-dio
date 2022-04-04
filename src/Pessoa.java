public abstract class Pessoa {

    public enum TipoDocumento {
        CPF,
        CNPJ
    }

    public enum TipoPessoa {
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }

    private String nome;
    private String documento;
    private TipoPessoa tipoPessoa;
    private TipoDocumento tipoDocumento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}