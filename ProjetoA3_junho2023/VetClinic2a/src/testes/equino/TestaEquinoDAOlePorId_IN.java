package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOlePorId_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe equinos pertencentes ao grupo de IDs informadas
        System.out.println(EquinoDAO.lePorId(2, 3));
    }
    
}
