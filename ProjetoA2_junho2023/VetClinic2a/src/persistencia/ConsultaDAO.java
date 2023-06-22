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
    
    public static int altera(int novoIdConsulta,
                             String data, 
                             String procedimento, 
                             int idVet, 
                             int idAtend, 
                             int idEqu, 
                             int idCan, 
                             int idFel, 
                             int idConsulta) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE consulta SET idConsulta = ?, data = ?, Procedimento = ?, Veterinario_idVeterinario = ?, Atendente_idAtendente = ?, Equino_idEquino = ?, Canino_idCanino = ?, Felino_idFelino = ? WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novoIdConsulta);

            st.setString(2, data);

            st.setString(3, procedimento);

            st.setInt(4, idVet);
            
            st.setInt(5, idAtend);
            
            st.setInt(6, idEqu);
            
            st.setInt(7, idCan);
            
            st.setInt(8, idFel);
            
            st.setInt(9, idConsulta);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int alteraNotIn(int novoIdConsulta,
                                  String data, 
                                  String procedimento, 
                                  int idVet, 
                                  int idAtend, 
                                  int idEqu, 
                                  int idCan, 
                                  int idFel,
                                  int idOut1, 
                                  int idOut2) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE consulta SET idConsulta = ?, " +
                                             "data = ?, " +
                                             "Procedimento = ?, " +
                                             "Veterinario_idVeterinario = ?, " +
                                             "Atendente_idAtendente = ?, " +
                                             "Equino_idEquino = ?, " +
                                             "Canino_idCanino = ?, " +
                                             "Felino_idFelino = ? " +
                                             "WHERE Veterinario_idVeterinario NOT IN (?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novoIdConsulta);

            st.setString(2, data);

            st.setString(3, procedimento);

            st.setInt(4, idVet);
            
            st.setInt(5, idAtend);
            
            st.setInt(6, idEqu);
            
            st.setInt(7, idCan);
            
            st.setInt(8, idFel);
            
            st.setInt(9, idOut1);
            
            st.setInt(10, idOut2);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static int alteraAnd(int novoIdConsulta,
                                  String data, 
                                  String procedimento, 
                                  int idVet, 
                                  int idAtend, 
                                  int idEqu, 
                                  int idCan, 
                                  int idFel,
                                  int idConsult, 
                                  int idVeter) throws Exception {

        int retorno = 0;

        try {

            String sql = "UPDATE consulta SET idConsulta = ?, " +
                                             "data = ?, " +
                                             "Procedimento = ?, " +
                                             "Veterinario_idVeterinario = ?, " +
                                             "Atendente_idAtendente = ?, " +
                                             "Equino_idEquino = ?, " +
                                             "Canino_idCanino = ?, " +
                                             "Felino_idFelino = ? " +
                                             "WHERE idConsulta = ? " +
                                             "AND Veterinario_idVeterinario = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, novoIdConsulta);

            st.setString(2, data);

            st.setString(3, procedimento);

            st.setInt(4, idVet);
            
            st.setInt(5, idAtend);
            
            st.setInt(6, idEqu);
            
            st.setInt(7, idCan);
            
            st.setInt(8, idFel);
            
            st.setInt(9, idConsult);
            
            st.setInt(10, idVeter);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static Consulta leUm(int idConsult) throws Exception {

        Consulta consult = new Consulta();

        try {

            String sql = "SELECT * FROM consulta WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsult);

            rs = st.executeQuery();

            if (rs.next()) {

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));
                
                consult.setProcedimento(rs.getString("Procedimento"));
                
                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("Veterinario_idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("Equino_idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("Canino_idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("Felino_idFelino")));
                
                if (rs.getInt("Equino_idEquino") > 0) {
                    consult.setTipoPaciente(2);
                } else if (rs.getInt("Canino_idCanino") > 0) {
                    consult.setTipoPaciente(1);
                } else if (rs.getInt("Felino_idFelino") > 0) {
                    consult.setTipoPaciente(3);
                } else
                    consult.setTipoPaciente(0);
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

                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("Veterinario_idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("Equino_idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("Canino_idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("Felino_idFelino")));

                if (rs.getInt("Equino_idEquino") > 0) {
                    consult.setTipoPaciente(2);
                } else if (rs.getInt("Canino_idCanino") > 0) {
                    consult.setTipoPaciente(1);
                } else if (rs.getInt("Felino_idFelino") > 0) {
                    consult.setTipoPaciente(3);
                } else
                    consult.setTipoPaciente(0);
                
                listConsultas.add(consult);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }
    
    public static int exclui(int idConsult) throws Exception {

        int retorno = 0;

        try {

            String sql = "DELETE FROM consulta WHERE idConsulta = ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, idConsult);

            retorno = st.executeUpdate();

            st.close();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return retorno;

    }
    
    public static List<Consulta> leTodosPorData(String dataCheck) throws Exception {
        
        List<Consulta> listConsultas = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM consulta WHERE data LIKE ?";
            
            connection = GerenteDeConexao.getConnection();
            
            st = connection.prepareStatement(sql);

            st.setString(1, dataCheck + "%");

            rs = st.executeQuery();
            
            while (rs.next()) {
                
                Consulta consult = new Consulta();

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));

                consult.setProcedimento(rs.getString("Procedimento"));

                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("Veterinario_idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("Equino_idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("Canino_idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("Felino_idFelino")));

                if (rs.getInt("Equino_idEquino") > 0) {
                    consult.setTipoPaciente(2);
                } else if (rs.getInt("Canino_idCanino") > 0) {
                    consult.setTipoPaciente(1);
                } else if (rs.getInt("Felino_idFelino") > 0) {
                    consult.setTipoPaciente(3);
                } else
                    consult.setTipoPaciente(0);
                
                listConsultas.add(consult);

            }
            
            st.close();
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());
        }
        
        return listConsultas;
        
    }
    
    public static List<Consulta> lePorCrmv(int crmv1, int crmv2) throws Exception {

        List<Consulta> listConsultas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM consulta WHERE Veterinario_idVeterinario IN(?, ?)";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, crmv1);
            
            st.setInt(2, crmv2);
            
            rs = st.executeQuery();

            while (rs.next()) {

                Consulta consult = new Consulta();

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));

                consult.setProcedimento(rs.getString("Procedimento"));

                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("Veterinario_idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("Equino_idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("Canino_idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("Felino_idFelino")));

                if (rs.getInt("Equino_idEquino") > 0) {
                    consult.setTipoPaciente(2);
                } else if (rs.getInt("Canino_idCanino") > 0) {
                    consult.setTipoPaciente(1);
                } else if (rs.getInt("Felino_idFelino") > 0) {
                    consult.setTipoPaciente(3);
                } else
                    consult.setTipoPaciente(0);
                
                listConsultas.add(consult);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }
    
    public static List<Consulta> lePorNaoEntre(int crmvA, int crmvB) throws Exception {

        List<Consulta> listConsultas = new ArrayList<>();

        try {

            String sql = "SELECT * FROM consulta WHERE Veterinario_idVeterinario NOT BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();

            st = connection.prepareStatement(sql);

            st.setInt(1, crmvA);
            
            st.setInt(2, crmvB);
            
            rs = st.executeQuery();

            while (rs.next()) {

                Consulta consult = new Consulta();

                consult.setIdConsulta(rs.getInt("idConsulta"));

                consult.setDataHora(rs.getString("data"));

                consult.setProcedimento(rs.getString("Procedimento"));

                consult.setVeterinario(VeterinarioDAO.leUm(rs.getInt("Veterinario_idVeterinario")));
                
                consult.setAtendente(AtendenteDAO.leUm(rs.getInt("Atendente_idAtendente")));
                
                consult.setEquino(EquinoDAO.leUm(rs.getInt("Equino_idEquino")));
                
                consult.setCanino(CaninoDAO.leUm(rs.getInt("Canino_idCanino")));
                
                consult.setFelino(FelinoDAO.leUm(rs.getInt("Felino_idFelino")));

                if (rs.getInt("Equino_idEquino") > 0) {
                    consult.setTipoPaciente(2);
                } else if (rs.getInt("Canino_idCanino") > 0) {
                    consult.setTipoPaciente(1);
                } else if (rs.getInt("Felino_idFelino") > 0) {
                    consult.setTipoPaciente(3);
                } else
                    consult.setTipoPaciente(0);
                
                listConsultas.add(consult);

            }

            st.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return listConsultas;

    }
    
}
