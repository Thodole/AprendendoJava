package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera dados de um canino registrado (informe nova ID, novo nome,
        nova idade, ID original e nome original do Canino)
        */
        System.out.println(CaninoDAO.alteraAnd(4, "Teste Canino", 2, 4, "Canino Teste"));
    }
}
