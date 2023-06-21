package modelo;

public class Felino extends Animal{
    
    private int idFelino = 0;

    public Felino() {}
    
    public Felino(String nome, int idade, int idFelino) {
        super(nome, idade);
        this.idFelino = idFelino;
    }

    public int getIdFelino() {
        return idFelino;
    }

    public void setIdFelino(int idFelino) {
        this.idFelino = idFelino;
    }
    
    @Override
    public String toString() {
        return "\nID do felino:            " + idFelino +
               "\nNome do felino:          " + getNome() +
               "\nIdade do animal:         " + getIdade() + " anos";
    }
    
}
