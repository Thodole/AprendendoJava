package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Informa todos os felinos cadastrados
        System.out.println(FelinoDAO.leTodos());
    }
}
