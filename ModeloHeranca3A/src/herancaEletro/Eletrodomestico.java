package herancaEletro;
public class Eletrodomestico {
    private int numeroSerie;
    private int peso;
    private String marca;
    private String nome;

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Eletrodomestico(int numeroSerie,int peso,String marca,String nome){
        this.numeroSerie=numeroSerie;
        this.peso=peso;
        this.marca=marca;
        this.nome=nome;
    }
}
