package herancaEletro;

public class TesteEletrodomesticoII {

    public static void main(String[] args) {
        
        Fogao FogaoDomestico = new Domestico(7412, 32, "Brastemp", "Adof", 5, 82.0, "domestico");
        System.out.println(FogaoDomestico);
        Fogao FogaoIndustrial = new Industrial(7413, 25, "Brastemp", "Oadof", 4, 90.0, 110.0);
        System.out.println(FogaoIndustrial);
        MaquinaLavar MaquinaDeLavar = new MaquinaLavar(7414, 18, "Brastemp", "ahnidoF", "Vertical", "Branca");
        System.out.println(MaquinaDeLavar);
        Televisao TV = new Televisao(7415, 6, "Samsung", "Kcuf", 42, "Smart");
        System.out.println(TV);
    }
}