package testes.veterinario;

import persistencia.VeterinarioDAO;

public class TestaVeterinarioDAOaltera_NOT_IN {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        /* Altera o nome de um veterinario não pertencente ao grupo informado 
           Informe o novo nome e a ID dos veterinarios que não serão alterados
           ATENÇÃO! Somente use este método se houver 3 veterinarios listados.
        */
        System.out.println(VeterinarioDAO.alteraNotIn("Saul Medeiros", 123451, 123452));
    }
}
