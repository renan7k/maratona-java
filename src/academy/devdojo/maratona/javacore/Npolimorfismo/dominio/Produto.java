package academy.devdojo.maratona.javacore.Npolimorfismo.dominio;

//Criamos produto como abstrata, pois esse produto em si nn deve existir, nn podemos instanciar.
// Apenas as subclasses(produtos concretos) serão instanciadas
public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
