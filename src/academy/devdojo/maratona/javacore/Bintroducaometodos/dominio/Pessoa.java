package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    //Toda vez que estiver criando um metodo para colocar um valor na memoria, usar o set
    public void setNome(String nome){
       this.nome = nome; // o this é necessário, para referenciar o atributo da classe, nn o q venho como parâmetro
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    //com isso, tbm é necessário um metodo para recuperar a informação: get
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
