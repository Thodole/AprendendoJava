package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(VeterinarioDAO.leTodosPorNaoEntre(123452, 123453));
    }
}

