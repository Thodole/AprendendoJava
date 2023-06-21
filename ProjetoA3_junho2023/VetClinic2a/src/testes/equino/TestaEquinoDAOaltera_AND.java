package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(EquinoDAO.alteraAnd(11, 1, "Alazão", 3, "Alasão"));
    }
}
