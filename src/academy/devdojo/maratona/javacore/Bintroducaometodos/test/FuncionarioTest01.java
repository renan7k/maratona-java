package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.FuncoesFuncionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        FuncoesFuncionario funcoes = new FuncoesFuncionario();

        funcionario.nome = "Joasley Costa";
        funcionario.idade = 54;
        funcionario.salarios = new double[]{2000, 3000, 4000};

        funcoes.imprime(funcionario);
        funcoes.mediaSalarial(funcionario);
    }
}
