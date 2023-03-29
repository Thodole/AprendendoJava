package farmacia;

public class Cliente {
    private String cpf;
    private String nome;
    private String dataNasc;
    private Receita receita;
    private Pedido pedido;

    public Cliente(String cpf, String nome, String dataNasc, Receita receita, Pedido pedido) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.receita = receita;
        this.pedido = pedido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "\nCPF:                " + getCpf() +
               "\nNome:               " + getNome() +
               "\nData de Nascimento: " + getDataNasc() +
               "\nReceita:            " + getReceita() +
               "\nPedido:             " + getPedido();
    }
}