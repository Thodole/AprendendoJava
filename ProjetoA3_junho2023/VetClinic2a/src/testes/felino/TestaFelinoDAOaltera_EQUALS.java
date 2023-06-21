package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.altera(2, "Edgar", 3, 22));
    }
}
