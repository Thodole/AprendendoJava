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
        consulta.setIdConsulta(2);
        consulta.setDataHora("20/06/2023 - 16:51");
        consulta.setProcedimento("Soro e medicação");
        
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(2);
        consulta.setVeterinario(veterinario);
        
        Atendente atendente = new Atendente();
        atendente.setIdAtend(2);
        consulta.setAtendente(atendente);
        
        Equino equino = new Equino();
        equino.setIdEquino(1);
        consulta.setEquino(equino);
        
        Canino canino = new Canino();
        canino.setIdCanino(-99);
        consulta.setCanino(canino);
        
        Felino felino = new Felino();
        felino.setIdFelino(-99);
        consulta.setFelino(felino);
        
        System.out.println(ConsultaDAO.grava(consulta));
    }
    
    
    
}
