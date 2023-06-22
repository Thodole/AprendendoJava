package testes.canino;

import modelo.Canino;
import persistencia.CaninoDAO;

public class TestaCaninoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra novo canino (informe nova ID, nome e idade)
        Canino canino = new Canino();
        canino.setIdCanino(4);
        canino.setNome("Canino Teste");
        canino.setIdade(4);
        
        System.out.println(CaninoDAO.grava(canino));
    }
}
