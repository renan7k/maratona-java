package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class Filetest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();//criando diretório
        System.out.println(isDiretorioCreated);

        //para criar o arquivo dentro do diretório, tem 2 formas: passando o path, ou passando a referência do diretório criado acima
       // File fileArquivoDiretorio = new File("C:\\Desenvolvimento\\JAVA\\maratona-java\\pasta\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);

        //renomeando arquivo
        File fileRenamed = new File( fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        //renomeando diretório
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
