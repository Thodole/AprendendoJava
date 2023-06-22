package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOleNaoEntre_NOT_BETWEEN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
          Consulta e exibe consultas cujas IDs de veterinários não estejam entre
          as IDs informadas.
        */
        System.out.println(ConsultaDAO.lePorNaoEntre(123452, 123453));
    }
}
