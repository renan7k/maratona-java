package academy.devdojo.maratona.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratona.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Lebron James";
        estudante.idade = 43;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); //isso imprime o endereço de memória, pois é uma variável de referência
    }
}
