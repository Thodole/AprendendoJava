package testes.atendente;

import persistencia.AtendenteDAO;

public class Q03_TestaAtendenteDAOalteraMatr {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.alteraMatr(5, 4));
    }
    
}
