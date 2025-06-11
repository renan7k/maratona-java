package academy.devdojo.maratona.javacore.Bintroducaometodos.test;

import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratona.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Jairo";
        estudante01.idade = 17;
        estudante01.sexo = 'M';

        estudante02.nome = "Ana";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
        //Usando o metodo que está dentro do próprio objeto Estudante
        //Deferente do test01, que usa o metodo da classe ImpressoraEstudante
        estudante01.imprime();
        estudante02.imprime();
    }
}
