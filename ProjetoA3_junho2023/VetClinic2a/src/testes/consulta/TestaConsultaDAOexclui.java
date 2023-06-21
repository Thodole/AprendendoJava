package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOexclui {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.exclui(11));
    }
}
