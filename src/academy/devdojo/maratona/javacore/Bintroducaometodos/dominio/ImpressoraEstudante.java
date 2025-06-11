package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){ //variável de refer. Estudante - ainda nn tem o objeto, pq ele vai vir como argumento
        System.out.println("-----------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
