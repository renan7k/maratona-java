package academy.devdojo.maratona.javacore.Dconstrutores.test;


import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 14, "Ação", "Production IG"); //passando o nome, pois foi listado no construtor

        Anime anime2 = new Anime(); //esse objeto usando o 2º construtor
        anime.imprime();
        anime2.imprime();
    }
}
