package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera o nome de um equino não pertencente ao grupo informado 
           Informe o novo nome e a ID dos equinos que não serão alterados
           ATENÇÃO! Somente use este método se houver 3 equinos listados.
        */
        System.out.println(EquinoDAO.alteraNotIn("Pé de Pano", 1, 3));
    }
}
