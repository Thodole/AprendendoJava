package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOlePorCrmv_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.lePorCrmv(123452, 123453));
    }
    
}
