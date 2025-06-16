package academy.devdojo.maratona.javacore.Minterfaces.dominio;

//Quando tiver trabalhando com interface, nn usamos "extends", e sim "implements"
public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
