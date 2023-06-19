package testes.veterinario;

import modelo.Veterinario;
import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Veterinario veterinario = new Veterinario();
        veterinario.setIdVet(1);
        veterinario.setNome("Gabriel Perezz");
        
        System.out.println(VeterinarioDAO.grava(veterinario));
    }
}
