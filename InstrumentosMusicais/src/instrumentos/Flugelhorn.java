package instrumentos;

public final class Flugelhorn extends Metal{
    
    private int pistoes;
    private boolean vara;

    public Flugelhorn(int pistoes, boolean vara, String cor, String voz, String timbre, int volume, String insuflador, int registros) {
        super(cor, voz, timbre, volume, insuflador, registros);
        this.pistoes = pistoes;
        this.vara = vara;
    }

    public int getPistoes() {
        return pistoes;
    }

    public void setPistoes(int pistoes) {
        this.pistoes = pistoes;
    }

    public boolean isVara() {
        return vara;
    }

    public void setVara(boolean vara) {
        this.vara = vara;
    }

    @Override
    public String toString() {
        return "\nFlugelhorn:" +
               super.toString() +
               "\nPistões:     " + getPistoes() +
               "\nVara:        " + (isVara() ? "Tem" : "Não tem");
    }
}