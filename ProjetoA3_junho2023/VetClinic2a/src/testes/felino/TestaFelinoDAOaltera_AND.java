package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.alteraAnd(1, "Aroldo", 2, 1, "Arold"));
    }
}
