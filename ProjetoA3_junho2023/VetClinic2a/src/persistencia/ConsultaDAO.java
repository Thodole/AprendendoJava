package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Consulta;

public class ConsultaDAO {
    
    protected static Connection connection;

    protected static PreparedStatement st;

    protected static ResultSet rs;

    public static int grava(Consulta consulta) throws Exception {

        int retorno = 0;

        try {

            String sql = "INSERT INTO Consulta (idConsulta, " +
                                               "data, " +
                                               "Procedimento, " +
                                               "Veterinario_idVeterinario, " +
                                               "Atendente_idAtendente, " +
                                               "Equino_idEquino, " +
                                               "Canino_idCanino, " +
                                               "Felino_idFelino) " +
                                               "VALUES(?,?,?,?,?,?,?,?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, consulta.getIdConsulta());

            st.setString(2, consulta.getDataHora());
            
            st.setString(3, consulta.getProcedimento());
            
            st.setInt(4, consulta.getVeterinario().getIdVet());
                    
            st.setInt(5, consulta.getAtendente().getIdAtend());
                    
            st.setInt(6, consulta.getEquino().getIdEquino());
            
            st.setInt(7, consulta.getCanino().getIdCanino());
                    
            st.setInt(8, consulta.getFelino().getIdFelino());

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int altera(Consulta consulta, int novoIdConsulta, String data, String procedimento, int idVet, int idAtend, int idEqu, int idCan, int idFel) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE Consulta SET idConsulta, " +
                                              "data, " +
                                              "Procedimento, " +
                                              "Veterinario_idVeterinario, " +
                                              "Atendente_idAtendente, " +
                                              "Equino_idEquino, " +
                                              "Canino_idCanino, " +
                                              "Felino_idFelino) " +
                                              "WHERE idConsulta = ?";

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
    
    public static Consulta leUm(int idConsulta) throws Exception {

        Consulta consult = new Consulta();

        try {

            String sql = "SELECT * FROM consulta WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsulta);

            rs = st.executeQuery();

            if (rs.next()) {

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));
                
                consult.setProcedimento(rs.getString("Procedimento"));
                
                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("idFelino")));

            }

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return consult;

    }
    
    public static List<Consulta> leTodos() throws Exception {

        List<Consulta> listConsultas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM consulta";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            rs = st.executeQuery();

            while (rs.next()) {

                Consulta consult = new Consulta();

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));

                consult.setProcedimento(rs.getString("Procedimento"));

                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("idFelino")));

                listConsultas.add(consult);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }
    
    ...
    
}
