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
        felino.setIdFelino(-99);
        felino.setNome("");
        felino.setIdade(0);
        
        System.out.println(FelinoDAO.grava(felino));
    }
}
