package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Atendente;
import modelo.Juridica;

public class JuridicaDAO {

    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static List<Juridica> leTodos() throws Exception {

        List<Juridica> listJuridicas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM JURIDICA";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Juridica juridica = new Juridica();

                juridica.setCnpj(rs.getString("cnpj"));

                juridica.setNome(rs.getString("nome"));

                juridica.setIdade(rs.getInt("idade"));

                juridica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

                listJuridicas.add(juridica);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listJuridicas;

    }

    public static Juridica leUm(String cnpj) throws Exception {

        Juridica juridica = new Juridica();

        try {

            String sql = "SELECT * FROM Juridica WHERE cnpj = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cnpj);

            rs = st.executeQuery();

            if (rs.next()) {

                juridica.setCnpj(rs.getString("cnpj"));

                juridica.setNome(rs.getString("nome"));

                juridica.setIdade(rs.getInt("idade"));

                juridica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return juridica;

    }

    public static int grava(Juridica juridica) throws Exception {

        int ret = 0;

        try {

            String sql = "INSERT INTO Juridica (cnpj,nome,idade,atendente_matr) VALUES (?, ?, ?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, juridica.getCnpj());

            st.setString(2, juridica.getNome());

            st.setInt(3, juridica.getIdade());

            st.setInt(4, juridica.getAtendente().getMatr());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int altera(Juridica juridica) throws Exception {

        int ret = 0;

        try {

            String sql = "UPDATE Juridica SET nome = ?, idade = ?, atendente_matr = ? WHERE cnpj = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, juridica.getNome());

            st.setInt(2, juridica.getIdade());

            st.setInt(3, juridica.getAtendente().getMatr());

            st.setString(4, juridica.getCnpj());

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }

    public static int exclui(String cnpj) throws Exception {

        int ret = 0;

        try {

            String sql = "DELETE FROM Juridica WHERE cnpj = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cnpj);

            ret = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return ret;

    }
    
    public static List<Juridica> lePorCnpj(String cnpj1, String cnpj2) throws Exception {

        List<Juridica> listJuridicas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM juridica WHERE cnpj IN(?, ?) ";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cnpj1);
            
            st.setString(2, cnpj2);
            
            rs = st.executeQuery();

            while (rs.next()) {

                Juridica juridica = new Juridica();

                juridica.setCnpj(rs.getString("cnpj"));

                juridica.setNome(rs.getString("nome"));

                juridica.setIdade(rs.getInt("idade"));

                juridica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

                listJuridicas.add(juridica);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listJuridicas;

    }
    
    public static List<Juridica> lePorCnpjOuIdade(String cnpj, int idade) throws Exception {
        
        List<Juridica> listJuridicas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM juridica WHERE cnpj = ? OR idade > ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setString(1, cnpj);
            
            st.setInt(2, idade);
            
            rs = st.executeQuery();

            while (rs.next()) {

                Juridica juridica = new Juridica();

                juridica.setCnpj(rs.getString("cnpj"));

                juridica.setNome(rs.getString("nome"));

                juridica.setIdade(rs.getInt("idade"));

                juridica.setAtendente(AtendenteDAO.leUm(rs.getInt("atendente_matr")));

                listJuridicas.add(juridica);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listJuridicas;
        
    }
    
    public static List<Juridica> leTodosInnerJoin(int matr1, int matr2, int idade) throws Exception {
        
        List<Juridica> listaFisica = new ArrayList<>();
        
        try {
            
            String sql = "SELECT a.matr, a.nome, j.cnpj, j.nome, j.idade " +
                         "FROM atendente a INNER JOIN juridica j " +
                         "ON a.matr = j.Atendente_matr " +
                         "WHERE a.matr IN (?, ?) AND j.idade = ?";
            
            connection = GerenteDeConexao.getConnection();
            
            st = connection.prepareStatement(sql);
            
            st.setInt(1, matr1);
            
            st.setInt(2, matr2);
            
            st.setInt(3, idade);
            
            rs = st.executeQuery();
            
            while (rs.next()) {
                
                Juridica jur = new Juridica();
                
                jur.setCnpj(rs.getString("j.cnpj"));
                
                jur.setNome(rs.getString("j.nome"));
                
                jur.setIdade(rs.getInt("j.idade"));
                
                Atendente atendente = new Atendente(rs.getInt("a.matr"), rs.getString("a.nome"));
                
                jur.setAtendente(atendente);
                
                listaFisica.add(jur);
            }
            
            st.close();
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
            
        }
        
        return listaFisica;
        
    }

}
