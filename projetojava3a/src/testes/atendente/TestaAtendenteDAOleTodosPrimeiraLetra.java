package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOleTodosPrimeiraLetra {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leTodosPrimeiraLetra('M'));
    }
}
