package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Informa todos os veterinarios cadastrados
        System.out.println(VeterinarioDAO.leTodos());
    }
}
