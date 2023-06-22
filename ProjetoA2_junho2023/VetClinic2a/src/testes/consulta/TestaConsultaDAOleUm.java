package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Mostra a consulta cuja ID for informada
        System.out.println(ConsultaDAO.leUm(5));
    }
}
