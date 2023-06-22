package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Informa todos os atendentes cadastrados
        System.out.println(AtendenteDAO.leTodos());
    }
}
