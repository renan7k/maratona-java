package academy.devdojo.maratona.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //CONSTUTOR
    // A vantagem dos construtores, é que te forçam a seguir algumas regras. Ex: não tem como criar o anime sem nome
    // se tiver o VOID, se torna um metodo , e não um contrutor
    // nn tem como chamar o construtor fora de um construtor (this())
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); //forma de chamar outro metodo construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero); //forma de chamar outro metodo construtor
        this.estudio = estudio;
    }
    //SOBRECARGA DE CONSTRUTOR - 1 com todos os dados , e o outro vazio
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
