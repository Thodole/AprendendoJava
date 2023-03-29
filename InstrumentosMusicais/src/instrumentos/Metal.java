package instrumentos;

public abstract class Metal extends InstrumentoDeSopro {
    
    private String cor;
    private String voz;

    public Metal(String cor, String voz, String timbre, int volume, String insuflador, int registros) {
        super(timbre, volume, insuflador, registros);
        this.cor = cor;
        this.voz = voz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVoz() {
        return voz;
    }

    public void setVoz(String voz) {
        this.voz = voz;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nCor:         " + getCor() +
               "\nVoz:         " + getVoz();
    }
}