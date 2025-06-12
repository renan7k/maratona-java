package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Calculadora;

/// DESAFIO: Criar uma calculadora que valida se o número é primo ou não.| Retornar true se for, false se não

//DESAFIO2: Criar uma calculadora que receba uma lista/array, e retorne toda essa lista * 2

public class CalculadoraTest06Desafio {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Desafio 1: --------------------------");
        System.out.println(calculadora.numeroPrimo(7));

        System.out.println("Desafio 2: --------------------------");
        int[] numeros = {15, 30, 220};
        calculadora.arrayX2(numeros);

    }
}
