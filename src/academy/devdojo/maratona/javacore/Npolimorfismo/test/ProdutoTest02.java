package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        //variável de referência é a superClasse produto
        //e o objeto é uma subClasse
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome()); //Quando enviamos produto.getNomme, quem executa é sempre o objeto (Computador)
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------------------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome()); //Quando enviamos produto.getNomme, quem executa é sempre o objeto (tomate)
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
