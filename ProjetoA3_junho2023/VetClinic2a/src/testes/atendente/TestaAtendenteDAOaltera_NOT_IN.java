package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera o nome de um atendente não pertencente ao grupo informado 
           Informe o nomvo nome e a ID dos atendentes que não serão alterados
           ATENÇÃO! Somente use este método se houver 3 atendentes listados.
        */
        System.out.println(AtendenteDAO.alteraNotIn("Atendente Teste", 2, 3));
    }
}
