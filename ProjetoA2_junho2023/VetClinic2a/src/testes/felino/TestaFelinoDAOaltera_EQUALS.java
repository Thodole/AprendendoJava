package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera dados de um felino registrado (informe nova ID, novo nome,
        nova idade, ID original)
        */
        System.out.println(FelinoDAO.altera(4, "Felino Teste", 3, 4));
    }
}
