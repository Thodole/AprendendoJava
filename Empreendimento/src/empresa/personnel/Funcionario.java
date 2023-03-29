package empresa.personnel;

public abstract class Funcionario extends Pessoa {
    
    private int matricula;
    private Double salario;
    
    public Funcionario(String nome, String endereco, int matricula, Double salario) {
        super(nome, endereco);
        this.salario=salario;
        this.matricula=matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}