package testes.fisica;

import persistencia.FisicaDAO;

public class TesteFisicaDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        System.out.println(FisicaDAO.exclui("99999999999"));
    }

}
