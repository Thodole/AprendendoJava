package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(EquinoDAO.leTodosPorNaoEntre(2, 3));
    }
}
