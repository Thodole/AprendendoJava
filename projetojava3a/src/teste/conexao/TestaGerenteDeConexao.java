/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.conexao;

import java.sql.SQLException;
import persistencia.GerenteDeConexao;

/**
 *
 * @author 343501
 */
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