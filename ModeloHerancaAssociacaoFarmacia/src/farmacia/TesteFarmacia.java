/*
 * Escola Técnica de Brasília;
 * Disciplina: Linguagem e Técnicas de Programação II;
 * Professor: Vinícius Cruz;
 * Aluno: Glauder Moura;
 * Atividade: Modelo de Herança e Associação de classes.
 */
package farmacia;

/**
 *
 * @author Thodole
 */
public class TesteFarmacia {

    public static void main(String[] args) {
        Compra compra = new Compra(001, "30/03/2023", 22.50,
                            new Pagamento("Cartão de crédito"),
                            new Cliente("123.456.789-00", "Saul Merdeiros", "25/12/1999",
                                new Receita("27/03/2023", 25.00,
                                    new Medicamento(25.0, "38945", "JavaForManos", "Vermelha", "Pobreza Brasileira",
                                        new Fornecedor("172635480001-74", "Regis Monteiro", "PQP 24, Ceilândia")
                                    ),
                                    new Farmaceutico("Mateus Vale", 9857, 2000.0, "Técnico Incompleto")
                                ),
                                new Pedido(967, 25.0,
                                    new Atendente("Lariça Çelva", 928457, 1500.0, 23),
                                    new Perfumaria(14.0, "9865", "Python Hair", "Condicionadores", 2.0,
                                        new Fornecedor("934856290001-58", "Gustavo Guanabara", "Rio de Xaneiro")
                                    )
                                )
                            )
                        );
        System.out.println(compra);
    }
}