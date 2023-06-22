package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Mostra o felino cuja ID for informada
        System.out.println(FelinoDAO.leUm(3));
    }
}
