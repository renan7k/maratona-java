package academy.devdojo.maratona.javacore.Hheranca.dominio;

//Herança - Quando uma classe "é/pertence" uma outra classe. Ex.: Um funcionario é uma pessoa
//E tem caracteristicas iguais, no caso os atributos nome, cpf, endereco
//é usado quando quer usar funcionalidades de uma classe, ou quando quer atender ao polimorfismo
public class Funcionario extends Pessoa{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
