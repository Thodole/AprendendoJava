package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Informa todos os equinos cadastrados
        System.out.println(EquinoDAO.leTodos());
    }
}
