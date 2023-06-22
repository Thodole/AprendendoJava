package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOlePorData_LIKE {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
            Exibe consultas realizadas na data informada.
            Atenção! Mantenha esta formatação de data: "DD/MM/AAAA"
        */
        System.out.println(ConsultaDAO.leTodosPorData("20/06/2023"));
    }
}
