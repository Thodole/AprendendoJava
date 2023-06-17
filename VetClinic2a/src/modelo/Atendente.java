package modelo;

public class Atendente {
    
    private int idAtend;
    private String nome;

    public Atendente(int idAtend, String nome) {
        this.idAtend = idAtend;
        this.nome = nome;
    }

    public int getIdAtend() {
        return idAtend;
    }

    public void setIdAtend(int idAtend) {
        this.idAtend = idAtend;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return   "\nID do Atendente:         " + getIdAtend()
               + "\nNome:                    " + getNome();
    }
    
}
