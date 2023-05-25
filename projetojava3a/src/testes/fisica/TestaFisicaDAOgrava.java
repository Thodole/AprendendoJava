package testes.fisica;

import modelo.Atendente;
import modelo.Fisica;
import persistencia.FisicaDAO;

public class TestaFisicaDAOgrava {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Fisica fisica = new Fisica();
        fisica.setCpf("99999999999");
        fisica.setNome("Geraldina de Sousa");
        fisica.setIdade(43);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(1);
        
        fisica.setAtendente(atendente);
        
        System.out.println(FisicaDAO.grava(fisica));
    }
    
}
