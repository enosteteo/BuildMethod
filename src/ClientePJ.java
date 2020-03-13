public class ClientePJ implements Cliente {
    private String nome;
    private String cnpj;

    public ClientePJ(){}

    public ClientePJ(String nome, String numero) {
        setNome(nome);
        setCnpj(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
