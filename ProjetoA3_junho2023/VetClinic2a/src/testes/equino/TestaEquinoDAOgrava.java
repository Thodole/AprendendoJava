package testes.equino;

import modelo.Equino;
import persistencia.EquinoDAO;

public class TestaEquinoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Equino equino = new Equino();
        equino.setIdEquino(-99);
        equino.setNome("");
        equino.setIdade(0);
        
        System.out.println(EquinoDAO.grava(equino));
    }
}
