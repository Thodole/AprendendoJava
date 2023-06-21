package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(EquinoDAO.alteraNotIn("Pé de Pano", 1, 3));
    }
}
