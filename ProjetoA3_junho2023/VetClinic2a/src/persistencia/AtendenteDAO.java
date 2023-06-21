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

            String sql = "SELECT * FROM atendente";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Atendente atend = new Atendente();

                atend.setIdAtend(rs.getInt("idAtendente"));

                atend.setNome(rs.getString("nome"));

                listAtendentes.add(atend);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listAtendentes;

    }
    
    public static Atendente leUm(int idAtendente) throws Exception {

        Atendente atend = new Atendente();

        try {

            String sql = "SELECT * FROM Atendente WHERE idAtendente = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idAtendente);

            rs = st.executeQuery();

            if (rs.next()) {

                atend.setIdAtend(rs.getInt("idAtendente"));

                atend.setNome(rs.getString("nome"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return atend;

    }

    public static int grava(Atendente atendente) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Atendente (idAtendente, nome) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, atendente.getIdAtend());

            st.setString(2, atendente.getNome());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(int novaIdAtend, String nome, int idAtend) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE atendente SET idAtendente = ?, nome = ? WHERE idAtendente = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novaIdAtend);
            
            st.setString(2, nome);

            st.setInt(3, idAtend);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int idAtend) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM atendente WHERE idAtendente = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idAtend);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static List<Atendente> leTodosPrimeiraLetra(char primeiraLetra) throws Exception {

        List<Atendente> listAtendentes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM atendente WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, primeiraLetra + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Atendente atend = new Atendente();

                atend.setIdAtend(rs.getInt("idAtendente"));

                atend.setNome(rs.getString("nome"));

                listAtendentes.add(atend);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listAtendentes;

    }
    
    public static List<Atendente> lePorId(int idA, int idB) throws Exception {

        List<Atendente> listAtendentes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM atendente WHERE idAtendente IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Atendente atend = new Atendente();

                atend.setIdAtend(rs.getInt("idAtendente"));

                atend.setNome(rs.getString("nome"));

                listAtendentes.add(atend);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listAtendentes;

    }
    
    public static List<Atendente> leTodosPorNaoEntre(int idA, int idB) throws Exception {

        List<Atendente> listAtendentes = new ArrayList<>();

        try {

            String sql = "SELECT * FROM atendente WHERE idAtendente NOT BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, idA);
            
            st.setInt(2, idB);

            rs = st.executeQuery();

            while (rs.next()) {

                Atendente atend = new Atendente();

                atend.setIdAtend(rs.getInt("idAtendente"));

                atend.setNome(rs.getString("nome"));

                listAtendentes.add(atend);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listAtendentes;

    }
    
}
