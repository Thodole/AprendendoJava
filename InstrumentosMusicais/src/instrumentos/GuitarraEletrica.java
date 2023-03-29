package instrumentos;

public final class GuitarraEletrica extends InstrumentoDeCordas {
    
    private boolean amplificado;
    private boolean efeitos;

    public GuitarraEletrica(boolean amplificado, boolean efeitos, int cordas, String voz, String timbre, int volume) {
        super(cordas, voz, timbre, volume);
        this.amplificado = amplificado;
        this.efeitos = efeitos;
    }

    public boolean isAmplificado() {
        return amplificado;
    }

    public void setAmplificado(boolean amplificado) {
        this.amplificado = amplificado;
    }

    public boolean isEfeitos() {
        return efeitos;
    }

    public void setEfeitos(boolean efeitos) {
        this.efeitos = efeitos;
    }

    @Override
    public String toString() {
        return "GuitarraEletrica:" +
               super.toString() +
               "\nAmplificado: " + (isAmplificado() ? "Sim" : "Não") +
               "\nEfeitos:     " + (isEfeitos() ? "Sim" : "Não");
    }
}