package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera dados de um equino registrado (informe nova ID, novo nome,
        nova idade, ID original e nome original do equino)
        */
        System.out.println(EquinoDAO.alteraAnd(4, "Teste Equino", 4, 4, "Equino Teste"));
    }
}
