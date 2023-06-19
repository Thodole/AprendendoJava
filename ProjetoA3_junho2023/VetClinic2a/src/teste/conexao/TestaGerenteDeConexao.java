package teste.conexao;

import java.sql.SQLException;
import persistencia.GerenteDeConexao;

public class TestaGerenteDeConexao {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        System.out.println(GerenteDeConexao.getConnection());
    }
}
