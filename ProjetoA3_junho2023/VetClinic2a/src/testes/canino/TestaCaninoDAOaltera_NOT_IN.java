package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.alteraNotIn("Spock", 1, 2));
    }
}
