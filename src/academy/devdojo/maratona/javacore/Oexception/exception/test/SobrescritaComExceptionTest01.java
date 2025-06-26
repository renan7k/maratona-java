package academy.devdojo.maratona.javacore.Oexception.exception.test;

import academy.devdojo.maratona.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratona.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }
}
