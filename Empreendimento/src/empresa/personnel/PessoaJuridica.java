package empresa.personnel;

public final class PessoaJuridica extends Cliente {
    
    private String cnpj;
    
    public PessoaJuridica(String nome, String endereco, int idade, String cnpj) {
        super(nome, endereco, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return "Informações da Pessoa Jurídica:" +
             "\nNome:     " +getNome()+
             "\nEndereço: " +getEndereco()+
             "\nIdade:    " +getIdade()+
             "\nCNPJ:     " +getCnpj();
    }
}