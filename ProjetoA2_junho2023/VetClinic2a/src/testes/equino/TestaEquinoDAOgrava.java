package testes.equino;

import modelo.Equino;
import persistencia.EquinoDAO;

public class TestaEquinoDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Cadastra novo equino (informe nova ID, nome e idade)
        Equino equino = new Equino();
        equino.setIdEquino(4);
        equino.setNome("Equino Teste");
        equino.setIdade(5);
        
        System.out.println(EquinoDAO.grava(equino));
    }
}
