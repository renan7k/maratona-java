package academy.devdojo.maratona.javacore.Minterfaces.test;

import academy.devdojo.maratona.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratona.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();


        databaseLoader.checkPermission(); //metodo sobrescrito na subclasse
        fileLoader.checkPermission(); //metodo default da interface

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
