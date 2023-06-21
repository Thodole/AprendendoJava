package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOlePrimeiraLetra_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.leTodosPrimeiraLetra('E'));
    }
}
