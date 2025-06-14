package academy.devdojo.maratona.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    //constante - atributo que não quer q seja alterado. Uma vez criado, vai permancer daquela forma
    //usa a palavra final, e é uma prática usar letra maiúscula separada por "_"
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}