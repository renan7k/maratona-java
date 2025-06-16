package academy.devdojo.maratona.javacore.Lclassesabstratas.test;

import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Lclassesabstratas.dominio.Gerente;
import org.w3c.dom.ls.LSOutput;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro", 2000); nesse caso nn funcionaria, pq funcionario é uma classe abstrata
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Naruto", 40000);

        //System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        //metodo da classe abstrata avê(pessoa), sobrescrita pela classe pai (Funcionario)
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
