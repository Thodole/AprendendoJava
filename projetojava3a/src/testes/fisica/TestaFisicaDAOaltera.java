package testes.fisica;

import modelo.Atendente;
import modelo.Fisica;
import persistencia.FisicaDAO;

public class TestaFisicaDAOaltera {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Fisica fisica = new Fisica();

        fisica.setNome("Everaldina de Sousa");
        fisica.setIdade(46);
        
        Atendente atendente = new Atendente();
        atendente.setMatr(1);
        fisica.setAtendente(atendente);
        
        fisica.setCpf("99999999999");
        
        System.out.println(FisicaDAO.altera(fisica));
    }
    
}
