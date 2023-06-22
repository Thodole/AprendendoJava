package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Mostra o equino cuja ID for informada
        System.out.println(EquinoDAO.leUm(3));
    }
}
