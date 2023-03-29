package instrumentos;

public abstract class InstrumentoMusical {
    
    private String timbre;
    private int volume;
    
    public InstrumentoMusical(String timbre, int volume) {
        this.timbre = timbre;
        this.volume = volume;
    }

    public String getTimbre() {
        return timbre;
    }

    public void setTimbre(String timbre) {
        this.timbre = timbre;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "\nTimbre:      " +getTimbre()+
               "\nVolume:      " +getVolume();
    }
}