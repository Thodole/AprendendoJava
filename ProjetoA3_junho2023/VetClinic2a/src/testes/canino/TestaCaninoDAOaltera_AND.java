package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.alteraAnd(11, 1, "Punch", 2, "Punch"));
    }
}
