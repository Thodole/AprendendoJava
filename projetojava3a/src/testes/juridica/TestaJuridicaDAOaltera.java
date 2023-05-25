package testes.juridica;

import modelo.Atendente;
import modelo.Juridica;
import persistencia.JuridicaDAO;

public class TestaJuridicaDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        Juridica juridica = new Juridica();
        juridica.setNome("WX Exportações");
        juridica.setIdade(20);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(3);
        juridica.setAtendente(atendente);
        
        juridica.setCnpj("909090");
        
        System.out.println(JuridicaDAO.altera(juridica));
    }
    
}
