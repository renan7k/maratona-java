package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Jairo";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01); // Aqui estamos enviando como parâmetro, uma var. de referência, com o local da memória
        impressora.imprime(estudante02);
    }
}
