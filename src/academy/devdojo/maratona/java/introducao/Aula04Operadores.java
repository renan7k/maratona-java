package academy.devdojo.maratona.java.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero1);
        //Java entende o + de forma diferente em cada situação
        //Na primeira saída é soma, na debaixo, estáa juntando pois é depois da String
        System.out.println("Valor é: " + numero2 + numero1);

        //Divisão entre 2 números inteiros sempre será um número inteiro
        // por isso, usamos o cast, para retornar o quebrado
        double resultado1 = numero1 / (double) numero2;
        System.out.println(resultado1);
        System.out.println("-------------------------------------------------");

        //Operadores de resto % - usado por ex., para indicar se é o número é par ou ímpar
        // Se o resto da divisão for 0 é par, se não for, é impar
        //Sempre retorna um valor numérico
        int resto = 20 % 2;
        System.out.println(resto);
        System.out.println("-------------------------------------------------");

        //Operadores  - retornam valor booleano (< > <= >= == !=)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezDiferenteOnze = 10 != 11;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezDiferenteOnze " + isDezDiferenteOnze);

        // Operadores lógicos (&& (AND), ||(OR), !(NOT) )
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        System.out.println(isDentroDaLei);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel = contaCorrente > valorPlaystation || contaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel "+isPlaystation5Compravel);

        //Operadores de atribuição (= , += , -= , *= , /= e %=)
        double bonus = 1800;
        bonus += 1000;
        //Igual a: bonus = bonus + 1000;
        System.out.println(bonus);

        //Incrementações
        int contador = 0;
        contador += 1;
        contador++;
        contador--;

        System.out.println(contador);
    }
}
