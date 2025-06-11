package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    //metodo dentro do objeto Estudante
    public void imprime (){
        System.out.println("---------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
