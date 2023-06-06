package testes.atendente;

import persistencia.AtendenteDAO;

public class Q01_TestaAtendenteDAOleMaioresQue2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leMaioresQue2());
    }
}
