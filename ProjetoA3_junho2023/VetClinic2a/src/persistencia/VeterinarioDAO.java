package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Veterinario;

public class VeterinarioDAO {
    
    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Veterinario> leTodos() throws Exception {

        List<Veterinario> listVeterinarios = new ArrayList<>();

        try {

            String sql = "SELECT * FROM veterinario";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Veterinario vet = new Veterinario();

                vet.setIdVet(rs.getInt("idVeterinario"));

                vet.setNome(rs.getString("nome"));

                listVeterinarios.add(vet);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listVeterinarios;

    }
    
    public static Veterinario leUm(int idVeter) throws Exception {

        Veterinario vet = new Veterinario();

        try {

            String sql = "SELECT * FROM veterinario WHERE idVeterinario = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idVeter);

            rs = st.executeQuery();

            if (rs.next()) {

                vet.setIdVet(rs.getInt("idVeterinario"));

                vet.setNome(rs.getString("nome"));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return vet;

    }

    public static int grava(Veterinario veterinario) throws Exception {

        int retorno = 0;

        try {

            String sql = "INSERT INTO Veterinario (idVeterinario, nome) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, veterinario.getIdVet());

            st.setString(2, veterinario.getNome());

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int altera(int novaIdVeter, String nome, int idVeter) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE veterinario SET idVeterinario = ?, nome = ? WHERE idVeterinario = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novaIdVeter);
            
            st.setString(2, nome);

            st.setInt(3, idVeter);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int alteraNotIn(String nome, int idA, int idB) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE veterinario SET nome = ? WHERE idVeterinario NOT IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, nome);

            st.setInt(2, idA);
            
            st.setInt(3, idB);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int alteraAnd(String novoNome, int oldId, String oldNome) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE veterinario SET nome = ? WHERE idVeterinario = ? AND nome = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, novoNome);

            st.setInt(2, oldId);
            
            st.setString(3, oldNome);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }

    public static int exclui(int idVeter) throws Exception {

        int retorno = 0;

        try {

            String sql = "DELETE FROM veterinario WHERE idVeterinario = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idVeter);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static List<Veterinario> leTodosPrimeiraLetra(char primeiraLetra) throws Exception {

        List<Veterinario> listVeterinarios = new ArrayList<>();

        try {

            String sql = "SELECT * FROM veterinario WHERE nome LIKE ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, primeiraLetra + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Veterinario vet = new Veterinario();

                vet.setIdVet(rs.getInt("idVeterinario"));

                vet.setNome(rs.getString("nome"));

                listVeterinarios.add(vet);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listVeterinarios;

    }
    
    public static List<Veterinario> lePorId(int idA, int idB) throws Exception {

        List<Veterinario> listVeterinarios = new ArrayList<>();

        try {

            String sql = "SELECT * FROM veterinario WHERE idVeterinario IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setString(1, idA + "%");
            
            st.setString(2, idB + "%");

            rs = st.executeQuery();

            while (rs.next()) {

                Veterinario vet = new Veterinario();

                vet.setIdVet(rs.getInt("idVeterinario"));

                vet.setNome(rs.getString("nome"));

                listVeterinarios.add(vet);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listVeterinarios;

    }
    
    public static List<Veterinario> leTodosPorNaoEntre(int idA, int idB) throws Exception {

        List<Veterinario> listVeterinarios = new ArrayList<>();

        try {

            String sql = "SELECT * FROM veterinario WHERE idVeterinario NOT BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);
            
            st.setInt(1, idA);
            
            st.setInt(2, idB);

            rs = st.executeQuery();

            while (rs.next()) {

                Veterinario vet = new Veterinario();

                vet.setIdVet(rs.getInt("idVeterinario"));

                vet.setNome(rs.getString("nome"));

                listVeterinarios.add(vet);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return listVeterinarios;

    }
    
}
