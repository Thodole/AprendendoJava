package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.altera(102, 2, "Pitucha", 1));
    }
}