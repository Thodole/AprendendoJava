package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera_EQUALS {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println(ConsultaDAO.altera(
                                             4,   // ID da consulta (novo)
                                             "21/06/2023 - 08:45",   // ID data 
                                             "Soro e medicação",   // ID procedimentos
                                             123452,   // ID do veterinario
                                             2,   // ID do atendente
                                             0,   // ID do equino
                                             1,   // ID do canino
                                             0,   // ID do felino
                                             4)); // ID da consulta (original)
    }
}
