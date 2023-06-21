package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera_IGUAL {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.altera(5, "21/06/2023 - 10:30", "Consulta de rotina", 1, 1, 0, 2, 0, 5));
    }
}
