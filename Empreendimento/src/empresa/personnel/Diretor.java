package empresa.personnel;

public final class Diretor extends Funcionario{
    
    private Double gratificacao;
    
    public Diretor(String nome, String endereco, int matricula, Double salario,
                   Double gratificacao) {
        super(nome, endereco, matricula, salario);
        this.gratificacao = gratificacao;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    public String toString() {
        return "Informações do Diretor:" +
             "\nNome:         " +getNome()+
             "\nEndereço:     " +getEndereco()+
             "\nMatrícula:    " +getMatricula()+
             "\nSalário:      " +getSalario()+
             "\nGratificação: " +getGratificacao();
    }
}