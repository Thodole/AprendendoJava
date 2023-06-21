package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Felino;

public class FelinoDAO {
    
    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Felino> leTodos() throws Exception {

        List<Felino> listFelinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM felino";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Felino neko = new Felino();

                neko.setIdFelino(rs.getInt("idFelino"));

                neko.setNome(rs.getString("nome"));
                
                neko.setIdade(rs.getInt("idade"));

                listFelinos.add(neko);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listFelinos;

    }
    
    public static Felino leUm(int idFelino) throws Exception {

        Felino neko = new Felino();

        try {

            String sql = "SELECT * FROM Felino WHERE idFelino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idFelino);

            rs = st.executeQuery();

            if (rs.next()) {

                neko.setIdFelino(rs.getInt("idFelino"));

                neko.setNome(rs.getString("nome"));
                
                neko.setIdade(rs.getInt("idade"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return neko;

    }

    public static int grava(Felino felino) throws Exception {

        int retorno = 0;

        try {

            String sql = "INSERT INTO Felino (idFelino, nome, idade) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, felino.getIdFelino());

            st.setString(2, felino.getNome());
            
            st.setInt(3, felino.getIdade());

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int altera(int novoIdFelino, String nome, int idade, int IdFelino) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE felino SET idFelino = ?, nome = ?, idade = ? WHERE idFelino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, novoIdFelino);
            
            st.setString(2, nome);

            st.setInt(3, idade);
            
            st.setInt(4, IdFelino);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int alteraAnd(int novoIdFelino, String novoNome, int idade, int IdFelino, String nome) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE felino SET idFelino = ?, nome = ?, idade = ? WHERE idFelino = ? AND nome = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, novoIdFelino);
            
            st.setString(2, novoNome);

            st.setInt(3, idade);
            
            st.setInt(4, IdFelino);
            
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

            String sql = "UPDATE felino SET nome = ? WHERE idFelino NOT IN(0, ?, ?)";

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

    public static int exclui(int idFelino) throws Exception {

        int retorno = 0;

        try {

            String sql = "DELETE FROM felino WHERE idFelino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idFelino);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static List<Felino> leTodosPrimeiraLetra(char primeiraLetra) throws Exception {

        List<Felino> listFelinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM felino WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, primeiraLetra + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Felino neko = new Felino();

                neko.setIdFelino(rs.getInt("idFelino"));

                neko.setNome(rs.getString("nome"));
                
                neko.setIdade(rs.getInt("idade"));

                listFelinos.add(neko);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listFelinos;

    }
    
    public static List<Felino> lePorId(int idA, int idB) throws Exception {

        List<Felino> listFelinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM felino WHERE idFelino IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Felino neko = new Felino();

                neko.setIdFelino(rs.getInt("idFelino"));

                neko.setNome(rs.getString("nome"));
                
                neko.setIdade(rs.getInt("idade"));

                listFelinos.add(neko);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listFelinos;

    }
    
    public static List<Felino> leTodosPorNaoEntre(int idA, int idB) throws Exception {

        List<Felino> listFelinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM felino WHERE idFelino NOT BETWEEN ? AND ? AND idFelino != 0";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");
            
            rs = st.executeQuery();

            while (rs.next()) {

                Felino neko = new Felino();

                neko.setIdFelino(rs.getInt("idFelino"));

                neko.setNome(rs.getString("nome"));
                
                neko.setIdade(rs.getInt("idade"));

                listFelinos.add(neko);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listFelinos;

    }
    
}
