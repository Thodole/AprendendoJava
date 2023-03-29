package farmacia;

// Encapsulamento, tipo(opcional), classe, nome, indicador de herança, nome mãe.
public class Medicamento extends Produto {
    private String tarja;
    private String doenca;

    public Medicamento(Double preco, String codigo, String nome, String tarja, String doenca, Fornecedor fornecedor) {
        super(preco, fornecedor, codigo, nome);
        this.tarja = tarja;
        this.doenca = doenca;
    }

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nTarja:              " + getTarja() +
               "\nDoença:             " + getDoenca();
    }
}