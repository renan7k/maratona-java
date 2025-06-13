package academy.devdojo.maratona.javacore.Eblocosinicializacao.dominio;

import java.sql.SQLOutput;

public class Anime {
    private String nome;
    private int[] episodios;

    //BLOCO DE INICIALIZAÇÃO (de instância ou estático) - GERALMENTE DPS DOS ATRIBUTOS E ANTES DOS CONSTRUTORES
    //Ele é executado INDEPENDENTE DO construtor que chamar
    // Quaando criamos um objeto: 1º - Alocado espaco em memória por objeto
    //2º Cada atributo de classe é criado e inicializado com valores default, ou o que for passado
    //3º Bloco de inicialização é executado
    //4º Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios){
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
