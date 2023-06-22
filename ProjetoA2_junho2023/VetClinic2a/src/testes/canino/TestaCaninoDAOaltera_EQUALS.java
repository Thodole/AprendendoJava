package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera dados de um canino registrado (informe nova ID, novo nome,
        nova idade, ID original)
        */
        System.out.println(CaninoDAO.altera(4, "Canino Teste", 3, 4));
    }
}
