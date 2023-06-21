package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leTodosPorNaoEntre(2, 3));
    }
}
