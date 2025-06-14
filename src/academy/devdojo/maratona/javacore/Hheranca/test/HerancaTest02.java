package academy.devdojo.maratona.javacore.Hheranca.test;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2º - Alocado espaco em memória por objeto da superclasse (= classe pai)
    // 3º Cada atributo da superclasse é criado e inicializado com valores default, ou o que for passado da classe pai
    // 4º Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5º Construtor da superclasse é executado

    // 6º - Alocado espaco em memória por objeto da subclasse (= classe filha)
    // 7º Cada atributo da subclasse é criado e inicializado com valores default, ou o que for passado da classe filha
    // 8º Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9º Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("José");
    }
}
