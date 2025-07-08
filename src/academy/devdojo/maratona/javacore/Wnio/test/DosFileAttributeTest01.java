package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/teste.txt");

        if (Files.notExists(path)) Files.createFile(path);

        //Desafio: deixar o arquivo oculto, e read only
        Files.setAttribute(path, "dos:hidden",true);
        Files.setAttribute(path, "dos:readonly",true);

        Files.setAttribute(path, "dos:hidden",false);
        Files.setAttribute(path, "dos:readonly",false);

        //Verificando com a classe dos
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        //alterando com dos - sempre usar o q termina com view
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

    }
}
