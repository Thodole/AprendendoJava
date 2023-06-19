package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(VeterinarioDAO.altera(1, "Gabriel Perez", 1));
    }
}