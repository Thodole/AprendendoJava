package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOleUM {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.leUm(3));
    }
}
