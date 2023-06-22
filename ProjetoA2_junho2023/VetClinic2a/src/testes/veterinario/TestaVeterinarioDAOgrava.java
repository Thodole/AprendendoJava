package testes.veterinario;

import modelo.Veterinario;
import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra um novo veterinario (informe ID e Nome do veterinario)
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(123454);
        veterinario.setNome("Saulo Merdeiros");
        
        System.out.println(VeterinarioDAO.grava(veterinario));
    }
}
