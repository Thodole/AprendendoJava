package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Exclui a consulta cuja ID for informada
        System.out.println(ConsultaDAO.exclui(6));
    }
}
