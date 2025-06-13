package academy.devdojo.maratona.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //BLOCO DE INICIALIZAÇÃO STATIC - é executado apenas 1 vez, e não a cada instância da classe
    // 0 - Bloco de inicialização(static) é executado quando a JVM carregar a classe
    // 1º - Alocado espaco em memória por objeto
    //2º Cada atributo de classe é criado e inicializado com valores default, ou o que for passado
    //3º Bloco de inicialização é executado
    //4º Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
