package testes.canino;

import modelo.Canino;
import persistencia.CaninoDAO;

public class TestaCaninoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Canino canino = new Canino();
        canino.setIdCanino(11);
        canino.setNome("Teste");
        canino.setIdade(16);
        
        System.out.println(CaninoDAO.grava(canino));
    }
}
