package modelo;

public class Consulta {
    
    private int idConsulta;
    private String dataHora;
    private int tipoPaciente;
    private String procedimento;
    private Canino canino;
    private Equino equino;
    private Felino felino;
    private Atendente atendente;
    private Veterinario veterinario;

    public Consulta() {}
    
    public Consulta(int idConsulta, String dataHora, int tipoPaciente, String procedimento, Canino canino, Equino equino, Felino felino, Atendente atendente, Veterinario veterinario) {
        this.idConsulta = idConsulta;
        this.dataHora = dataHora;
        this.tipoPaciente = tipoPaciente;
        this.procedimento = procedimento;
        this.canino = canino;
        this.equino = equino;
        this.felino = felino;
        this.atendente = atendente;
        this.veterinario = veterinario;
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
    
    public int getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(int tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
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
    
    public String paciente() {
        switch (getTipoPaciente()) {
            case 1:
                return canino.toString();
            case 2:
                return equino.toString();
            case 3:
                return felino.toString();
            default:
                return "\nInforme corretamente o id do animal";
        }
    }

    @Override
    public String toString() {
        return "\nDados da consulta ---------------------------" +
               "\nNúmero da Consulta:      " + idConsulta +
               "\nData e hora:             " + dataHora +
               "\nProcedimento(s):         " + procedimento +
               "\nDados do animal:         --------------------" + paciente() +
               "\nDados do atendente:      --------------------" + atendente +
               "\nDados do Veterinário:    --------------------" + veterinario;
    }
    
}
