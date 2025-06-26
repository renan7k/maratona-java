package academy.devdojo.maratona.javacore.Oexception.exception.dominio;

public class Funcionario extends Pessoa{

    //quando estamos sobrescrevendo um metodo, nn somos obrigado a declarar as mesmas exceções q aquele metodo está declarando
    //Ou pode colocar apenas 1 das exceções
    // e nn pode adicionar exceptions mais genéricos do q o declarado no metodo original
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando funcionário");
    }
}
