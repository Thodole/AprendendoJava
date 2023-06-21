package modelo;

public class Equino extends Animal{
    
    private int idEquino;

    public Equino() {
        this.idEquino = 0;
    }
    
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
        return "\nID do equino:            " + idEquino +
               "\nNome do equino:          " + getNome() +
               "\nIdade do animal:         " + getIdade() + " ano(s)";
    }
    
}
