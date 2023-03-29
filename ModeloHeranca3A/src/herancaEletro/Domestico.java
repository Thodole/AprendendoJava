package herancaEletro;
public class Domestico extends Fogao {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Domestico(int numeroSerie,int peso,String marca,String nome,int qtdBocas,Double largura,String tipo){
        super(numeroSerie,peso,marca,nome,qtdBocas,largura);
        this.tipo=tipo;
    }
    
    public String toString(){
        return  "\n Dados Domestico:"+
                "\n Numero de Serie:"+getNumeroSerie()+
                "\n Peso:"+getPeso()+
                "\n Marca:"+getMarca()+
                "\n Nome:"+getNome()+
                "\n Quantida de Bocas:"+getQtdBocas()+
                "\n Largura:"+getLargura()+
                "\n Tipo:"+getTipo();
    }
}
