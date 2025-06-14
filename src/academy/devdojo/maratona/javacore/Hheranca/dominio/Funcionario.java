package academy.devdojo.maratona.javacore.Hheranca.dominio;

//Herança - Quando uma classe "é/pertence" uma outra classe. Ex.: Um funcionario é uma pessoa
//E tem caracteristicas iguais, no caso os atributos nome, cpf, endereco
//é usado quando quer usar funcionalidades de uma classe, ou quando quer atender ao polimorfismo
public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }
    // Como a classe mae possui um construtor com nome, se faz necessario, nas subClasses, mapear esse construtor
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    //sobrescrita - escrever um metodo com a mesma assinatura que a classe mae(pessoa) tem
    //isso é necessario, pois o imprime do peessoa, nao possui o atributo salario por exemplo
    public void imprime() {
        //executando tudo do metodo imprime de salario, depois executando o resto do metodo especifico para funcionario
        super.imprime();  //toda vez que usar a palavra super, se refere ao objeto mais generico, objeto da super classe, nesse caso pessoa
        System.out.println(this.salario);
    }
    public void relatorioPagamento(){
        //nesse caso, pode usar o this.nome , pq o modificador de acesso é o protected
        System.out.println("Eu "+this.nome + " recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
