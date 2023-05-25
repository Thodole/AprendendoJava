package testes.fisica;

import persistencia.FisicaDAO;

public class TestaFisicaDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(FisicaDAO.leUm("99999999999"));
    }
    
}
