package testes.atendente;

import persistencia.AtendenteDAO;

public class Q04_TesteAtendenteDAOalteraMatrNome {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.alteraMatrNome(5, 4, "Joaquim da Silva"));
    }
    
}
