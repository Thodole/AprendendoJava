package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOlePorId_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe veterinarios pertencentes ao grupo de IDs informadas
        System.out.println(VeterinarioDAO.lePorId(123452, 123453));
    }
}
