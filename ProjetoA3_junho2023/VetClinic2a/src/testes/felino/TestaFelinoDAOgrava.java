package testes.felino;

import modelo.Felino;
import persistencia.FelinoDAO;

public class TestaFelinoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra novo felino (informe nova ID, nome e idade)
        Felino felino = new Felino();
        felino.setIdFelino(4);
        felino.setNome("Felino Teste");
        felino.setIdade(3);
        
        System.out.println(FelinoDAO.grava(felino));
    }
}
