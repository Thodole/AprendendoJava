package instrumentos;

public abstract class InstrumentoDeCordas extends InstrumentoMusical{
    
    private int cordas;
    private String voz;

    public InstrumentoDeCordas(int cordas, String voz, String timbre, int volume) {
        super(timbre, volume);
        this.cordas = cordas;
        this.voz = voz;
    }

    public int getCordas() {
        return cordas;
    }

    public void setCordas(int cordas) {
        this.cordas = cordas;
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
               "\nCordas:      " + getCordas() +
               "\nVoz:         " + getVoz();
    }
}