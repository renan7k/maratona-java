package academy.devdojo.maratona.javacore.Wnio.test;


import java.nio.file.Path;
import java.nio.file.Paths;

//relativize é, dodos 2 paths, como faz para chegar no path 2 a partir do pah 1
public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/renan");
        Path clazz = Paths.get("/home/renan/devdojo/OlaMundo.java");
        //quero saber, dado o diretório (dir), como que faço para chegar na classe, onde ela se encontra
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz); //nesse caso, só precisou acessar umas pastas para "frente"

        Path absoluto1 = Paths.get("/home/renan");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/renan/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20250707");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1)); //voltar 2 diretórios
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
        System.out.println("5 "+relativo1.relativize(relativo2));

    }
}
