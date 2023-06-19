package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.altera(1, 1, "Aroldo", 1));
    }
}
