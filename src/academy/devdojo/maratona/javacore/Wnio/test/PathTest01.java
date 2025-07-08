package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

//Para trabalhar com NIO, é necessário um path (nn um file)
public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Desenvolvimento\\JAVA\\maratona-java\\pasta2\\arquivo.txt");
        Path p2 = Paths.get("C:\\Desenvolvimento\\JAVA\\maratona-java\\pasta2","arquivo.txt");
        Path p3 = Paths.get("C:", "Desenvolvimento","JAVA","maratona-java","pasta2","arquivo.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
    }
}
