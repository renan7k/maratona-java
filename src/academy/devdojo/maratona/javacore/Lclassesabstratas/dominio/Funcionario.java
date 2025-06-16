package academy.devdojo.maratona.javacore.Lclassesabstratas.dominio;

// Classe abstrata - Evita que se crie um objeto dessa classe em específico, somente das classes filhas
//Isso para evitar por exemplo, que se crie um funcionario sem um "perfil" (gerente, dev)


public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo..");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    //Criamos um metodo abstrato, para ser definido em cada classe, o percentual do bonus
    //metodo abstrato nn possui corpo
    //metodos abstrados só podem existir dentro de classes abstratas
    //mas classes abstratas, podem ter metodos abstratos e concretos
    public abstract void calculaBonus();
}
