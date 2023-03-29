package instrumentos;

public final class GaitaDeFoles extends InstrumentoDeSopro{
    
    private String vozes;
    private String origem;

    public GaitaDeFoles(String vozes, String origem, String timbre, int volume, String insuflador, int registros) {
        super(timbre, volume, insuflador, registros);
        this.vozes = vozes;
        this.origem = origem;
    }

    public String getVozes() {
        return vozes;
    }

    public void setVozes(String vozes) {
        this.vozes = vozes;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "\nGaita de Foles:" +
               super.toString() +
               "\nVozes:       " + getVozes() +
               "\nOrigem:      " + getOrigem();
    }
}