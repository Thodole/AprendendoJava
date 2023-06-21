package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera_AND {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.alteraAnd(
                                                 3,    // Nova ID da consulta
                                                 "20/06/2023 - 18:00",   // Data+hora da consulta
                                                 "Rotina + escovação",   // Procedimentos feitos
                                                 123453,    // ID do veterinário
                                                 3,    // ID do atendente
                                                 3,    // ID do equino
                                                 0,    // ID do canino
                                                 0,    // ID do felino
                                                 3,    // ID da consulta
                                                 123453)); // ID do veterinário
    }
}
