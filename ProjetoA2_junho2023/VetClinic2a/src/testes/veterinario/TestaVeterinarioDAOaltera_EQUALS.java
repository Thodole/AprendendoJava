package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Altera ID e nome de veter. (infomrme nova ID, novo nome e ID antiga)
        System.out.println(VeterinarioDAO.altera(123454, "Saul Medeiros", 123454));
    }
}
