package testes.juridica;

import modelo.Atendente;
import modelo.Juridica;
import persistencia.JuridicaDAO;

public class TestaJuridicaDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Juridica juridica = new Juridica();
        juridica.setCnpj("909090");
        juridica.setNome("ABX Exportações");
        juridica.setIdade(2);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(1);
        
        juridica.setAtendente(atendente);
        
        System.out.println(JuridicaDAO.grava(juridica));
    }
    
}
