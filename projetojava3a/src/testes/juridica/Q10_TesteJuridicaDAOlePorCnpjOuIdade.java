package testes.juridica;

import persistencia.JuridicaDAO;

public class Q10_TesteJuridicaDAOlePorCnpjOuIdade {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(JuridicaDAO.lePorCnpjOuIdade("404040", 5));
    }
    
}
