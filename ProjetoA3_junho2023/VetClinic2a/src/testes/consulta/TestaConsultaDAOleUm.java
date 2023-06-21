package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOleUm {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.leUm(1));
    }
}
