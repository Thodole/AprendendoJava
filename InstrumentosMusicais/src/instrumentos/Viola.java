package instrumentos;

public final class Viola extends CordasFriccionadas {
    
    private String cor;
    private String arco;

    public Viola(String cor, String arco, String vozHarmonica, String tamanho, int cordas, String voz, String timbre, int volume) {
        super(vozHarmonica, tamanho, cordas, voz, timbre, volume);
        this.cor = cor;
        this.arco = arco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    @Override
    public String toString() {
        return "Viola:" +
               super.toString() +
               "\nCor:         " + getCor() +
               "\nArco:        " + getArco();
    }
}