package instrumentos;

public abstract class InstrumentoDeSopro extends InstrumentoMusical {
    
    private String insuflador;
    private int registros;
    
    public InstrumentoDeSopro(String timbre, int volume, String insuflador, int registros) {
        super(timbre, volume);
        this.registros = registros;
        this.insuflador = insuflador;
    }

    public String getInsuflador() {
        return insuflador;
    }

    public void setInsuflador(String insuflador) {
        this.insuflador = insuflador;
    }

    public int getRegistros() {
        return registros;
    }

    public void setRegistros(int registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nInsuflador:  " + insuflador +
               "\nRegistros:   " + registros;
    }
}