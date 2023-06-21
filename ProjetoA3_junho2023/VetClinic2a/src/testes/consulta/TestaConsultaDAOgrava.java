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
        consulta.setIdConsulta(11);
        consulta.setDataHora("20/06/2023 - 18:02");
        consulta.setProcedimento("Rotina");
        
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(3);
        consulta.setVeterinario(veterinario);
        
        Atendente atendente = new Atendente();
        atendente.setIdAtend(3);
        consulta.setAtendente(atendente);
        
        Equino equino = new Equino();
        equino.setIdEquino(3);
        consulta.setEquino(equino);
        
        Canino canino = new Canino();
        canino.setIdCanino(0);
        consulta.setCanino(canino);
        
        Felino felino = new Felino();
        felino.setIdFelino(0);
        consulta.setFelino(felino);
        
        System.out.println(ConsultaDAO.grava(consulta));
    }
    
}
