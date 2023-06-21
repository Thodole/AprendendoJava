package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.altera(2, "Pitucha", 5, 22));
    }
}
