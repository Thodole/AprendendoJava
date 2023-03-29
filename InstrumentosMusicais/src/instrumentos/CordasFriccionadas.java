package instrumentos;

public abstract class CordasFriccionadas extends InstrumentoDeCordas {
    
    private String vozHarmonica;
    private String tamanho;

    public CordasFriccionadas(String vozHarmonica, String tamanho, int cordas, String voz, String timbre, int volume) {
        super(cordas, voz, timbre, volume);
        this.vozHarmonica = vozHarmonica;
        this.tamanho = tamanho;
    }

    public String getVozHarmonica() {
        return vozHarmonica;
    }

    public void setVozHarmonica(String vozHarmonica) {
        this.vozHarmonica = vozHarmonica;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "\nV.Harmônica: " + getVozHarmonica() +
               "\nTamanho:     " + getTamanho();
    }
}