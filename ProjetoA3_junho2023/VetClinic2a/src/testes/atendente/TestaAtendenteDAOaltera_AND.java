package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Altera o nome de um atendente (informe: novo nome, ID e nome antigo)
        System.out.println(AtendenteDAO.alteraAnd("Teste Atendente", 4, "Atendente Teste"));
    }
}
