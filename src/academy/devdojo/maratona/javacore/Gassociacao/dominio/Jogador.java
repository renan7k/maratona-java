package academy.devdojo.maratona.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;
    public void imprime() {
        System.out.println(this.nome);
        if(time != null){ //if, pois o time ainda pode não existir
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
