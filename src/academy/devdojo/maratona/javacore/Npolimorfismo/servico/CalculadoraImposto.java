package academy.devdojo.maratona.javacore.Npolimorfismo.servico;

import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratona.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    //se vc nn estiver acessando nenhum atributo de classe, vc pode transformar os seus métodos em static
//    public static void calcularImpostoComputador (Computador computador){
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " +computador.getNome());
//        System.out.println("Valor: " +computador.getValor());
//        System.out.println("Imposto a ser pago: " +imposto);
//    }
//
//    public static void calcularImpostoTomate (Tomate tomate){
//        System.out.println("Relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " +tomate.getNome());
//        System.out.println("Valor: " +tomate.getValor());
//        System.out.println("Imposto a ser pago: " +imposto);
//    }

    //Substituímos os 2 métodos acima, para evitar duplicação de código, e para isso passamos a usar a superClasse
    // o metodo vai servir para qualquer produto
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);

        //Antes temos q verificar se a instância é do tipo tomate, e para isso existe o instanceof
        // no caso, se o objeto(produto) for do tipo tomate, irá executar o bloco
        if(produto instanceof Tomate){
            //(CAST explicito) - objeto produto virar objeto tomate
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: "+ tomate.getDataValidade());
        }
    }
}
