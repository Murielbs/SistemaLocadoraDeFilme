package principal;

import model.Cliente;
import model.Filme;
import conta.Conta;

public class Principal {
    public static void main(String[] args) {
        Filme[] filmes = new Filme[10];
        filmes[0] = new Filme("Star Wars", 3.5);
        filmes[1] = new Filme("Jurassic Park", 3.5);
        filmes[2] = new Filme("X-Men_First_Class", 5.0);
        filmes[3] = new Filme("Matrix", 4.0);
        filmes[4] = new Filme("Avatar", 4.5);
        filmes[5] = new Filme("Titanic", 4.0);
        filmes[6] = new Filme("O Poderoso Chefão", 5.0);
        filmes[7] = new Filme("Interstellar", 5.5);
        filmes[8] = new Filme("Gladiador", 4.5);
        filmes[9] = new Filme("O Rei Leão", 3.0);

        Cliente[] clientes = new Cliente[5];
        clientes[0] = new Cliente(" João Silva", "1111111111"); // nome e cpf
        clientes[1] = new Cliente("Muriel Bezerra", "2222222222");
        clientes[2] = new Cliente("João Souza", "3333333333");
        clientes[3] = new Cliente("Maria Santos", "4444444444");
        clientes[4] = new Cliente("Carlos Silva", "5555555555");

        Conta[] contas = new Conta[5];
        for (int i = 0; i < clientes.length; i++) {
            contas[i] = new Conta(clientes[i]);
        }

        // Locação de fil para cada cliente
        contas[0].locarFilmes(new Filme[]{filmes[0], filmes[1]});
        contas[0].locarFilmes(new Filme[]{filmes[2]});
        contas[0].locarFilmes(new Filme[]{filmes[3], filmes[4], filmes[5]});
        contas[0].locarFilmes(new Filme[]{filmes[6]});

        contas[1].locarFilmes(new Filme[]{filmes[1], filmes[7]});
        contas[1].locarFilmes(new Filme[]{filmes[8], filmes[9]});
        contas[1].locarFilmes(new Filme[]{filmes[0], filmes[2], filmes[3]});
        contas[1].locarFilmes(new Filme[]{filmes[4]});

        contas[2].locarFilmes(new Filme[]{filmes[5], filmes[6]});
        contas[2].locarFilmes(new Filme[]{filmes[7]});
        contas[2].locarFilmes(new Filme[]{filmes[8], filmes[9], filmes[0]});
        contas[2].locarFilmes(new Filme[]{filmes[1], filmes[2]});

        contas[3].locarFilmes(new Filme[]{filmes[3], filmes[4], filmes[5]});
        contas[3].locarFilmes(new Filme[]{filmes[6]});
        contas[3].locarFilmes(new Filme[]{filmes[7], filmes[8]});
        contas[3].locarFilmes(new Filme[]{filmes[9], filmes[0]});

        contas[4].locarFilmes(new Filme[]{filmes[1], filmes[2], filmes[3]});
        contas[4].locarFilmes(new Filme[]{filmes[4], filmes[5]});
        contas[4].locarFilmes(new Filme[]{filmes[6], filmes[7]});
        contas[4].locarFilmes(new Filme[]{filmes[8], filmes[9], filmes[0]});

        for (Conta conta : contas) {
            System.out.println(conta.extratoHistorico());
        }
    }
}
