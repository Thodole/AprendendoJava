package herancaEletro;
public class Televisao extends Eletrodomestico {
    private int polegadas;
    private String tipo;

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    public Televisao(int numeroSerie,int peso,String marca,String nome,int polegadas,String tipo){
        super(numeroSerie,peso,marca,nome);
        this.polegadas=polegadas;
        this.tipo=tipo;
    }
    
    public String toString(){
        return  "\n Dados da Televisão:"+
                "\n Numero de Serie:"+getNumeroSerie()+
                "\n Peso:"+getPeso()+
                "\n Marca:"+getMarca()+
                "\n Nome:"+getNome()+
                "\n Polegadas:"+getPolegadas()+
                "\n Tipo:"+getTipo();
    }
}
