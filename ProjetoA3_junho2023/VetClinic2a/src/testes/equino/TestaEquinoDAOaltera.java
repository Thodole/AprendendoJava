package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(EquinoDAO.altera(11, 12, "Alazão", 5));
    }
}
