package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOlePrimeiraLetra_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Exibe atendentes cujos nomes comecem com a letra informada
        System.out.println(AtendenteDAO.leTodosPrimeiraLetra('L'));
    }
}
