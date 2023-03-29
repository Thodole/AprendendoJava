package herancaEletro;
public class MaquinaLavar extends Eletrodomestico {
    private String tipo;
    private String cor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public MaquinaLavar(int numeroSerie,int peso,String marca,String nome,String tipo,String cor){
        super(numeroSerie,peso,marca,nome);
        this.tipo=tipo;
        this.cor=cor;
    }
    
    public String toString(){
        return  "\n Dados da Maquina de Lavar:"+
                "\n Numero de Serie:"+getNumeroSerie()+
                "\n Peso:"+getPeso()+
                "\n Marca:"+getMarca()+
                "\n Nome:"+getNome()+
                "\n Tipo:"+getTipo()+
                "\n Cor:"+getCor();
    }
}
