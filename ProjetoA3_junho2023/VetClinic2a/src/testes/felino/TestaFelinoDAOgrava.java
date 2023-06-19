package testes.felino;

import modelo.Felino;
import persistencia.FelinoDAO;

public class TestaFelinoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Felino felino = new Felino();
        felino.setIdFelino(11);
        felino.setNome("PamPamPam");
        felino.setIdade(1);
        
        System.out.println(FelinoDAO.grava(felino));
    }
}
