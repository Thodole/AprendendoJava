package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Exclui veterinario por ID (informe ID do atendente a ser excluído)
        System.out.println(VeterinarioDAO.exclui(123454));
    }
}