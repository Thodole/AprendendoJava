package testes.atendente;

import modelo.Atendente;
import persistencia.AtendenteDAO;

public class TestaAtendenteDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra um novo atendente (informe ID e Nome do atendente)
        Atendente atendente = new Atendente();
        atendente.setIdAtend(4);
        atendente.setNome("Atendente Teste");
        
        System.out.println(AtendenteDAO.grava(atendente));
    }
}
