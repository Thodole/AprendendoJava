package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(EquinoDAO.altera(3, "Scadufax", 6, 33));
    }
}
