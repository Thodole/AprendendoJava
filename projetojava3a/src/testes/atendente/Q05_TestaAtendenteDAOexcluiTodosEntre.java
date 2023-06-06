package testes.atendente;

import persistencia.AtendenteDAO;

public class Q05_TestaAtendenteDAOexcluiTodosEntre {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.excluiTodosEntre(5, 7));
    }
    
}
