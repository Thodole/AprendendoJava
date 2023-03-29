package empresa.personnel;

public class TestePessoa {
    
    public static void main(String[] args) {
        Fornecedor Fornec = new Fornecedor("João Vítor", "Santinha",
                "00.000.000/0001-02", "Brasil");
        System.out.println(Fornec + "\n\n");
        Vendedor Vendor = new Vendedor("Lariça Batista", "Samamba", 69696,
                1980.0, "Paçocas", 100.0, 1200.0);
        System.out.println(Vendor + "\n\n");
        Diretor Direc = new Diretor("Saul Medeiros", "Buraco Fundo II", 242424, 
        4500.0, 1500.0);
        System.out.println(Direc + "\n\n");
        PessoaFisica PF = new PessoaFisica("Gabriel Perex", "CeiLondres", 20,
                "000.000.000-00");
        System.out.println(PF + "\n\n");
        PessoaJuridica PJ = new PessoaJuridica("Glauder Moura", "WackGama", 35,
                "00.000.000/0001-01");
        System.out.println(PJ);
    }
}