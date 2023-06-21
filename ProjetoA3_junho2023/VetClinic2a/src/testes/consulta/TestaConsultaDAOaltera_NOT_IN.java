package testes.consulta;

import testes.atendente.*;
import persistencia.AtendenteDAO;

public class TestaConsultaDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(AtendenteDAO.alteraNotIn("Larissa Silva", 2, 3));
    }
}
