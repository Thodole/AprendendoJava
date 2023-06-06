package testes.fisica;

import persistencia.FisicaDAO;

public class Q08_TeseteFisicaDAOleTodosInnerJoin {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FisicaDAO.leTodosInnerJoin('J', 30, 40));
    }
    
}
