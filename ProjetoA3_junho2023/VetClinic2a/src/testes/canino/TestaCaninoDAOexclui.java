package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(CaninoDAO.exclui(11));
    }
}