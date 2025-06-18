package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

//Neste exercício, precisamos acrescentar a data de validade no tomate
//Porém, esse atributo pertence apenas ao objeto tomate, não a superClasse produto
//sendo assim, não conseguimos chamar produto.getDataValidade. Por isso, estamos criando o objeto com referencia a Tomate
public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("25-06-2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
