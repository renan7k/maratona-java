package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Jogador;

//ASSOCIAÇÃO É O RELACIONAMENTO ENTRE 2 OBJETOS, BEM PARECIDO COM BANCO DE DADOS
public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Dunga");
        //Queremos salvar todos eles dentro de um array.
        //Jogador[] jogadores = new Jogador[3];
        // Então, estamos criando um array com referências a 3 objetos independentes
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
