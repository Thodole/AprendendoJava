package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;
import modelo.Fisica;

public class FisicaDAO {

    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Fisica> leTodos() throws Exception {

        List<Fisica> listFisicas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM fisica";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Fisica fisica = new Fisica();

                fisica.setCpf(rs.getString("cpf"));

                fisica.setNome(rs.getString("nome"));

                fisica.setIdade(rs.getInt("idade"));

                fisica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

                listFisicas.add(fisica);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listFisicas;

    }

    public static Fisica leUm(String cpf) throws Exception {

        Fisica fisica = new Fisica();

        try {

            String sql = "SELECT * FROM fisica WHERE cpf = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            rs = st.executeQuery();

            if (rs.next()) {

                fisica.setCpf(rs.getString("cpf"));

                fisica.setNome(rs.getString("nome"));

                fisica.setIdade(rs.getInt("idade"));

                fisica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return fisica;

    }

    public static int grava(Fisica fisica) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Fisica (cpf,nome,idade,atendente_matr) VALUES (?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, fisica.getCpf());

            st.setString(2, fisica.getNome());

            st.setInt(3, fisica.getIdade());

            st.setInt(4, fisica.getAtendente().getMatr());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(Fisica fisica, String novoCpf) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE Fisica SET cpf = ?, nome = ?, idade = ?, atendente_matr = ? WHERE cpf = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, novoCpf);
            
            st.setString(2, fisica.getNome());

            st.setInt(3, fisica.getIdade());

            st.setInt(4, fisica.getAtendente().getMatr());

            st.setString(5, fisica.getCpf());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(String cpf) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM Fisica WHERE cpf = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cpf);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static List<Fisica> leTodosIdade15a30anos() throws Exception {

        List<Fisica> listFisicas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM fisica WHERE idade > 14 AND idade < 31";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Fisica f = new Fisica();

                f.setCpf(rs.getString("cpf"));

                f.setNome(rs.getString("nome"));

                f.setIdade(rs.getInt("idade"));

                f.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

                listFisicas.add(f);

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return listFisicas;
    }
    
    public static List<Fisica> leTodosInnerJoin(char letra, int menor, int maior) throws Exception {
        
        List<Fisica> listaFisica = new ArrayList<>();
        
        try {
            
            String sql = "SELECT a.matr, a.nome, f.cpf, f.nome, f.idade " +
                         "FROM atendente a INNER JOIN fisica f " +
                         "ON a.matr = f.Atendente_matr " +
                         "WHERE a.nome LIKE ? AND f.idade BETWEEN ? AND ?";
            
            connection = GerenteDeConexao.getConnection();
            
            st = connection.prepareStatement(sql);
            
            st.setString(1, letra + "%");
            
            st.setInt(2, menor);
            
            st.setInt(3, maior);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                
                Fisica fisica = new Fisica();
                
                fisica.setCpf(rs.getString("f.cpf"));
                
                fisica.setIdade(rs.getInt("f.idade"));
                
                fisica.setNome(rs.getString("f.nome"));
                
                Atendente atendente = new Atendente(rs.getInt("a.matr"), rs.getString("a.nome"));
                
                fisica.setAtendente(atendente);
                
                listaFisica.add(fisica);
            }
            
            st.close();
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        
        return listaFisica;
        
    }

}
