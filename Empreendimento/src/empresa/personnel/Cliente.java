package empresa.personnel;

public abstract class Cliente extends Pessoa {

    private int idade;

    public Cliente(String nome, String endereco, int idade) {
        super(nome, endereco);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}