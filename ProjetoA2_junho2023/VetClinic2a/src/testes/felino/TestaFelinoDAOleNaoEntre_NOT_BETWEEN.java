package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe felino cuja ID não esteja entre as IDs informadas
        System.out.println(FelinoDAO.leTodosPorNaoEntre(2, 3));
    }
}
