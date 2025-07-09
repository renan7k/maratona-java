package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:**.bkp"); //match para validar se o arquivo termina como .bkp
        matches(path2, "glob:**/*.{bkp,txt,java}"); //match para validar se o arquivo termina com uma das 3 opções

        System.out.println("Se o formato do arquivo tem 3 letras?");
        matches(path1, "glob:**.???");
        matches(path2, "glob:**.???");
        matches(path3, "glob:**.???");
    }
    private static void matches (Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
