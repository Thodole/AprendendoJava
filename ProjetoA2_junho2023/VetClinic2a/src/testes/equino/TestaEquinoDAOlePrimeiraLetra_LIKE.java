package testes.equino;

import persistencia.EquinoDAO;

public class TestaEquinoDAOlePrimeiraLetra_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Exibe equinos cujos nomes comecem com a letra informada
        System.out.println(EquinoDAO.leTodosPrimeiraLetra('P'));
    }
}
