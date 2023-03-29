package instrumentos;

public final class Atabaque extends InstrumentoMusical {
    private String tamanho;
    private String cor;

    public Atabaque(String tamanho, String cor, String timbre, int volume) {
        super(timbre, volume);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Atabaque: " +
             "\nTamanho:     " + getTamanho() +
             "\nCor:         " + getCor() +
              super.toString();
    }
}