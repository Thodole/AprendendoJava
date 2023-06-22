package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe canino cuja ID não esteja entre as IDs informadas
        System.out.println(CaninoDAO.leTodosPorNaoEntre(2, 3));
    }
}
