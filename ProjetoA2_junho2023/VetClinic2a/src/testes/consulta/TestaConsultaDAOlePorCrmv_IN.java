package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOlePorCrmv_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
            Exibe consultas cujas IDs dos veterinários pertençam ao grupo de IDs
            informadas.
        */
        System.out.println(ConsultaDAO.lePorCrmv(123452, 123453));
    }
    
}
