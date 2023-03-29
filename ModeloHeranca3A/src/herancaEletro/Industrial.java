package herancaEletro;
public class Industrial extends Fogao {
    private Double profundidade;

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
    
    public Industrial (int numeroSerie,int peso,String marca,String nome,int qtdBocas,Double largura,Double profundidade){
        super(numeroSerie,peso,marca,nome,qtdBocas,largura);
        this.profundidade=profundidade;
    }
    
    public String toString(){
        return  "\n Dados Industriais:"+
                "\n Numero de Serie:"+getNumeroSerie()+
                "\n Peso:"+getPeso()+
                "\n Marca:"+getMarca()+
                "\n Nome:"+getNome()+
                "\n Quantida de Bocas:"+getQtdBocas()+
                "\n Largura:"+getLargura()+
                "\n Profundidade:"+getProfundidade();
    }
}
