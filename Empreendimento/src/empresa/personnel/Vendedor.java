package empresa.personnel;

public final class Vendedor extends Funcionario{
    
    private String setorVendas;
    private Double comissao;
    private Double totalVendido;

    public Vendedor(String nome, String endereco, int matricula, Double salario,
                    String setorVendas, Double comissao, Double totalVendido) {
        super(nome, endereco, matricula, salario);
        this.comissao=comissao;
        this.setorVendas=setorVendas;
        this.totalVendido=totalVendido;
    }

    public String getSetorVendas() {
        return setorVendas;
    }

    public void setSetorVendas(String setorVendas) {
        this.setorVendas = setorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(Double totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    @Override
    public String toString() {
        return "Informações do Vendedor:" +
             "\nNome:            " +getNome()+
             "\nEndereço:        " +getEndereco()+
             "\nMatrícula:       " +getMatricula()+
             "\nSalário:         " +getSalario()+
             "\nSetor de Vendas: " +getSetorVendas()+
             "\nComissão:        " +getComissao()+
             "\nTotal Vendido:   " +getTotalVendido();
    }
}