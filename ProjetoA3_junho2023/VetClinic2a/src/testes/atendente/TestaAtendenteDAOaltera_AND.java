package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.alteraAnd("Sophia Silva", 2, "Sofia Silva"));
    }
}
