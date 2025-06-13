package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua dos guaxinins");
        Aluno aluno = new Aluno("Geraldo Bispo", 18);
        Professor professor = new Professor("Adelia", "Física");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Bháskara", alunosSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
