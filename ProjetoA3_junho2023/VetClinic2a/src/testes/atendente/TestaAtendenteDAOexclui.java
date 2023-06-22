package testes.atendente;

import persistencia.AtendenteDAO;

public class TestaAtendenteDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Exclui atendente por ID (informe ID do atendente a ser excluído)
        System.out.println(AtendenteDAO.exclui(4));
    }
}