package herancaEletro;
public class Fogao extends Eletrodomestico {
    private int qtdBocas;
    private Double largura;

    public int getQtdBocas() {
        return qtdBocas;
    }

    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
    
    public Fogao(int numeroSerie,int peso,String marca,String nome,int qtdBocas,Double largura){
        super(numeroSerie,peso,marca,nome);
        this.qtdBocas=qtdBocas;
        this.largura=largura;
    }
}
