package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOlePorId_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Consulta e exibe atendentes pertencentes ao grupo de IDs informadas
        System.out.println(AtendenteDAO.lePorId(2, 3));
    }
    
}
