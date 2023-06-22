package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe veterinario cuja ID não esteja entre as IDs informadas
        System.out.println(VeterinarioDAO.leTodosPorNaoEntre(123452, 123453));
    }
}
