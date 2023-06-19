package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(VeterinarioDAO.exclui(11));
    }
}