package academy.devdojo.maratona.javacore.Npolimorfismo.test;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Televisão;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Mac X", 11000);
        Tomate tomate = new Tomate("Tomate siciliano", 10);
        Televisão tv = new Televisão("Samsung 49'", 3000);
        //Neste caso não instanciamos a classe de CalculadoraImposto, pois os métodos estão 'static'

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
