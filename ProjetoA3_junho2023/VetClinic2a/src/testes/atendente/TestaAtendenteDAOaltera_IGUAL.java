package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOaltera_IGUAL {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.altera(3, "William Barbosa", 3));
    }
}