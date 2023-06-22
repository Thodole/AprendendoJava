package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Mostra o veterinario cuja ID for informada
        System.out.println(VeterinarioDAO.leUm(123452));
    }
}
