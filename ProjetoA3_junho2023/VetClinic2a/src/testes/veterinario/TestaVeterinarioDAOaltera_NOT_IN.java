package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(VeterinarioDAO.alteraNotIn("Saul Medeiros", 123451, 123452));
    }
}
