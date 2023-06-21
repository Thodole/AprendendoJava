package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.alteraNotIn("Aroldo", 2, 3));
    }
}
