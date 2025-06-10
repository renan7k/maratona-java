package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Aldair";
        professor.idade = 58;
        professor.sexo = 'M';
        System.out.println("Nome:"+ professor.nome + " idade:" + professor.idade + " sexo:" + professor.sexo);
    }
}
