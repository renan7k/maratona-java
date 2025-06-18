package academy.devdojo.maratona.javacore.Minterfaces.dominio;

//Quando tiver trabalhando com interface, nn usamos "extends", e sim "implements"
//quando falamos de classes , nn podemos estender mais de 1, mas interface permite
//e quando mapeamos um metodo na interface, somos obrigado a implementado nas subclasses (exceção dos métodos default)
public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){ // nn pode ser sobrescrito
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
