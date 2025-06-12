package academy.devdojo.maratona.javacore.Csobrecargametodos.test;

import academy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //Inicializando usando os metodos SET
//        anime.setNome("Naruto");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        //Inicializando usando o metodo init (agrupando todos os parametros)
        //anime.init("Naruto", "TV", 14);
        anime.init("Naruto", "TV", 14, "Ação");
        anime.setGenero("Ação");
        anime.imprime();
    }
}
