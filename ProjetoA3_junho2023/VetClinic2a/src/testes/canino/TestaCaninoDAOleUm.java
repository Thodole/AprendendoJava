package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.leUm(1));
    }
}
