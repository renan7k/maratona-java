package academy.devdojo.maratona.javacore.Hheranca.test;

import academy.devdojo.maratona.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratona.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua armando");
        endereco.setCep("06078-452");
        Pessoa pessoa = new Pessoa("Agnaldo");
        //pessoa.setNome();
        pessoa.setCpf("98234568712");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("--------------");
        Funcionario funcionario = new Funcionario("Hugo");
        //os metodos abaixo, foram herdados da classe pessoa
        //funcionario.setNome();
        funcionario.setCpf("78532146987");
        funcionario.setEndereco(endereco);

        funcionario.setSalario(20000);
        funcionario.imprime();
    }
}
