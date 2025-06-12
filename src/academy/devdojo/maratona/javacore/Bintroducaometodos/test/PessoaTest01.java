package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //Usando o private, já nn é possível atribuir valor da forma abaixo:
        //pessoa.nome = "Jiraya";
        //É necessário criar um metodo
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
        System.out.println("-----------------------------------");
        //com isso, tbm é necessário um metodo para recuperar a informação: get
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
