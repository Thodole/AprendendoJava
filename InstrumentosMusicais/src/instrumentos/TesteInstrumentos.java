/*
 * Escola Técnica de Brasília;
 * Disciplina: Linguagem e Técnicas de Programação II;
 * Professor: Vinícius Cruz;
 * Aluno: Glauder Moura;
 * Atividade: Modelo de Herança (Instrumentos musicais).
 */
package instrumentos;

/**
 *
 * @author Thodole
 */
public class TesteInstrumentos {

    public static void main(String[] args) {
        GaitaDeFoles gtfl = new GaitaDeFoles("Harmonicas", "Escocesa", "Rouco", 120, "Soprete", 19);
        System.out.println(gtfl + "\n");
        
        Flugelhorn flug = new Flugelhorn(3, false, "Dourada", "Melódica", "Metal aveludado", 108, "Bocal", 27);
        System.out.println(flug + "\n");
        
        Atabaque atab = new Atabaque("Grande", "Clara (amadeirado)", "Grave", 65);
        System.out.println(atab + "\n");
        
        Viola viol = new Viola("Avermelhado (carvalho)", "Crina de cavalo", "Contralto / Tenor", "Médio", 4, "Melódica", "Rouco, meio grave", 100);
        System.out.println(viol);
    }
}
