package testes.fisica;

import persistencia.FisicaDAO;

public class Q07_TesteFisicaDAOleTodosIdade15a30anos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FisicaDAO.leTodosIdade15a30anos(15, 30));
    }
    
}
