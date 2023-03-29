package farmacia;

public class Farmaceutico extends Funcionario{
    
    private String formacao;

    public Farmaceutico(String nome, int matricula, Double salario, String formacao) {
        super(nome, matricula, salario);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nFormação:           " + getFormacao();
    }
}