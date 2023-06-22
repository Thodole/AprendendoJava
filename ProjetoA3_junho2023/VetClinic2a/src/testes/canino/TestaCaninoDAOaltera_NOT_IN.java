package testes.canino;

import persistencia.CaninoDAO;

public class TestaCaninoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera o nome de um canino não pertencente ao grupo informado 
           Informe o novo nome e a ID dos caninos que não serão alterados
           ATENÇÃO! Somente use este método se houver 3 caninos listados.
        */
        System.out.println(CaninoDAO.alteraNotIn("Spocky", 1, 2));
    }
}
