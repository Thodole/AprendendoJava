package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;

public class AtendenteDAO {

    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Atendente> leTodos() throws Exception {

        List<Atendente> listAtendentes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM ATENDENTE";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Atendente a = new Atendente();

                a.setMatr(rs.getInt("matr"));

                a.setNome(rs.getString("nome"));

                listAtendentes.add(a);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listAtendentes;

    }

    public static Atendente leUm(int matr) throws Exception {

        Atendente atendente = new Atendente();

        try {

            String sql = "SELECT * FROM Atendente WHERE matr = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, matr);

            rs = st.executeQuery();

            if (rs.next()) {

                atendente.setMatr(rs.getInt("matr"));

                atendente.setNome(rs.getString("nome"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return atendente;

    }

    public static int grava(Atendente atendente) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Atendente (matr, nome) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, atendente.getMatr());

            st.setString(2, atendente.getNome());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(String nome, int matr) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE atendente SET nome = ? WHERE matr = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, nome);

            st.setInt(2, matr);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int matr) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM atendente WHERE matr = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, matr);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static List<Atendente> leMaioresQue2() throws Exception {
        
        List<Atendente> listAtendentes = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM atendente WHERE matr >= 2";
            
            connection = GerenteDeConexao.getConnection();
            
            st = connection.prepareStatement(sql);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                
                Atendente a = new Atendente();
                
                a.setMatr(rs.getInt("matr"));
                
                a.setNome(rs.getString("nome"));
                
                listAtendentes.add(a);
            }
            
            st.close();
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }
        
        return listAtendentes;
    }

    public static List<Atendente> leTodosPrimeiraLetra(char caractere) throws Exception {
        
        List<Atendente> listAtendentes = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM atendente WHERE nome LIKE ?";
            
            connection = GerenteDeConexao.getConnection();
            
            st = connection.prepareStatement(sql);

            st.setString(1, caractere + "%");

            rs = st.executeQuery();
            
            while (rs.next()) {
                
                Atendente a = new Atendente();
                
                a.setMatr(rs.getInt("matr"));
                
                a.setNome(rs.getString("nome"));
                
                listAtendentes.add(a);
            }
            
            st.close();
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }
        
        return listAtendentes;
        
    }
    
    public static int alteraMatr(int matr, int novaMatr) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE atendente SET matr = ? WHERE matr = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novaMatr);

            st.setInt(2, matr);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static int alteraMatrNome(int matr, int novaMatr, String novoNome) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE atendente SET matr = ?, nome = ? WHERE matr = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novaMatr);
            
            st.setString(2, novoNome);

            st.setInt(3, matr);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static int excluiTodosEntre(int prim, int ulti) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM atendente WHERE matr BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, prim);
            
            st.setInt(2, ulti);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static int excluiTodosPrimeiraLetra(char letra) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM atendente WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, letra + "%");

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

}
