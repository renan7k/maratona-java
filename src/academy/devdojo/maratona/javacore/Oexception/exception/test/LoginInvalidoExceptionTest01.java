package academy.devdojo.maratona.javacore.Oexception.exception.test;

import academy.devdojo.maratona.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    //lançando exceção do tipo checked, é preciso declarar na assinatura do metodo
    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);

        String usernameDb = "goku";
        String senhaDB = "ssj";

        System.out.println("Usuário:");
        String usernameDigitado = input.nextLine();
        System.out.println("Senha:");
        String senhaDigitada = input.nextLine();

        if(!usernameDb.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
