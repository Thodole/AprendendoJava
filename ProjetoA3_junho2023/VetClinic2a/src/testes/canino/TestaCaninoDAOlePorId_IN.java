package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOlePorId_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe caninos pertencentes ao grupo de IDs informadas
        System.out.println(CaninoDAO.lePorId(1, 3));
    }
}
