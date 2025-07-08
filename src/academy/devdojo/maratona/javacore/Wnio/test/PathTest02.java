package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");

        //a diferença de files é que, se for executado novamente e o diretório/arquivo já existir, lança uma exceção
        //para controlar isso, dá para usar a opção exists/not exists
        //NIO é uma classe mais nova, mas por coesão, se acaba sendo um pouco mais complicada q a file
        if(Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath); //criando diretório
        }
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath); //se as pastas pai nn existir, ele cria
        Path filePath = Paths.get(subPastaPath.toString(), "file.text");

        if(Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        //renomeando e movendo arquivo
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
