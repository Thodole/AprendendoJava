package testes.felino;

import persistencia.FelinoDAO;

public class TestaFelinoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera o nome de um felino não pertencente ao grupo informado 
           Informe o novo nome e a ID dos felinos que não serão alterados
           ATENÇÃO! Somente use este método se houver 3 felinos listados.
        */
        System.out.println(FelinoDAO.alteraNotIn("Aroldo", 2, 3));
    }
}
