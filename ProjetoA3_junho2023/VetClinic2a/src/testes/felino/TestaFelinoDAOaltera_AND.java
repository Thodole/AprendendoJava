package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera dados de um felino registrado (informe nova ID, novo nome,
        nova idade, ID original e nome original do felino)
        */
        System.out.println(FelinoDAO.alteraAnd(4, "Teste Felino", 2, 4, "Felino Teste"));
    }
}
