package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}


//ela permite navegar entre as pastas
public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListJavaFiles());
    }
}
