package testes.fisica;

import persistencia.FisicaDAO;

public class TestaFisicaDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FisicaDAO.leTodos());
    }
    
}
