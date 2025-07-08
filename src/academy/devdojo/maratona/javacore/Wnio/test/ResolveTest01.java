package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/renan");//este é um caminho relativo, pois nn tem a primeira barra inicial. O caminho anterior, é igual onde se encontra a classe
        Path arquivo = Paths.get("dev/arquivo.txt");
        //aqui surge um problema, a pasta dev nn está na raiz do maratona-java. Para isso precisamos resolver:
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/renan");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println("1 "+absoluto.resolve(relativo));
        System.out.println("2 "+absoluto.resolve(file));
        System.out.println("3 "+relativo.resolve(absoluto)); //nn resolve, pq já é passado o absouluto
        System.out.println("4 "+relativo.resolve(file));
        System.out.println("5 "+file.resolve(absoluto)); //nn resolve, pq já é passado o absouluto
        System.out.println("6 "+file.resolve(relativo));
    }
}
