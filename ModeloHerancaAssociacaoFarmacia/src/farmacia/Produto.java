package farmacia;

public abstract class Produto {
    private Double preco;
    private Fornecedor fornecedor;
    private String codigo;
    private String nome;

    public Produto(Double preco, Fornecedor fornecedor, String codigo, String nome) {
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nPreço:              " + getPreco() +
               "\nCódigo:             " + getCodigo() +
               "\nNome:               " + getNome() +
               "\nFornecedor:         " + getFornecedor();
    }    
}