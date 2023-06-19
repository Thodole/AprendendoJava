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

    public static int altera(int IdFelino, int novoIdFelino, String nome, int idade) throws Exception {

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
    
}
