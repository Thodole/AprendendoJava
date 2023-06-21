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
        Consulta consulta = new Consulta();
        consulta.setIdConsulta(5);
        consulta.setDataHora("21/06/2023 - 10:30");
        consulta.setProcedimento("Consutlta de Rotina");
        
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(3);
        consulta.setVeterinario(veterinario);
        
        Atendente atendente = new Atendente();
        atendente.setIdAtend(3);
        consulta.setAtendente(atendente);
        
        Equino equino = new Equino();
        equino.setIdEquino(0);
        consulta.setEquino(equino);
        
        Canino canino = new Canino();
        canino.setIdCanino(2);
        consulta.setCanino(canino);
        
        Felino felino = new Felino();
        felino.setIdFelino(0);
        consulta.setFelino(felino);
        
        System.out.println(ConsultaDAO.grava(consulta));
    }
    
}
