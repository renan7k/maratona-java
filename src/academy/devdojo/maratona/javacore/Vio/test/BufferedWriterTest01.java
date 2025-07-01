package academy.devdojo.maratona.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// É a melhor opção para trabalhar com arquivos grandes, mais performática
public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt"); //criando o file, e fazendo a referência para esse arquivo
        try {
            FileWriter fw = new FileWriter(file); //estamos passando a referência para o fileWritter
            BufferedWriter bw = new BufferedWriter(fw); //estamos encapsulando o fileWriter dentro de um bufferedWriter
            bw.write("Testando a classe FileWriter, escrita de arquivo");
            bw.newLine();
            bw.flush(); //cuspindo tudo q tem dentro do buffer
            bw.close(); //sempre q trabalha com recurso do SO, é necessário fechar
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
