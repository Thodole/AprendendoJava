package testes.consulta;

import persistencia.ConsultaDAO;

public class TestaConsultaDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /*
            Altera dados de todas as cousultas cujas IDs de Veterinário não per_
            tençam ao grupo informado.
            ATENÇÃO! Somente use esse método se houver apenas três veterinários,
            Sobe o risco de alterar várias consultas ao mesmo tempo!
        */
        System.out.println(ConsultaDAO.alteraNotIn(
                                                 6,    // Nova ID da consulta
                                                 "21/06/2023 - 17:31",   // Data+hora da consulta
                                                 "Rotina + escovação",   // Procedimentos feitos
                                                 123453,    // ID do veterinário
                                                 3,    // ID do atendente
                                                 3,    // ID do equino
                                                 0,    // ID do canino
                                                 0,    // ID do felino
                                                 // Grupo de IDs a preservar
                                                 123452, 123451));
    }
}
