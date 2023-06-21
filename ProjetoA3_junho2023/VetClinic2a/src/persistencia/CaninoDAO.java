package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Canino;

public class CaninoDAO {
    
    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Canino> leTodos() throws Exception {

        List<Canino> listCaninos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM canino";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Canino canis = new Canino();

                canis.setIdCanino(rs.getInt("idCanino"));

                canis.setNome(rs.getString("nome"));
                
                canis.setIdade(rs.getInt("idade"));

                listCaninos.add(canis);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listCaninos;

    }
    
    public static Canino leUm(int idCanino) throws Exception {

        Canino canis = new Canino();

        try {

            String sql = "SELECT * FROM Canino WHERE idCanino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idCanino);

            rs = st.executeQuery();

            if (rs.next()) {

                canis.setIdCanino(rs.getInt("idCanino"));

                canis.setNome(rs.getString("nome"));
                
                canis.setIdade(rs.getInt("idade"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return canis;

    }

    public static int grava(Canino canino) throws Exception {

        int retorno = 0;

        try {

            String sql = "INSERT INTO Canino (idCanino, nome, idade) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, canino.getIdCanino());

            st.setString(2, canino.getNome());
            
            st.setInt(3, canino.getIdade());

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int altera(int novoIdCanino, String nome, int idade, int IdCanino) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE canino SET idCanino = ?, nome = ?, idade = ? WHERE idCanino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, novoIdCanino);
            
            st.setString(2, nome);

            st.setInt(3, idade);
            
            st.setInt(4, IdCanino);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static int alteraAnd(int IdCanino, int novoIdCanino, String novoNome, int idade, String nome) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE canino SET idCanino = ?, nome = ?, idade = ? WHERE idCanino = ? AND nome = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, novoIdCanino);
            
            st.setString(2, novoNome);

            st.setInt(3, idade);
            
            st.setInt(4, IdCanino);
            
            st.setString(5, nome);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static int alteraNotIn(String novoNome, int idA, int idB) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE canino SET nome = ? WHERE idCanino NOT IN(0, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, novoNome);

            st.setInt(2, idA);
            
            st.setInt(3, idB);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(int idCanino) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM canino WHERE idCanino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idCanino);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static List<Canino> leTodosPrimeiraLetra(char primeiraLetra) throws Exception {

        List<Canino> listCaninos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM canino WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, primeiraLetra + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Canino canis = new Canino();

                canis.setIdCanino(rs.getInt("idCanino"));

                canis.setNome(rs.getString("nome"));
                
                canis.setIdade(rs.getInt("idade"));

                listCaninos.add(canis);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listCaninos;

    }
    
    public static List<Canino> lePorId(int idA, int idB) throws Exception {

        List<Canino> listCaninos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM canino WHERE idCanino IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Canino canis = new Canino();

                canis.setIdCanino(rs.getInt("idCanino"));

                canis.setNome(rs.getString("nome"));
                
                canis.setIdade(rs.getInt("idade"));

                listCaninos.add(canis);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listCaninos;

    }
    
    public static List<Canino> leTodosPorNaoEntre(int idA, int idB) throws Exception {

        List<Canino> listCaninos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM canino WHERE idCanino NOT BETWEEN ? AND ? AND idCanino != 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Canino canis = new Canino();

                canis.setIdCanino(rs.getInt("idCanino"));

                canis.setNome(rs.getString("nome"));
                
                canis.setIdade(rs.getInt("idade"));

                listCaninos.add(canis);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listCaninos;

    }
    
}
