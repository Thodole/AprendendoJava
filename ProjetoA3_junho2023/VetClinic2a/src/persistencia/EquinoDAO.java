package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Equino;

public class EquinoDAO {
    
    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Equino> leTodos() throws Exception {

        List<Equino> listEquinos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM equino";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Equino horse = new Equino();

                horse.setIdEquino(rs.getInt("idEquino"));

                horse.setNome(rs.getString("nome"));
                
                horse.setIdade(rs.getInt("idade"));

                listEquinos.add(horse);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listEquinos;

    }
    
    public static Equino leUm(int idEquino) throws Exception {

        Equino horse = new Equino();

        try {

            String sql = "SELECT * FROM Equino WHERE idEquino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idEquino);

            rs = st.executeQuery();

            if (rs.next()) {

                horse.setIdEquino(rs.getInt("idEquino"));

                horse.setNome(rs.getString("nome"));
                
                horse.setIdade(rs.getInt("idade"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return horse;

    }

    public static int grava(Equino equino) throws Exception {

        int retorno = 0;

        try {

            String sql = "INSERT INTO Equino (idEquino, nome, idade) VALUES (?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, equino.getIdEquino());

            st.setString(2, equino.getNome());
            
            st.setInt(3, equino.getIdade());

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int altera(int IdEquino, int novoIdEquino, String nome, int idade) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE equino SET idEquino = ?, nome = ?, idade = ? WHERE idEquino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, novoIdEquino);
            
            st.setString(2, nome);

            st.setInt(3, idade);
            
            st.setInt(4, IdEquino);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int exclui(int idEquino) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM equino WHERE idEquino = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idEquino);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
}
