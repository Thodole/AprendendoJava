package modelo;

public class Veterinario {
    
    private int idVet;
    private String nome;

    public Veterinario() {}
    
    public Veterinario(int idVet, String nome) {
        this.idVet = idVet;
        this.nome = nome;
    }

    public int getIdVet() {
        return idVet;
    }

    public void setIdVet(int idVet) {
        this.idVet = idVet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return   "\nID do Veterinário(CRMV): " + getIdVet()
               + "\nNome do veterinário:     " + getNome() + "\n";
    }
    
}
