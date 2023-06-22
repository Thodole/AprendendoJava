package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Informa todos os caninos cadastrados
        System.out.println(CaninoDAO.leTodos());
    }
}
