package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
            Altera dados de um equino registrado (informe nova ID, novo nome,
            nova idade, ID original)
        */
        System.out.println(EquinoDAO.altera(4, "Equino Teste", 6, 4));
    }
}
