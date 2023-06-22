package testes.consulta;

import modelo.Canino;
import modelo.Equino;
import modelo.Felino;
import modelo.Consulta;
import modelo.Atendente;
import modelo.Veterinario;
import persistencia.ConsultaDAO;

public class TestaConsultaDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra novo consulta (informe os seguintes dados)
        Consulta consulta = new Consulta();
        consulta.setIdConsulta(6);
        consulta.setDataHora("21/06/2023 - 17:30");
        consulta.setProcedimento("Consutlta de rotina");
        
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(123452);
        consulta.setVeterinario(veterinario);
        
        Atendente atendente = new Atendente();
        atendente.setIdAtend(2);
        consulta.setAtendente(atendente);
        
        Equino equino = new Equino();
        consulta.setEquino(equino);
        
        Canino canino = new Canino();
        canino.setIdCanino(3); // Informe esse dado apenas p/ o devido paciente
        consulta.setCanino(canino);
        
        Felino felino = new Felino();
        consulta.setFelino(felino);
        
        System.out.println(ConsultaDAO.grava(consulta));
    }
    
}
