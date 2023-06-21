package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOlePrimeiraLetra_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(VeterinarioDAO.leTodosPrimeiraLetra('G'));
    }
}
