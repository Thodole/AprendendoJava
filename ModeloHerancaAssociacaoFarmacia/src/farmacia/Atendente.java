package farmacia;

public class Atendente extends Funcionario{
    
    private int idade;

    public Atendente(String nome, int matricula, Double salario, int idade) {
        super(nome, matricula, salario);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nIdade:              " + getIdade();
    }    
}