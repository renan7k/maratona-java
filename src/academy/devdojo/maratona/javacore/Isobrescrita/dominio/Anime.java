package academy.devdojo.maratona.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    //tooString é um metodo da classe object, q pode ser sobescrito em nossas classes por conta da regra da herança
    //no caso abaixo, estamos sobrescrevendo o metodo tooString
    @Override //para ter ctz q estamos sobrescrevendo
    public String toString(){
        return "Anime: " +this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
