package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOlePorId_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FelinoDAO.lePorId(2, 3));
    }
    
}
