package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File, - trabalhar com o arquivo em si
// FileWriter, - escrever um arquivo (não é tão otimizada)
// FileReader, - leitura de arquivo
// BufferedWriter, - escrita em arquivo, trabalhando com dados em meória
// BufferedReader - ler arquivo em memória
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("Testando a classe FileWriter, escrita de arquivo");
            fw.flush(); //cuspindo tudo q tem dentro do buffer
            fw.close(); //sempre q trabalha com recurso do SO, é necessário fechar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
