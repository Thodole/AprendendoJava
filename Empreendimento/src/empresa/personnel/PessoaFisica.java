package empresa.personnel;

public final class PessoaFisica extends Cliente {
    
    private String cpf;
    
    public PessoaFisica(String nome, String endereco, int idade, String cpf) {
        super(nome, endereco, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "Informações da Pessoa Física:" +
             "\nNome:     " +getNome()+
             "\nEndereço: " +getEndereco()+
             "\nIdade:    " +getIdade()+
             "\nCPF:      " +getCpf();
    }
}