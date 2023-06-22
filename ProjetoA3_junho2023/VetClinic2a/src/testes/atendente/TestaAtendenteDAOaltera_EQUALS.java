package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Altera ID e nome de atend. (infomrme nova ID, novo nome e ID antiga)
        System.out.println(AtendenteDAO.altera(4, "Atendente Teste", 4));
    }
}