package academy.devdojo.maratona.javacore.Gassociacao.test;

import academy.devdojo.maratona.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratona.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Adenor");
        Professor professor2 = new Professor("Giralda");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("EMEF João Correa", professores);
        escola.imprime();
    }
}
