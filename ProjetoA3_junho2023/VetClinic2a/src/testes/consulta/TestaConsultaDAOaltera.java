package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.altera(11, "20/06/2023 - 19:26", "Consulta de rotina", 3, 3, 3, 0, 0, 11));
    }
}
