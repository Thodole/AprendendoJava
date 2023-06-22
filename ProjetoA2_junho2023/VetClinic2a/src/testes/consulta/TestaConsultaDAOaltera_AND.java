package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // Altera dados de uma consulta. Requer IDs da consulta e do Veterinário
        System.out.println(ConsultaDAO.alteraAnd(
                                                 6,    // Nova ID da consulta
                                                 "21/06/2023 - 17:31",   // Data+hora da consulta
                                                 "Rotina + escovação",   // Procedimentos feitos
                                                 123453,    // ID do veterinário
                                                 3,    // ID do atendente
                                                 3,    // ID do equino
                                                 0,    // ID do canino
                                                 0,    // ID do felino
                                                 6,    // ID da consulta
                                                 123452)); // ID do veterinário
    }
}
