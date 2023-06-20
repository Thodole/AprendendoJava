package modelo;

public class Consulta {
    
    private int idConsulta;
    private String dataHora;
    private String procedimento;
    private Veterinario veterinario;
    private Atendente atendente;
    private Equino equino;
    private Canino canino;
    private Felino felino;

    public Consulta() {}
    
    public Consulta(int idConsulta, String dataHora, String procedimento, Veterinario veterinario, Atendente atendente, Equino equino, Canino canino, Felino felino) {
        this.idConsulta = idConsulta;
        this.dataHora = dataHora;
        this.procedimento = procedimento;
        this.veterinario = veterinario;
        this.atendente = atendente;
        this.equino = equino;
        this.canino = canino;
        this.felino = felino;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public Canino getCanino() {
        return canino;
    }

    public void setCanino(Canino canino) {
        this.canino = canino;
    }

    public Equino getEquino() {
        return equino;
    }

    public void setEquino(Equino equino) {
        this.equino = equino;
    }

    public Felino getFelino() {
        return felino;
    }

    public void setFelino(Felino felino) {
        this.felino = felino;
    }
    
    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "\nDados da consulta:       " +
               "\nNúmero da Consulta:      " + idConsulta +
               "\nData e hora:             " + dataHora +
               "\nProcedimento(s):         " + procedimento +
               "\nDados do animal:         " + canino + equino + felino +
               "\nDados do atendente:      " + atendente +
               "\nDados do Veterinário:    " + veterinario;
    }
    
}
