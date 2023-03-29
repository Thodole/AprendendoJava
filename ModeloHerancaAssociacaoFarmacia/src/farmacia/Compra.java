package farmacia;

public class Compra {
    
    private int numero;
    private String data;
    private Double valor;
    private Cliente cliente;
    private Pagamento pagamento;

    public Compra(int numero, String data, Double valor, Pagamento pagamento, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "\nNúmero:             " + getNumero() +
               "\nData:               " + getData() +
               "\nValor:              " + getValor() +
               "\nPagamento:          " + getPagamento() +
               "\nCliente:            " + getCliente();
    }
}