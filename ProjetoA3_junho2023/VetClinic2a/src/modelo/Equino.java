package modelo;

public class Equino extends Animal{
    
    private int idEquino;

    public Equino() {}
    
    public Equino(String nome, int idade, int idEquino) {
        super(nome, idade);
        this.idEquino = idEquino;
    }

    public int getIdEquino() {
        return idEquino;
    }

    public void setIdEquino(int idEquino) {
        this.idEquino = idEquino;
    }
    
    @Override
    public String toString() {
        return "\nID do Equino:            " + idEquino +
               "\nNome:                    " + getNome() +
               "\nIdade                    " + getIdade();
    }
    
}
