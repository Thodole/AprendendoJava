package modelo;

public class Canino extends Animal{
    
    private int idCanino;

    public Canino() {}
    
    public Canino(String nome, int idade, int idCanino) {
        super(nome, idade);
        this.idCanino = idCanino;
    }

    public int getIdCanino() {
        return idCanino;
    }

    public void setIdCanino(int idCanino) {
        this.idCanino = idCanino;
    }

    @Override
    public String toString() {
        return "\nID do canino:            " + idCanino +
               "\nNome do canino:          " + getNome() +
               "\nIdade do animal:         " + getIdade() + " anos";
    }
    
}
