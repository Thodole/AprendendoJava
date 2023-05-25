package testes.juridica;

import persistencia.JuridicaDAO;

public class TestaJuridicaDAOleTodos {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(JuridicaDAO.leTodos());
    }
    
}
