package farmacia;

public class Perfumaria extends Produto{
    private String secao;
    private Double desconto;

    public Perfumaria(Double preco, String codigo, String nome, String secao, Double desconto, Fornecedor fornecedor) {
        super(preco, fornecedor, codigo, nome);
        this.secao = secao;
        this.desconto = desconto;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSeção:              " + getSecao() +
               "\nDesconto:           " + getDesconto();
    }    
}