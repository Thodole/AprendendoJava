package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOlePorData_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.leTodosPorData("21/06/2023"));
    }
}
