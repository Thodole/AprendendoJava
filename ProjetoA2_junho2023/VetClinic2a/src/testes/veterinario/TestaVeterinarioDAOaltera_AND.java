package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Altera o nome de um veterinario (informe: novo nome, ID e nome antigo)
        System.out.println(VeterinarioDAO.alteraAnd("Saulo Medeiros", 123454, "Saulo Merdeiros"));
    }
}
